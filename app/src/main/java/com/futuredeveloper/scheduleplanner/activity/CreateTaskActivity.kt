package com.futuredeveloper.scheduleplanner.activity

import android.R.menu
import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuBuilder
import androidx.room.Room
import com.futuredeveloper.scheduleplanner.R
import com.futuredeveloper.scheduleplanner.classes.AlarmService
import com.futuredeveloper.scheduleplanner.database.TaskDatabase
import com.futuredeveloper.scheduleplanner.database.TaskEntity
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit


class CreateTaskActivity : AppCompatActivity() {
    private var timeButton: Button? = null
    private var hour = 0
    private var minute:Int = 0
    private lateinit var time: String
    lateinit var title: String
    private lateinit var description: String
    private lateinit var titleEditText: EditText
    private lateinit var descriptionEditText: EditText
    private lateinit var notesDescription: String
    private lateinit var taskText: TextView
    private var timetype = "AM"
    private lateinit var saveTask: FloatingActionButton
    private var date: String? = ""
    private var scheduleTitle = ""
    private var timeInMillis: Long = 0
    private lateinit var alarmService: AlarmService
    private lateinit var sharedPreference: SharedPreferences
    private var repeatBoolean = false
    private var mInterstitialAd: InterstitialAd? = null
    private lateinit var alarm: ImageView
    private var notify:Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_task)

        val adRequest = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-4058900641259972/9039550958", adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                Log.d(ContentValues.TAG, adError?.message)
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                Log.d(ContentValues.TAG, "Ad was loaded.")
                mInterstitialAd = interstitialAd
            }
        })

        sharedPreference = getSharedPreferences("schedule_planner_preference", MODE_PRIVATE)
        val alarmNo = sharedPreference.getInt("alarmNo", 0)
        if(alarmNo == Int.MAX_VALUE){sharedPreference.edit().putInt("alarmNo", 0).apply()}

        taskText = findViewById(R.id.task_text)
        timeButton = findViewById(R.id.timeButton)
        saveTask = findViewById(R.id.save_icon)
        titleEditText = findViewById(R.id.title)
        descriptionEditText = findViewById(R.id.description)
        alarm = findViewById(R.id.alarmIcon)

        repeatBoolean = intent.getBooleanExtra("repeat",false)
        if(repeatBoolean){
            taskText.text = "Daily Repeating Task "
        }

        val taskId = intent.getStringExtra("taskId")
        if(taskId != null){
            timeButton?.text = intent.getStringExtra("taskTime").toString()
            titleEditText.setText(intent.getStringExtra("taskTitle").toString())
            descriptionEditText.setText(intent.getStringExtra("taskDescription").toString())


            notify = Integer.parseInt(taskId[taskId.length-1] +"")
            when(notify){
                0 -> alarm.setImageResource(R.drawable.actionbar_notification_off)
                1 -> alarm.setImageResource(R.drawable.actionbar_notification)
                2 -> alarm.setImageResource(R.drawable.actionbar_loud_notification)
            }
        }

        date = intent.getStringExtra("date")
        notesDescription = intent.getStringExtra("notesDescription").toString()
        scheduleTitle = intent.getStringExtra("title").toString()

        //Default Time in millis
        val calendar = Calendar.getInstance()
        val date1 = makeDate2(date.toString()) + " 00:00:00"
        val sdf = SimpleDateFormat("dd-M-yyyy hh:mm:ss")
        try {
            val date: Date = sdf.parse(date1)
            calendar.time = date
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        println(calendar.timeInMillis)
        timeInMillis = calendar.timeInMillis
        //

        alarm.setOnClickListener {
            val popup = PopupMenu(this, it)
            val inflater = popup.menuInflater
            inflater.inflate(R.menu.alarm_menu, popup.menu)

            popup.setOnMenuItemClickListener { item ->
                when (item.itemId){
                    R.id.off -> {
                        notify = 0
                        alarm.setImageResource(R.drawable.actionbar_notification_off)
                        true
                    }
                    R.id.notification -> {
                        notify = 1
                        alarm.setImageResource(R.drawable.actionbar_notification)
                        true
                    }
                    R.id.alarm -> {
                        notify = 2
                        alarm.setImageResource(R.drawable.actionbar_loud_notification)
                        true
                    }

                    else -> false
                }
            }

            try {
                val fieldMPopup = PopupMenu::class.java.getDeclaredField("mPopup")
                fieldMPopup.isAccessible = true
                val mPopup = fieldMPopup.get(popup)
                mPopup.javaClass
                    .getDeclaredMethod("setForceShowIcon", Boolean::class.java)
                    .invoke(mPopup, true)
            } catch (e: Exception){
                Log.e("Main", "Error showing menu icons.", e)
            } finally {
                popup.show()
            }
        }

        saveTask.setOnClickListener {
            if (titleEditText.text.isEmpty() && descriptionEditText.text.isEmpty()) {
                Toast.makeText(this, "Please enter any Title or Description", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val calendar = Calendar.getInstance()
                hour = Integer.parseInt(timeButton?.text?.subSequence(0, 2).toString())
                minute = Integer.parseInt(timeButton?.text?.subSequence(3, 5).toString())
                timetype = (timeButton?.text?.subSequence(6, 8).toString())
                println("hour $hour, minute $minute, timetype $timetype" )

                if (timetype.uppercase() == "PM") {
                    if (hour != 12) {
                        hour += 12
                    }
                } else if (timetype.uppercase() == "AM") {
                    if (hour == 12) {
                        hour = 0
                    }
                }

                println("hour $hour, minute $minute, timetype $timetype" )

                val date1: String
                if (repeatBoolean) {
                    date1 = makeDate2(getTodaysDate()) + " $hour:$minute:00"
                } else {
                    date1 = makeDate2(date.toString()) + " $hour:$minute:00"
                }

                println(date1)
                val sdf = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
                try {
                    val date: Date = sdf.parse(date1)
                    calendar.time = date
                } catch (e: ParseException) {
                    e.printStackTrace()
                }
                timeInMillis = calendar.timeInMillis
                println(timeInMillis)
                time = android.text.format.DateFormat.format("hh:mm aa", calendar).toString()
                title = titleEditText.text.toString()
                description = descriptionEditText.text.toString()

                if (repeatBoolean) {
                    if (intent.getStringExtra("taskId") == null) {
                        sharedPreference.edit().putInt("alarmNo", alarmNo + 1).apply()

                        if(notify != 0) {

                            if (title == "") {
                                alarmService = AlarmService(this, alarmNo, "$time: $description", notify)
                            } else if (description == "") {
                                alarmService = AlarmService(this, alarmNo, "$time: $title", notify)
                            } else if (title == "" && description == "") {
                                alarmService = AlarmService(this, alarmNo, "$time ", notify)
                            } else {
                                alarmService = AlarmService(this, alarmNo, "$time: $title- $description", notify)
                            }

                            if (timeInMillis < System.currentTimeMillis()) {
                                val timeInMillis2 = timeInMillis
                                val cal = Calendar.getInstance().apply {
                                    if (timeInMillis2 != null) {
                                        this.timeInMillis =
                                            timeInMillis2 + TimeUnit.DAYS.toMillis(1)
                                    }
                                }
                                println(cal.timeInMillis)
                                setAlarm { alarmService.setRepetitiveAlarm(cal.timeInMillis) }
                            } else {
                                setAlarm { alarmService.setRepetitiveAlarm(timeInMillis) }
                            }
                        }

                        println("Created alarm ----------------$alarmNo")

                        val taskId = "R,$timeInMillis,$alarmNo,$notify"

                        val taskEntity = TaskEntity(
                            taskId,
                            time,
                            title,
                            description,
                            false
                        )

                        val async = DBAsyncTask1(
                            this,
                            taskEntity,
                            2
                        ).execute()

                        val result = async.get()
                        if (result) {
                            Toast.makeText(
                                this,
                                "Task Added Successfully!",
                                Toast.LENGTH_SHORT
                            ).show()
                            onBackPressed()
                        }
                    } else {
                        val id = intent.getStringExtra("taskId").toString()
                        val taskEntity = TaskEntity(
                            id,
                            time,
                            title,
                            description,
                            false
                        )
                        val sb1 = StringBuilder()
                        var count1 = 0
                        for (i in intent.getStringExtra("taskId").toString()) {
                            if (count1 >= 2) {
                                if (i == ',') break
                                sb1.append(i)
                            }
                            if (i == ',') count1++
                        }
                        val alarmNo1 = Integer.parseInt(sb1.toString())

                        val taskId = "R,$timeInMillis,$alarmNo1,$notify"
                        val taskEntityNew = TaskEntity(
                            taskId,
                            time,
                            title,
                            description,
                            false
                        )

                        val logout = androidx.appcompat.app.AlertDialog.Builder(it.context)
                        logout.setTitle("Update Task")
                        logout.setMessage("Task already exists! Do you want to update selected task?")
                        logout.setPositiveButton("Yes") { text, listener ->
                            var alarmService = AlarmService(this, alarmNo1, "",notify)
                            println("Canceled alarm ----------------$alarmNo1")
                            cancelAlarm { alarmService.cancelRepeatAlarm(timeInMillis) }

                            if(notify != 0) {
                                if (title == "") {
                                    alarmService =
                                        AlarmService(this, alarmNo1, "$time: $description",notify)
                                } else if (description == "") {
                                    alarmService = AlarmService(this, alarmNo1, "$time: $title",notify)
                                } else if (title == "" && description == "") {
                                    alarmService = AlarmService(this, alarmNo1, "$time ",notify)
                                } else {
                                    alarmService =
                                        AlarmService(this, alarmNo1, "$time: $title- $description",notify)
                                }

                                if (timeInMillis < System.currentTimeMillis()) {
                                    val timeInMillis2 = timeInMillis
                                    val cal = Calendar.getInstance().apply {
                                        if (timeInMillis2 != null) {
                                            this.timeInMillis =
                                                timeInMillis2 + TimeUnit.DAYS.toMillis(1)
                                        }
                                    }
                                    println(cal.timeInMillis)
                                    setAlarm { alarmService.setRepetitiveAlarm(cal.timeInMillis) }
                                } else {
                                    setAlarm { alarmService.setRepetitiveAlarm(timeInMillis) }
                                }
                            }

                            println("Created alarm ----------------$alarmNo1")

                            DBAsyncTask1(
                                this,
                                taskEntity,
                                3
                            ).execute()
                            val async = DBAsyncTask1(
                                this,
                                taskEntityNew,
                                2
                            ).execute()
                            if (async.get()) {
                               Toast.makeText(
                                    this,
                                    "Task updated!",
                                    Toast.LENGTH_SHORT
                                ).show()
                                onBackPressed()
                            }
                        }
                        logout.setNegativeButton("No") { text, listener ->

                        }
                        logout.create()
                        logout.show()
                    }
                } else if (intent.getStringExtra("taskId") == null) {
                    sharedPreference.edit().putInt("alarmNo", alarmNo + 1).apply()

                    if(notify != 0) {
                        if (title == "") {
                            alarmService =
                                AlarmService(this, alarmNo, "$time: $description", notify)
                        } else if (description == "") {
                            alarmService = AlarmService(this, alarmNo, "$time: $title", notify)
                        } else if (title == "" && description == "") {
                            alarmService = AlarmService(this, alarmNo, "$time ", notify)
                        } else {
                            alarmService =
                                AlarmService(this, alarmNo, "$time: $title- $description", notify)
                        }

                        if (timeInMillis > System.currentTimeMillis()) {
                            setAlarm { alarmService.setExactAlarm(timeInMillis) }
                            println("Created alarm ----------------$alarmNo")
                        }
                    }
                    val taskId = "$date,$timeInMillis,$alarmNo,$notify"

                    val taskEntity = TaskEntity(
                        taskId,
                        time,
                        title,
                        description,
                        false
                    )

                    val async = DBAsyncTask1(
                        this,
                        taskEntity,
                        2
                    ).execute()

                    val result = async.get()
                    if (result) {
                        Toast.makeText(
                            this,
                            "Task Added Successfully!",
                            Toast.LENGTH_SHORT
                        ).show()
                        onBackPressed()
                    }
                } else {
                    val sb1 = StringBuilder()
                    var count1 = 0
                    for (i in intent.getStringExtra("taskId").toString()) {
                        if (count1 >= 2) {
                            if (i == ',') break
                            sb1.append(i)
                        }
                        if (i == ',') count1++
                    }
                    val alarmNo1 = Integer.parseInt(sb1.toString())

                    var alarmService = AlarmService(this, alarmNo1, "",notify)
                    println("Canceled alarm ----------------$alarmNo1")
                    cancelAlarm { alarmService.cancelAlarm(timeInMillis) }

                    if(notify != 0) {
                        if (title == "") {
                            alarmService =
                                AlarmService(this, alarmNo1, "$time: $description", notify)
                        } else if (description == "") {
                            alarmService = AlarmService(this, alarmNo1, "$time: $title", notify)
                        } else if (title == "" && description == "") {
                            alarmService = AlarmService(this, alarmNo1, "$time ", notify)
                        } else {
                            alarmService =
                                AlarmService(this, alarmNo1, "$time: $title- $description", notify)
                        }

                        if (timeInMillis > System.currentTimeMillis()) {
                            setAlarm { alarmService.setExactAlarm(timeInMillis) }
                            println("Created alarm ----------------$alarmNo")
                        }
                    }
                    val id = intent.getStringExtra("taskId").toString()
                    val taskEntity = TaskEntity(
                        id,
                        time,
                        title,
                        description,
                        false
                    )

                    val taskId = "$date,$timeInMillis,$alarmNo1,$notify"
                    val taskEntityNew = TaskEntity(
                        taskId,
                        time,
                        title,
                        description,
                        false
                    )
                    //Currently this feature is avoided, so that user can add many tasks at one time
                    val logout = androidx.appcompat.app.AlertDialog.Builder(it.context)
                    logout.setTitle("Update Task")
                    logout.setMessage("Task already exists! Do you want to update selected task?")
                    logout.setPositiveButton("Yes") { text, listener ->
                        DBAsyncTask1(
                            this,
                            taskEntity,
                            3
                        ).execute()
                        val async = DBAsyncTask1(
                            this,
                            taskEntityNew,
                            2
                        ).execute()
                        if (async.get()) {
                            Toast.makeText(
                                this,
                                "Task updated!",
                                Toast.LENGTH_SHORT
                            ).show()
                            onBackPressed()
                        }
                    }
                    logout.setNegativeButton("No") { text, listener -> }
                    logout.create()
                    logout.show()
                }
            }
        }
    }

    private fun setAlarm(callback: (Long) -> Unit){
        callback(timeInMillis)
    }

    fun popTimePicker(view: View?) {
        val onTimeSetListener =
            OnTimeSetListener { timePicker, selectedHour, selectedMinute ->
                hour = selectedHour
                minute = selectedMinute
                val calendar = Calendar.getInstance()
                calendar.set(0,0,0,hour,minute,0)
                timeButton?.text = android.text.format.DateFormat.format("hh:mm aa",calendar)
            }

        // int style = AlertDialog.THEME_HOLO_DARK;
        val timePickerDialog =
            TimePickerDialog(this,  /*style,*/onTimeSetListener, hour, minute, false)
//        timePickerDialog.setTitle("Select Task Time")
        timePickerDialog.show()
    }

    private var date2 = StringBuilder()
    private fun makeDate2(scheduleDate: String): String {
        var count = 0

        var day = ""
        var month = ""
        var year = ""

        val temp = StringBuilder()

        for (i in scheduleDate.indices){

            if(scheduleDate[i] != ' '){
                temp.append(scheduleDate[i])
            }else{
                if(count == 0){
                    if(temp.toString().length < 2){
                        day = "0${temp}"
                    }else{
                        day = temp.toString()
                    }
                }else if(count == 1){
                    month = getMonthFormat1(temp.toString()).toString()
                    if(month.toString().length < 2){
                        month = "0${month}"
                    }
                }
                temp.clear()
                count++
            }
        }
        year = temp.toString()
        date2.clear()
        date2.append(day).append("-").append(month).append("-").append(year)
        return date2.toString()
    }

    private fun getMonthFormat1(month: String): Int {
        if (month == "JAN") return 1
        if (month == "FEB") return 2
        if (month == "MAR") return 3
        if (month == "APR") return 4
        if (month == "MAY") return 5
        if (month == "JUN") return 6
        if (month == "JUL") return 7
        if (month == "AUG") return 8
        if (month == "SEP") return 9
        if (month == "OCT") return 10
        if (month == "NOV") return 11
        return if (month == "DEC")  12 else 1
    }

    private fun getTodaysDate(): String {
        val cal = Calendar.getInstance()
        val year = cal[Calendar.YEAR]
        var month = cal[Calendar.MONTH]
        month += 1
        val day = cal[Calendar.DAY_OF_MONTH]
        return makeDateString(day, month, year)
    }
    private fun makeDateString(day: Int, month: Int, year: Int): String {
        return day.toString() + " " + getMonthFormat(month) + " " + year
    }
    private fun getMonthFormat(month: Int): String {
        if (month == 1) return "JAN"
        if (month == 2) return "FEB"
        if (month == 3) return "MAR"
        if (month == 4) return "APR"
        if (month == 5) return "MAY"
        if (month == 6) return "JUN"
        if (month == 7) return "JUL"
        if (month == 8) return "AUG"
        if (month == 9) return "SEP"
        if (month == 10) return "OCT"
        if (month == 11) return "NOV"
        return if (month == 12) "DEC" else "JAN"
    }

    private fun cancelAlarm(callback: (Long) -> Unit){
        callback(timeInMillis)
    }

    class DBAsyncTask1(val context: Context, val taskEntity: TaskEntity, private val mode: Int) :
        AsyncTask<Void, Void, Boolean>() {

        override fun doInBackground(vararg params: Void?): Boolean {
            val db = Room.databaseBuilder(context, TaskDatabase::class.java, "Task-Db").build()

            when (mode) {
                1 -> {
                    val task: TaskEntity? = db.taskDao().getTaskById(taskEntity.task_id)
                    db.close()
                    return task != null
                }
                2 -> {
                    try {
                        db.taskDao().insertTask(taskEntity)
                        db.close()
                        return true
                    }catch (e: Exception){
                        return false
                    }
                }
                3 -> {
                    db.taskDao().deleteTask(taskEntity)
                    db.close()
                    return true
                }
            }
            return false
        }
    }

    override fun onBackPressed() {
        if (mInterstitialAd != null) {
            mInterstitialAd?.show(this)

            mInterstitialAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
                override fun onAdDismissedFullScreenContent() {
                    Log.d(TAG, "Ad was dismissed.")

                    if(repeatBoolean){
                        val intent = Intent(this@CreateTaskActivity, MainActivity::class.java)
                        startActivity(intent)
                        overridePendingTransition(R.anim.pull_up_from_top,R.anim.push_out_to_bottom)
                        finish()
                    }else{
                        val intent = Intent(this@CreateTaskActivity, CreatePlanActivity::class.java)
                        intent.putExtra("date",date.toString())
                        intent.putExtra("notesDescription",notesDescription)
                        intent.putExtra("title", scheduleTitle)

                        startActivity(intent)
                        overridePendingTransition(R.anim.pull_up_from_top,R.anim.push_out_to_bottom)
                        finish()
                    }
                }

                override fun onAdFailedToShowFullScreenContent(adError: AdError?) {
                    Log.d(TAG, "Ad failed to show.")

                    if(repeatBoolean){
                        val intent = Intent(this@CreateTaskActivity, MainActivity::class.java)
                        startActivity(intent)
                        overridePendingTransition(R.anim.pull_up_from_top,R.anim.push_out_to_bottom)
                        finish()
                    }else{
                        val intent = Intent(this@CreateTaskActivity, CreatePlanActivity::class.java)
                        intent.putExtra("date",date.toString())
                        intent.putExtra("notesDescription",notesDescription)
                        intent.putExtra("title", scheduleTitle)

                        startActivity(intent)
                        overridePendingTransition(R.anim.pull_up_from_top,R.anim.push_out_to_bottom)
                        finish()
                    }
                }

                override fun onAdShowedFullScreenContent() {
                    Log.d(TAG, "Ad showed fullscreen content.")
                    mInterstitialAd = null
                }
            }
        } else {
            if(repeatBoolean){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.pull_up_from_top,R.anim.push_out_to_bottom)
                finish()
            }else{
                val intent = Intent(this, CreatePlanActivity::class.java)
                intent.putExtra("date",date.toString())
                intent.putExtra("notesDescription",notesDescription)
                intent.putExtra("title", scheduleTitle)

                startActivity(intent)
                overridePendingTransition(R.anim.pull_up_from_top,R.anim.push_out_to_bottom)
                finish()
            }
        }

    }
}