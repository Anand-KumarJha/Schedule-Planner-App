package com.futuredeveloper.scheduleplanner.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.futuredeveloper.scheduleplanner.R
import com.futuredeveloper.scheduleplanner.classes.AlarmService
import com.futuredeveloper.scheduleplanner.database.ScheduleEntity
import java.text.SimpleDateFormat
import java.util.*


class MainRecyclerAdapter(
    val context: Context,
    private val itemList: List<ScheduleEntity>
    ) : RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder>() {
        private var timeInMillis: Long = 0L
        class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            var recyclerHome: RecyclerView = view.findViewById(R.id.recyclerRecyclerView)
            lateinit var layoutManager: RecyclerView.LayoutManager
            lateinit var recyclerAdapter: TaskRecyclerAdapter

            var scheduleDate: TextView = view.findViewById(R.id.schedule_date)
            var scheduleDay:  TextView = view.findViewById(R.id.schedule_day)
            var scheduleTitle: TextView = view.findViewById(R.id.title)
            var editButton: ImageView = view.findViewById(R.id.edit1)
            var deleteButton: ImageView = view.findViewById(R.id.delete1)
            val liContent: RelativeLayout = view.findViewById(R.id.relative)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.main_schedule_row, parent, false)
            return MainViewHolder(view)
        }

        override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
            holder.scheduleDate.text = itemList[position].scheduleDate
            holder.scheduleTitle.text = itemList[position].scheduleTitle
            holder.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context)
            holder.recyclerAdapter =
                TaskRecyclerAdapter(context, itemList[position].tasks)
            holder.recyclerHome.adapter = holder.recyclerAdapter
            holder.recyclerHome.layoutManager = holder.layoutManager

            val inFormat = SimpleDateFormat("dd-MM-yyyy")
            val date = inFormat.parse(makeDate2(itemList[position].scheduleDate))
            val outFormat = SimpleDateFormat("EEEE")
            val goal = outFormat.format(date)
            holder.scheduleDay.text = goal.subSequence(0,3).toString()

            holder.recyclerHome.setOnClickListener {
                editTask(holder)
            }
            holder.liContent.setOnClickListener {
                editTask(holder)
            }
            holder.editButton.setOnClickListener {
                editTask(holder)
            }
            holder.deleteButton.setOnClickListener{
                val delete = androidx.appcompat.app.AlertDialog.Builder(it.context)
                delete.setTitle("Delete Schedule")
                delete.setMessage("Do you want to delete selected schedule?")
                delete.setPositiveButton("Yes") { text, listener ->
                    deleteIt(position)
                }
                delete.setNegativeButton("No") { text, listener ->

                }
                delete.create()
                delete.show()
            }

        }

    private fun editTask(holder: MainViewHolder){
        val intent = android.content.Intent(
            context,
            com.futuredeveloper.scheduleplanner.activity.CreatePlanActivity::class.java
        )
        intent.putExtra("date", holder.scheduleDate.text.toString())
        context.startActivity(intent)
        (context as Activity).overridePendingTransition(R.anim.pull_up_from_bottom,0)
        context.finish()
    }
    fun deleteIt(position: Int){
        for(i in itemList[position].tasks){
            var count1 = 0
            var start = 0

            val sb = java.lang.StringBuilder()
            for(j in (i.task_id)){
                if(j == ','){
                    count1++
                }
                if(count1 >= 2){
                    break
                }
                if(count1 == 1 && start > 0){
                    sb.append(j)
                }
                if(count1 == 1){
                    start++
                }
            }

            timeInMillis = (sb.toString()).toLong()

            val sb1 = StringBuilder()
            var count = 0
            for(j in (i.task_id)){
                if(count >= 2){
                    if(j == ',')break
                    sb1.append(j)
                }
                if(j == ',')count++
            }
            val alarmNo = Integer.parseInt(sb1.toString())

            val alarmService = AlarmService(context as Activity, alarmNo, "",0)
            println("Canceled alarm ----------------$alarmNo")
            cancelAlarm{alarmService.cancelAlarm(timeInMillis)}
        }
        delete(itemList[position].scheduleDate)
    }
    private fun cancelAlarm(callback: (Long) -> Unit){
        callback(timeInMillis)
    }

    fun delete(scheduleDate: String){
        DBAsyncTask1(
            context,
            makeDate(scheduleDate)
        ).execute()
        DBAsyncTask2(
            context,
            scheduleDate
        ).execute()

        val intent = android.content.Intent(
            context,
            com.futuredeveloper.scheduleplanner.activity.MainActivity::class.java
        )
        if(makeDate(scheduleDate) < makeDate(getTodaysDate())) {
            intent.putExtra("fragment", 2)
        }else{
            intent.putExtra("fragment", 0)
        }
        context.startActivity(intent)
        (context as Activity).overridePendingTransition(0,0)
        context.finish()

        Toast.makeText(context,"Schedule Deleted", Toast.LENGTH_SHORT).show()
    }

    override fun getItemCount(): Int {
        return itemList.size
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
    //For date sorting
    private var date1 = StringBuilder()
    private fun makeDate(scheduleDate: String): String{
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
                        day = "0$temp"
                    }else{
                        day = temp.toString()
                    }
                }else if(count == 1){
                    month = getMonthFormat1(temp.toString()).toString()
                    if(month.length < 2){
                        month = "0${month}"
                    }
                }
                temp.clear()
                count++
            }
        }
        year = temp.toString()
        date1.clear()
        date1.append(year).append(month).append(day)
        return date1.toString()
    }


    private var date2 = StringBuilder()
    private fun makeDate2(scheduleDate: String): String{
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
                        day = "0$temp"
                    }else{
                        day = temp.toString()
                    }
                }else if(count == 1){
                    month = getMonthFormat1(temp.toString()).toString()
                    if(month.length < 2){
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
    class DBAsyncTask1(val context: Context, val id: String) :
        android.os.AsyncTask<Void, Void, Boolean>() {

        override fun doInBackground(vararg params: Void?): Boolean {
            val db = androidx.room.Room.databaseBuilder(context, com.futuredeveloper.scheduleplanner.database.ScheduleRoomDatabase::class.java, "Schedule-Db").build()

            db.scheduleDao().deleteById(id)
            db.close()
            return true
        }
    }

    class DBAsyncTask2(val context: Context, val id: String) :
        android.os.AsyncTask<Void, Void, Boolean>() {

        override fun doInBackground(vararg params: Void?): Boolean {
            val db = androidx.room.Room.databaseBuilder(context, com.futuredeveloper.scheduleplanner.database.TaskDatabase::class.java, "Task-Db").build()

            db.taskDao().clearTask(id)
            db.close()
            return true
        }
    }
}

