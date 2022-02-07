package com.futuredeveloper.scheduleplanner.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.futuredeveloper.scheduleplanner.database.TaskTypeConverter.class})
@androidx.room.Database(entities = {com.futuredeveloper.scheduleplanner.database.ScheduleEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/database/ScheduleRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "scheduleDao", "Lcom/futuredeveloper/scheduleplanner/database/ScheduleDao;", "Companion", "app_release"})
public abstract class ScheduleRoomDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.futuredeveloper.scheduleplanner.database.ScheduleRoomDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.futuredeveloper.scheduleplanner.database.ScheduleRoomDatabase INSTANCE;
    
    public ScheduleRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.futuredeveloper.scheduleplanner.database.ScheduleDao scheduleDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/database/ScheduleRoomDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/futuredeveloper/scheduleplanner/database/ScheduleRoomDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.futuredeveloper.scheduleplanner.database.ScheduleRoomDatabase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}