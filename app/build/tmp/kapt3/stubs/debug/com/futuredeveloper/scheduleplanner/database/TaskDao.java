package com.futuredeveloper.scheduleplanner.database;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\u0012"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/database/TaskDao;", "", "clearTask", "", "taskDate", "", "deleteTask", "taskEntity", "Lcom/futuredeveloper/scheduleplanner/database/TaskEntity;", "deleteTaskById", "taskId", "getAllRepeatTasks", "", "getAllTaskItems", "getTaskByDate", "getTaskById", "insertTask", "updateTask", "app_debug"})
public abstract interface TaskDao {
    
    @androidx.room.Insert
    public abstract void insertTask(@org.jetbrains.annotations.NotNull
    com.futuredeveloper.scheduleplanner.database.TaskEntity taskEntity);
    
    @androidx.room.Delete
    public abstract void deleteTask(@org.jetbrains.annotations.NotNull
    com.futuredeveloper.scheduleplanner.database.TaskEntity taskEntity);
    
    @androidx.room.Update
    public abstract void updateTask(@org.jetbrains.annotations.NotNull
    com.futuredeveloper.scheduleplanner.database.TaskEntity taskEntity);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM task ORDER BY task_id ASC")
    public abstract java.util.List<com.futuredeveloper.scheduleplanner.database.TaskEntity> getAllTaskItems();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM task WHERE task_id = :taskId")
    public abstract com.futuredeveloper.scheduleplanner.database.TaskEntity getTaskById(@org.jetbrains.annotations.NotNull
    java.lang.String taskId);
    
    @androidx.room.Query(value = "DELETE FROM task WHERE task_id = :taskId")
    public abstract void deleteTaskById(@org.jetbrains.annotations.NotNull
    java.lang.String taskId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM task WHERE task_id LIKE :taskDate || \'%\' ORDER BY task_id ASC")
    public abstract java.util.List<com.futuredeveloper.scheduleplanner.database.TaskEntity> getTaskByDate(@org.jetbrains.annotations.NotNull
    java.lang.String taskDate);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM task WHERE task_id LIKE \'R\' || \'%\' ORDER BY task_id ASC")
    public abstract java.util.List<com.futuredeveloper.scheduleplanner.database.TaskEntity> getAllRepeatTasks();
    
    @androidx.room.Query(value = "DELETE FROM task WHERE task_id LIKE :taskDate || \'%\'")
    public abstract void clearTask(@org.jetbrains.annotations.NotNull
    java.lang.String taskDate);
}