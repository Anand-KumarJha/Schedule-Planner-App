package com.futuredeveloper.scheduleplanner.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/adapter/CreatePlanAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/futuredeveloper/scheduleplanner/adapter/CreatePlanAdapter$CreateTaskViewHolder;", "context", "Landroid/content/Context;", "itemList", "", "Lcom/futuredeveloper/scheduleplanner/database/TaskEntity;", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "timeInMillis", "", "cancelAlarm", "", "callback", "Lkotlin/Function1;", "delete", "position", "", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CreateTaskViewHolder", "DBAsyncTask2", "GetTaskByIds", "UpdateTaskById", "app_release"})
public final class CreatePlanAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.futuredeveloper.scheduleplanner.adapter.CreatePlanAdapter.CreateTaskViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final java.util.List<com.futuredeveloper.scheduleplanner.database.TaskEntity> itemList = null;
    private long timeInMillis = 0L;
    
    public CreatePlanAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.futuredeveloper.scheduleplanner.database.TaskEntity> itemList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.futuredeveloper.scheduleplanner.adapter.CreatePlanAdapter.CreateTaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.futuredeveloper.scheduleplanner.adapter.CreatePlanAdapter.CreateTaskViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void delete(int position) {
    }
    
    private final void cancelAlarm(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> callback) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010#\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\b\"\u0004\b(\u0010\nR\u001a\u0010)\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\u001a\u0010,\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\u0010\u00a8\u0006/"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/adapter/CreatePlanAdapter$CreateTaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "count", "Landroid/widget/TextView;", "getCount", "()Landroid/widget/TextView;", "setCount", "(Landroid/widget/TextView;)V", "deleteButton", "Landroid/widget/ImageView;", "getDeleteButton", "()Landroid/widget/ImageView;", "setDeleteButton", "(Landroid/widget/ImageView;)V", "description", "getDescription", "setDescription", "editButton", "getEditButton", "setEditButton", "intentDate", "", "getIntentDate", "()Ljava/lang/String;", "setIntentDate", "(Ljava/lang/String;)V", "intentNotesDescription", "getIntentNotesDescription", "setIntentNotesDescription", "intentTitle", "getIntentTitle", "setIntentTitle", "taskDone", "getTaskDone", "setTaskDone", "time", "getTime", "setTime", "title", "getTitle", "setTitle", "todayDone", "getTodayDone", "setTodayDone", "app_release"})
    public static final class CreateTaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView count;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView time;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView title;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView description;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView taskDone;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView deleteButton;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView todayDone;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView editButton;
        @org.jetbrains.annotations.NotNull
        private java.lang.String intentDate = "";
        @org.jetbrains.annotations.NotNull
        private java.lang.String intentNotesDescription = "";
        @org.jetbrains.annotations.NotNull
        private java.lang.String intentTitle = "";
        
        public CreateTaskViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getCount() {
            return null;
        }
        
        public final void setCount(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTime() {
            return null;
        }
        
        public final void setTime(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getTaskDone() {
            return null;
        }
        
        public final void setTaskDone(@org.jetbrains.annotations.NotNull
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
        public final android.widget.ImageView getTodayDone() {
            return null;
        }
        
        public final void setTodayDone(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getEditButton() {
            return null;
        }
        
        public final void setEditButton(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getIntentDate() {
            return null;
        }
        
        public final void setIntentDate(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getIntentNotesDescription() {
            return null;
        }
        
        public final void setIntentNotesDescription(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getIntentTitle() {
            return null;
        }
        
        public final void setIntentTitle(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\r\u001a\u00020\u00032\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/adapter/CreatePlanAdapter$DBAsyncTask2;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "id", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getId", "()Ljava/lang/String;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "app_release"})
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\r\u001a\u00020\u00032\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/adapter/CreatePlanAdapter$UpdateTaskById;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "id", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getId", "()Ljava/lang/String;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "app_release"})
    public static final class UpdateTaskById extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String id = null;
        
        public UpdateTaskById(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\r\u001a\u00020\u00032\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/adapter/CreatePlanAdapter$GetTaskByIds;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Lcom/futuredeveloper/scheduleplanner/database/TaskEntity;", "context", "Landroid/content/Context;", "id", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getId", "()Ljava/lang/String;", "doInBackground", "params", "", "([Ljava/lang/Void;)Lcom/futuredeveloper/scheduleplanner/database/TaskEntity;", "app_release"})
    public static final class GetTaskByIds extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.futuredeveloper.scheduleplanner.database.TaskEntity> {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String id = null;
        
        public GetTaskByIds(@org.jetbrains.annotations.NotNull
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
        protected com.futuredeveloper.scheduleplanner.database.TaskEntity doInBackground(@org.jetbrains.annotations.NotNull
        java.lang.Void... params) {
            return null;
        }
    }
}