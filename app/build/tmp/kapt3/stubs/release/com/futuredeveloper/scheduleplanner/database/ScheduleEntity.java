package com.futuredeveloper.scheduleplanner.database;

import java.lang.System;

@androidx.room.Entity(tableName = "schedule_table")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/database/ScheduleEntity;", "", "schedule_id", "", "scheduleDate", "scheduleTitle", "scheduleDateNotes", "tasks", "", "Lcom/futuredeveloper/scheduleplanner/database/TaskEntity;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getScheduleDate", "()Ljava/lang/String;", "getScheduleDateNotes", "getScheduleTitle", "getSchedule_id", "getTasks", "()Ljava/util/List;", "app_release"})
public final class ScheduleEntity {
    @org.jetbrains.annotations.NotNull
    @androidx.room.PrimaryKey
    private final java.lang.String schedule_id = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "schedule_date")
    private final java.lang.String scheduleDate = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "schedule_title")
    private final java.lang.String scheduleTitle = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "schedule_date_notes")
    private final java.lang.String scheduleDateNotes = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "tasks")
    private final java.util.List<com.futuredeveloper.scheduleplanner.database.TaskEntity> tasks = null;
    
    public ScheduleEntity(@org.jetbrains.annotations.NotNull
    java.lang.String schedule_id, @org.jetbrains.annotations.NotNull
    java.lang.String scheduleDate, @org.jetbrains.annotations.NotNull
    java.lang.String scheduleTitle, @org.jetbrains.annotations.NotNull
    java.lang.String scheduleDateNotes, @org.jetbrains.annotations.NotNull
    java.util.List<com.futuredeveloper.scheduleplanner.database.TaskEntity> tasks) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSchedule_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getScheduleDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getScheduleTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getScheduleDateNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.futuredeveloper.scheduleplanner.database.TaskEntity> getTasks() {
        return null;
    }
}