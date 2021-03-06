package com.futuredeveloper.scheduleplanner.classes

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.net.Uri
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.futuredeveloper.scheduleplanner.R
import com.futuredeveloper.scheduleplanner.activity.MainActivity
import com.futuredeveloper.scheduleplanner.util.Constants
import java.util.*
import java.util.concurrent.TimeUnit


class AlarmReceiver: BroadcastReceiver() {

    private var requestCode = 0
    private var timeInMillis: Long? = 0L

    override fun onReceive(context: Context, intent: Intent?) {
        timeInMillis = intent?.getLongExtra(Constants.EXTRA_EXACT_ALARM_TIME, 0L)
        val message = intent?.getStringExtra("message")
        val notify = intent?.getIntExtra("notify",1)

        if(notify == 1) {
            when (intent?.action) {
                Constants.ACTION_SET_EXACT -> {
                    buildNotification(context, "Task is Scheduled", message.toString())
                }
                Constants.ACTION_SET_REPETITIVE_EXACT -> {
                    requestCode = intent.getIntExtra("requestCode", 0)
                    val alarmReceiver =
                        AlarmService(context, requestCode, message.toString(), notify!!)
                    println("Alarm created - $requestCode")
                    setRepetitiveAlarm(alarmReceiver)
                    buildNotification(context, "Task is Scheduled", message.toString())
                }
            }
        }else{
            when (intent?.action) {
                Constants.ACTION_SET_EXACT -> {
                    buildNotification1(context, "Task is Scheduled", message.toString())
                }
                Constants.ACTION_SET_REPETITIVE_EXACT -> {
                    requestCode = intent.getIntExtra("requestCode", 0)
                    val alarmReceiver =
                        AlarmService(context, requestCode, message.toString(), notify!!)
                    println("Alarm created - $requestCode")
                    setRepetitiveAlarm(alarmReceiver)
                    buildNotification1(context, "Task is Scheduled", message.toString())
                }
            }
        }
    }

    private fun buildNotification(context: Context, title: String, message: String) {
        val intent = Intent(context, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

        val pendingIntent: PendingIntent
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_IMMUTABLE)
        }else{
            pendingIntent = PendingIntent.getActivity(context, 0, intent, 0)
        }

        val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(2000, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            vibrator.vibrate(2000)
        }

        try {
            val rawPathUri: Uri = Uri.parse("android.resource://com.futuredeveloper.scheduleplanner" + "/" + R.raw.notify)
            val r = RingtoneManager.getRingtone(context, rawPathUri)
            r.play()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        val builder = NotificationCompat.Builder(context, "futuredeveloper.SchedulePlanner")
            .setSmallIcon(R.drawable.small_logo)
            .setContentTitle(title)
            .setStyle(NotificationCompat.BigTextStyle()
                .bigText(message))
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            // Set the intent that will fire when the user taps the notification
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)

        val notificationManager = NotificationManagerCompat.from(context)
        notificationManager.notify(123,builder.build())
    }

    private fun buildNotification1(context: Context, title: String, message: String) {
        val intent = Intent(context, MainActivity::class.java)

        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

        val pendingIntent: PendingIntent
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_IMMUTABLE)
        }else{
            pendingIntent = PendingIntent.getActivity(context, 0, intent, 0)
        }
        val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(4000, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            vibrator.vibrate(4000)
        }

        val rawPathUri: Uri = Uri.parse("android.resource://com.futuredeveloper.scheduleplanner" + "/" + R.raw.alarm)
        val r = RingtoneManager.getRingtone(context, rawPathUri)
        r.play()

        val builder = NotificationCompat.Builder(context, "futuredeveloper.SchedulePlanner")
            .setSmallIcon(R.drawable.small_logo)
            .setContentTitle(title)
            .setStyle(NotificationCompat.BigTextStyle()
                .bigText(message))
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            // Set the intent that will fire when the user taps the notification
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)

        val notificationManager = NotificationManagerCompat.from(context)
        notificationManager.notify(123,builder.build())
    }

    private fun setRepetitiveAlarm(alarmService: AlarmService) {
        val timeInMillis2 = timeInMillis
        val cal = Calendar.getInstance().apply {
            if (timeInMillis2 != null) {
                this.timeInMillis = timeInMillis2 + TimeUnit.DAYS.toMillis(1)
            }
        }
        println(cal.timeInMillis)
        alarmService.setRepetitiveAlarm(cal.timeInMillis)
    }
}