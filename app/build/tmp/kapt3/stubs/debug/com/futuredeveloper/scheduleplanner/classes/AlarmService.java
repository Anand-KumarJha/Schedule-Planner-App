package com.futuredeveloper.scheduleplanner.classes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/classes/AlarmService;", "", "context", "Landroid/content/Context;", "requestCode", "", "message", "", "notify", "(Landroid/content/Context;ILjava/lang/String;I)V", "alarmManager", "Landroid/app/AlarmManager;", "cancelAlarm", "", "timeInMillis", "", "cancelRepeatAlarm", "getIntent", "Landroid/content/Intent;", "getPendingIntent", "Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "intent", "setAlarm", "pendingIntent", "setExactAlarm", "setRepetitiveAlarm", "app_debug"})
public final class AlarmService {
    private final android.content.Context context = null;
    private final int requestCode = 0;
    private final java.lang.String message = null;
    private final int notify = 0;
    private final android.app.AlarmManager alarmManager = null;
    
    public AlarmService(@org.jetbrains.annotations.NotNull
    android.content.Context context, int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String message, int notify) {
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