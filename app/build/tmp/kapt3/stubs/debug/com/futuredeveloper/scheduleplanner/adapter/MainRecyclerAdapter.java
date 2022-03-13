package com.futuredeveloper.scheduleplanner.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003,-.B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00120\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001aH\u0002J\u0018\u0010\'\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001aH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00060\fj\u0002`\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\fj\u0002`\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/adapter/MainRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/futuredeveloper/scheduleplanner/adapter/MainRecyclerAdapter$MainViewHolder;", "context", "Landroid/content/Context;", "itemList", "", "Lcom/futuredeveloper/scheduleplanner/database/ScheduleEntity;", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "date1", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "date2", "timeInMillis", "", "cancelAlarm", "", "callback", "Lkotlin/Function1;", "delete", "scheduleDate", "", "deleteIt", "position", "", "editTask", "holder", "getItemCount", "getMonthFormat", "month", "getMonthFormat1", "getTodaysDate", "makeDate", "makeDate2", "makeDateString", "day", "year", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DBAsyncTask1", "DBAsyncTask2", "MainViewHolder", "app_debug"})
public final class MainRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.futuredeveloper.scheduleplanner.adapter.MainRecyclerAdapter.MainViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final java.util.List<com.futuredeveloper.scheduleplanner.database.ScheduleEntity> itemList = null;
    private long timeInMillis = 0L;
    private java.lang.StringBuilder date1;
    private java.lang.StringBuilder date2;
    
    public MainRecyclerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.futuredeveloper.scheduleplanner.database.ScheduleEntity> itemList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.futuredeveloper.scheduleplanner.adapter.MainRecyclerAdapter.MainViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.futuredeveloper.scheduleplanner.adapter.MainRecyclerAdapter.MainViewHolder holder, int position) {
    }
    
    private final void editTask(com.futuredeveloper.scheduleplanner.adapter.MainRecyclerAdapter.MainViewHolder holder) {
    }
    
    public final void deleteIt(int position) {
    }
    
    private final void cancelAlarm(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> callback) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull
    java.lang.String scheduleDate) {
    }
    
    @java.lang.Override
    public int getItemCount() {
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
    
    private final java.lang.String makeDate(java.lang.String scheduleDate) {
        return null;
    }
    
    private final java.lang.String makeDate2(java.lang.String scheduleDate) {
        return null;
    }
    
    private final int getMonthFormat1(java.lang.String month) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\'\"\u0004\b,\u0010)R\u001a\u0010-\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\'\"\u0004\b/\u0010)\u00a8\u00060"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/adapter/MainRecyclerAdapter$MainViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "deleteButton", "Landroid/widget/ImageView;", "getDeleteButton", "()Landroid/widget/ImageView;", "setDeleteButton", "(Landroid/widget/ImageView;)V", "editButton", "getEditButton", "setEditButton", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V", "liContent", "Landroid/widget/RelativeLayout;", "getLiContent", "()Landroid/widget/RelativeLayout;", "recyclerAdapter", "Lcom/futuredeveloper/scheduleplanner/adapter/TaskRecyclerAdapter;", "getRecyclerAdapter", "()Lcom/futuredeveloper/scheduleplanner/adapter/TaskRecyclerAdapter;", "setRecyclerAdapter", "(Lcom/futuredeveloper/scheduleplanner/adapter/TaskRecyclerAdapter;)V", "recyclerHome", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerHome", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerHome", "(Landroidx/recyclerview/widget/RecyclerView;)V", "scheduleDate", "Landroid/widget/TextView;", "getScheduleDate", "()Landroid/widget/TextView;", "setScheduleDate", "(Landroid/widget/TextView;)V", "scheduleDay", "getScheduleDay", "setScheduleDay", "scheduleTitle", "getScheduleTitle", "setScheduleTitle", "app_debug"})
    public static final class MainViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private androidx.recyclerview.widget.RecyclerView recyclerHome;
        public androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        public com.futuredeveloper.scheduleplanner.adapter.TaskRecyclerAdapter recyclerAdapter;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView scheduleDate;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView scheduleDay;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView scheduleTitle;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView editButton;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView deleteButton;
        @org.jetbrains.annotations.NotNull
        private final android.widget.RelativeLayout liContent = null;
        
        public MainViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.recyclerview.widget.RecyclerView getRecyclerHome() {
            return null;
        }
        
        public final void setRecyclerHome(@org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager() {
            return null;
        }
        
        public final void setLayoutManager(@org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView.LayoutManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.futuredeveloper.scheduleplanner.adapter.TaskRecyclerAdapter getRecyclerAdapter() {
            return null;
        }
        
        public final void setRecyclerAdapter(@org.jetbrains.annotations.NotNull
        com.futuredeveloper.scheduleplanner.adapter.TaskRecyclerAdapter p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getScheduleDate() {
            return null;
        }
        
        public final void setScheduleDate(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getScheduleDay() {
            return null;
        }
        
        public final void setScheduleDay(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getScheduleTitle() {
            return null;
        }
        
        public final void setScheduleTitle(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getEditButton() {
            return null;
        }
        
        public final void setEditButton(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getDeleteButton() {
            return null;
        }
        
        public final void setDeleteButton(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.RelativeLayout getLiContent() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\r\u001a\u00020\u00032\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/adapter/MainRecyclerAdapter$DBAsyncTask1;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "id", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getId", "()Ljava/lang/String;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "app_debug"})
    public static final class DBAsyncTask1 extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String id = null;
        
        public DBAsyncTask1(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String id) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull
        java.lang.Void... params) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\r\u001a\u00020\u00032\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/adapter/MainRecyclerAdapter$DBAsyncTask2;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "id", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getId", "()Ljava/lang/String;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "app_debug"})
    public static final class DBAsyncTask2 extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String id = null;
        
        public DBAsyncTask2(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String id) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getId() {
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