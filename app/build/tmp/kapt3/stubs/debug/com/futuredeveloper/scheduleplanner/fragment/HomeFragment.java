package com.futuredeveloper.scheduleplanner.fragment;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this com.example.scheduleplanner.fragment.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 M2\u00020\u0001:\u0005MNOPQB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u00107\u001a\u0002082\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002080:H\u0002J\u0010\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020\u0013H\u0002J\b\u0010?\u001a\u00020\u0013H\u0002J\u0010\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u0013H\u0002J \u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020=2\u0006\u0010<\u001a\u00020=2\u0006\u0010D\u001a\u00020=H\u0002J\u0012\u0010E\u001a\u0002082\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J&\u0010H\u001a\u0004\u0018\u0001062\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006R"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/fragment/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "createIcon", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "date1", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "deleteTodaySchedule", "Landroid/widget/ImageView;", "editTodaySchedule", "Landroid/widget/RelativeLayout;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "layoutManager2", "nestedScrollView", "Landroidx/core/widget/NestedScrollView;", "noSchedule", "param1", "", "param2", "progressBar", "Landroid/widget/ProgressBar;", "quickLayoutManager", "quickRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "quickRecyclerAdapter", "Lcom/futuredeveloper/scheduleplanner/adapter/RepeatingTaskAdapter;", "quickTask", "Landroid/widget/EditText;", "quickTaskBox", "Landroid/widget/FrameLayout;", "quickText", "Landroid/widget/TextView;", "recyclerAdapter", "Lcom/futuredeveloper/scheduleplanner/adapter/MainRecyclerAdapter;", "recyclerAdapter2", "Lcom/futuredeveloper/scheduleplanner/adapter/CreatePlanAdapter;", "recyclerHome", "recyclerHome2", "repeatLayoutManager", "repeatRecycler", "repeatRecyclerAdapter", "repeatTaskBox", "repeatText", "repeatedTask", "saveQuickTask", "Landroid/widget/Button;", "scheduleByDateText", "tasksDone", "tasksDonePercentage", "timeInMillis", "", "verticalRow", "Landroid/view/View;", "cancelAlarm", "", "callback", "Lkotlin/Function1;", "getMonthFormat", "month", "", "getMonthFormat1", "getTodaysDate", "makeDate", "scheduleDate", "makeDateString", "day", "year", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "DBAsyncTask1", "GetAllQuickTasks", "GetAllRepeatTasks", "RetrieveScheduleItems", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private java.lang.String param1;
    private java.lang.String param2;
    private androidx.recyclerview.widget.RecyclerView recyclerHome;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    private com.futuredeveloper.scheduleplanner.adapter.MainRecyclerAdapter recyclerAdapter;
    private androidx.recyclerview.widget.RecyclerView recyclerHome2;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2;
    private com.futuredeveloper.scheduleplanner.adapter.CreatePlanAdapter recyclerAdapter2;
    private androidx.recyclerview.widget.RecyclerView repeatRecycler;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager repeatLayoutManager;
    private com.futuredeveloper.scheduleplanner.adapter.RepeatingTaskAdapter repeatRecyclerAdapter;
    private androidx.recyclerview.widget.RecyclerView quickRecycler;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager quickLayoutManager;
    private com.futuredeveloper.scheduleplanner.adapter.RepeatingTaskAdapter quickRecyclerAdapter;
    private com.google.android.material.floatingactionbutton.FloatingActionButton createIcon;
    private com.google.android.material.floatingactionbutton.FloatingActionButton repeatedTask;
    private android.widget.EditText quickTask;
    private android.widget.Button saveQuickTask;
    private android.widget.TextView tasksDone;
    private android.widget.TextView tasksDonePercentage;
    private android.widget.ProgressBar progressBar;
    private android.widget.RelativeLayout editTodaySchedule;
    private android.widget.ImageView deleteTodaySchedule;
    private android.view.View verticalRow;
    private android.widget.RelativeLayout noSchedule;
    private androidx.core.widget.NestedScrollView nestedScrollView;
    private android.widget.TextView repeatText;
    private android.widget.TextView quickText;
    private android.widget.TextView scheduleByDateText;
    private android.widget.FrameLayout repeatTaskBox;
    private android.widget.FrameLayout quickTaskBox;
    private long timeInMillis = 0L;
    @org.jetbrains.annotations.NotNull
    public static final com.futuredeveloper.scheduleplanner.fragment.HomeFragment.Companion Companion = null;
    private java.lang.StringBuilder date1;
    
    public HomeFragment() {
        super();
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Use this factory method to create a new instance of
     * this com.example.scheduleplanner.fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of com.example.scheduleplanner.fragment HomeFragment.
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final com.futuredeveloper.scheduleplanner.fragment.HomeFragment newInstance(@org.jetbrains.annotations.NotNull
    java.lang.String param1, @org.jetbrains.annotations.NotNull
    java.lang.String param2) {
        return null;
    }
    
    private final void cancelAlarm(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> callback) {
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
    
    private final int getMonthFormat1(java.lang.String month) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/fragment/HomeFragment$RetrieveScheduleItems;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/futuredeveloper/scheduleplanner/database/ScheduleEntity;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class RetrieveScheduleItems extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.futuredeveloper.scheduleplanner.database.ScheduleEntity>> {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        
        public RetrieveScheduleItems(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        protected java.util.List<com.futuredeveloper.scheduleplanner.database.ScheduleEntity> doInBackground(@org.jetbrains.annotations.NotNull
        java.lang.Void... params) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\r\u001a\u00020\u00032\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/fragment/HomeFragment$DBAsyncTask1;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Lcom/futuredeveloper/scheduleplanner/database/ScheduleEntity;", "context", "Landroid/content/Context;", "id", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getId", "()Ljava/lang/String;", "doInBackground", "params", "", "([Ljava/lang/Void;)Lcom/futuredeveloper/scheduleplanner/database/ScheduleEntity;", "app_debug"})
    public static final class DBAsyncTask1 extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.futuredeveloper.scheduleplanner.database.ScheduleEntity> {
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
        protected com.futuredeveloper.scheduleplanner.database.ScheduleEntity doInBackground(@org.jetbrains.annotations.NotNull
        java.lang.Void... params) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/fragment/HomeFragment$GetAllRepeatTasks;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/futuredeveloper/scheduleplanner/database/TaskEntity;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class GetAllRepeatTasks extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.futuredeveloper.scheduleplanner.database.TaskEntity>> {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        
        public GetAllRepeatTasks(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        protected java.util.List<com.futuredeveloper.scheduleplanner.database.TaskEntity> doInBackground(@org.jetbrains.annotations.NotNull
        java.lang.Void... params) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/fragment/HomeFragment$GetAllQuickTasks;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/futuredeveloper/scheduleplanner/database/TaskEntity;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class GetAllQuickTasks extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.futuredeveloper.scheduleplanner.database.TaskEntity>> {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        
        public GetAllQuickTasks(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        protected java.util.List<com.futuredeveloper.scheduleplanner.database.TaskEntity> doInBackground(@org.jetbrains.annotations.NotNull
        java.lang.Void... params) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/futuredeveloper/scheduleplanner/fragment/HomeFragment$Companion;", "", "()V", "newInstance", "Lcom/futuredeveloper/scheduleplanner/fragment/HomeFragment;", "param1", "", "param2", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Use this factory method to create a new instance of
         * this com.example.scheduleplanner.fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of com.example.scheduleplanner.fragment HomeFragment.
         */
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmStatic
        public final com.futuredeveloper.scheduleplanner.fragment.HomeFragment newInstance(@org.jetbrains.annotations.NotNull
        java.lang.String param1, @org.jetbrains.annotations.NotNull
        java.lang.String param2) {
            return null;
        }
    }
}