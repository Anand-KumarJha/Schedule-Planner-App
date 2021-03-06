package com.futuredeveloper.scheduleplanner.database;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\'J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\u0011"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/database/ScheduleDao;", "", "deleteById", "", "id", "", "deleteIfExist", "", "schedule_id", "deleteSchedule", "schedule", "Lcom/futuredeveloper/scheduleplanner/database/ScheduleEntity;", "getAllSchedule", "", "getScheduleById", "insertSchedule", "updateSchedule", "app_release"})
public abstract interface ScheduleDao {
    
    @androidx.room.Query(value = "SELECT count(*) FROM schedule_table WHERE schedule_id = :schedule_id")
    public abstract int deleteIfExist(@org.jetbrains.annotations.NotNull
    java.lang.String schedule_id);
    
    @androidx.room.Insert
    public abstract void insertSchedule(@org.jetbrains.annotations.NotNull
    com.futuredeveloper.scheduleplanner.database.ScheduleEntity schedule);
    
    @androidx.room.Update
    public abstract void updateSchedule(@org.jetbrains.annotations.NotNull
    com.futuredeveloper.scheduleplanner.database.ScheduleEntity schedule);
    
    @androidx.room.Delete
    public abstract void deleteSchedule(@org.jetbrains.annotations.NotNull
    com.futuredeveloper.scheduleplanner.database.ScheduleEntity schedule);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM schedule_table ORDER BY schedule_id ASC")
    public abstract java.util.List<com.futuredeveloper.scheduleplanner.database.ScheduleEntity> getAllSchedule();
    
    @androidx.room.Query(value = "DELETE FROM schedule_table WHERE schedule_id = :id")
    public abstract void deleteById(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM schedule_table WHERE schedule_id = :id")
    public abstract com.futuredeveloper.scheduleplanner.database.ScheduleEntity getScheduleById(@org.jetbrains.annotations.NotNull
    java.lang.String id);
}