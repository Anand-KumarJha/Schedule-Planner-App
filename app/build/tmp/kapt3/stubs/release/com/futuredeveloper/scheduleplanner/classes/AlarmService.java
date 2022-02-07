package com.futuredeveloper.scheduleplanner.classes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/classes/AlarmService;", "", "context", "Landroid/content/Context;", "requestCode", "", "message", "", "(Landroid/content/Context;ILjava/lang/String;)V", "alarmManager", "Landroid/app/AlarmManager;", "cancelAlarm", "", "timeInMillis", "", "cancelRepeatAlarm", "getIntent", "Landroid/content/Intent;", "getPendingIntent", "Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "intent", "setAlarm", "pendingIntent", "setExactAlarm", "setRepetitiveAlarm", "app_release"})
public final class AlarmService {
    private final android.content.Context context = null;
    private final int requestCode = 0;
    private final java.lang.String message = null;
    private final android.app.AlarmManager alarmManager = null;
    
    public AlarmService(@org.jetbrains.annotations.NotNull
    android.content.Context context, int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
        super();
    }
    
    public final void setExactAlarm(long timeInMillis) {
    }
    
    public final void setRepetitiveAlarm(long timeInMillis) {
    }
    
    private final android.app.PendingIntent getPendingIntent(android.content.Intent intent, int requestCode) {
        return null;
    }
    
    public final void cancelAlarm(long timeInMillis) {
    }
    
    public final void cancelRepeatAlarm(long timeInMillis) {
    }
    
    private final void setAlarm(long timeInMillis, android.app.PendingIntent pendingIntent) {
    }
    
    private final android.content.Intent getIntent() {
        return null;
    }
}