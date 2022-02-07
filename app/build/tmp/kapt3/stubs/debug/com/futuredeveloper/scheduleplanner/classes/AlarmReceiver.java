package com.futuredeveloper.scheduleplanner.classes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/classes/AlarmReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "requestCode", "", "timeInMillis", "", "Ljava/lang/Long;", "buildNotification", "", "context", "Landroid/content/Context;", "title", "", "message", "onReceive", "intent", "Landroid/content/Intent;", "setRepetitiveAlarm", "alarmService", "Lcom/futuredeveloper/scheduleplanner/classes/AlarmService;", "app_debug"})
public final class AlarmReceiver extends android.content.BroadcastReceiver {
    private int requestCode = 0;
    private java.lang.Long timeInMillis = 0L;
    
    public AlarmReceiver() {
        super();
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    private final void buildNotification(android.content.Context context, java.lang.String title, java.lang.String message) {
    }
    
    private final void setRepetitiveAlarm(com.futuredeveloper.scheduleplanner.classes.AlarmService alarmService) {
    }
}