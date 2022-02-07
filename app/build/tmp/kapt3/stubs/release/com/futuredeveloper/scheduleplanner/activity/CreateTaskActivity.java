package com.futuredeveloper.scheduleplanner.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001=B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020)0+H\u0002J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u000eH\u0002J\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0006H\u0002J\b\u0010/\u001a\u00020\u0006H\u0002J\u0010\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002J \u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000eH\u0002J\b\u00105\u001a\u00020)H\u0016J\u0012\u00106\u001a\u00020)2\b\u00107\u001a\u0004\u0018\u000108H\u0014J\u0010\u00109\u001a\u00020)2\b\u0010:\u001a\u0004\u0018\u00010;J\u001c\u0010<\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020)0+H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bj\u0002`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/activity/CreateTaskActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "alarmService", "Lcom/futuredeveloper/scheduleplanner/classes/AlarmService;", "date", "", "date2", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "description", "descriptionEditText", "Landroid/widget/EditText;", "hour", "", "mInterstitialAd", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "minute", "notesDescription", "repeatBoolean", "", "saveTask", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "scheduleTitle", "sharedPreference", "Landroid/content/SharedPreferences;", "taskText", "Landroid/widget/TextView;", "time", "timeButton", "Landroid/widget/Button;", "timeInMillis", "", "timetype", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "titleEditText", "cancelAlarm", "", "callback", "Lkotlin/Function1;", "getMonthFormat", "month", "getMonthFormat1", "getTodaysDate", "makeDate2", "scheduleDate", "makeDateString", "day", "year", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "popTimePicker", "view", "Landroid/view/View;", "setAlarm", "DBAsyncTask1", "app_release"})
public final class CreateTaskActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.Button timeButton;
    private int hour = 0;
    private int minute = 0;
    private java.lang.String time;
    public java.lang.String title;
    private java.lang.String description;
    private android.widget.EditText titleEditText;
    private android.widget.EditText descriptionEditText;
    private java.lang.String notesDescription;
    private android.widget.TextView taskText;
    private java.lang.String timetype = "AM";
    private com.google.android.material.floatingactionbutton.FloatingActionButton saveTask;
    private java.lang.String date = "";
    private java.lang.String scheduleTitle = "";
    private long timeInMillis = 0L;
    private com.futuredeveloper.scheduleplanner.classes.AlarmService alarmService;
    private android.content.SharedPreferences sharedPreference;
    private boolean repeatBoolean = false;
    private com.google.android.gms.ads.interstitial.InterstitialAd mInterstitialAd;
    private java.lang.StringBuilder date2;
    
    public CreateTaskActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setAlarm(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> callback) {
    }
    
    public final void popTimePicker(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    private final java.lang.String makeDate2(java.lang.String scheduleDate) {
        return null;
    }
    
    private final int getMonthFormat1(java.lang.String month) {
        return 0;
    }
    
    private final java.lang.String getTodaysDate() {
        return null;
    }
    
    private final java.lang.String makeDateString(int day, int month, int year) {
        return null;
    }
    
    private final java.lang.String getMonthFormat(int month) {
        return null;
    }
    
    private final void cancelAlarm(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> callback) {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ%\u0010\u000f\u001a\u00020\u00032\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0011\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/activity/CreateTaskActivity$DBAsyncTask1;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "taskEntity", "Lcom/futuredeveloper/scheduleplanner/database/TaskEntity;", "mode", "", "(Landroid/content/Context;Lcom/futuredeveloper/scheduleplanner/database/TaskEntity;I)V", "getContext", "()Landroid/content/Context;", "getTaskEntity", "()Lcom/futuredeveloper/scheduleplanner/database/TaskEntity;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "app_release"})
    public static final class DBAsyncTask1 extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull
        private final com.futuredeveloper.scheduleplanner.database.TaskEntity taskEntity = null;
        private final int mode = 0;
        
        public DBAsyncTask1(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        com.futuredeveloper.scheduleplanner.database.TaskEntity taskEntity, int mode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.futuredeveloper.scheduleplanner.database.TaskEntity getTaskEntity() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull
        java.lang.Void... params) {
            return null;
        }
    }
}