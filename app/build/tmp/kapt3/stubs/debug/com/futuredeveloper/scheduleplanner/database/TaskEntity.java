package com.futuredeveloper.scheduleplanner.database;

import java.lang.System;

@androidx.room.Entity(tableName = "task")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/database/TaskEntity;", "", "task_id", "", "taskTime", "taskTitle", "taskDescription", "taskDone", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getTaskDescription", "()Ljava/lang/String;", "getTaskDone", "()Z", "setTaskDone", "(Z)V", "getTaskTime", "getTaskTitle", "getTask_id", "app_debug"})
public final class TaskEntity {
    @org.jetbrains.annotations.NotNull
    @androidx.room.PrimaryKey
    private final java.lang.String task_id = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "task_time")
    private final java.lang.String taskTime = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "task_title")
    private final java.lang.String taskTitle = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "task_description")
    private final java.lang.String taskDescription = null;
    @androidx.room.ColumnInfo(name = "task_done")
    private boolean taskDone;
    
    public TaskEntity(@org.jetbrains.annotations.NotNull
    java.lang.String task_id, @org.jetbrains.annotations.NotNull
    java.lang.String taskTime, @org.jetbrains.annotations.NotNull
    java.lang.String taskTitle, @org.jetbrains.annotations.NotNull
    java.lang.String taskDescription, boolean taskDone) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTask_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTaskTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTaskTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTaskDescription() {
        return null;
    }
    
    public final boolean getTaskDone() {
        return false;
    }
    
    public final void setTaskDone(boolean p0) {
    }
}