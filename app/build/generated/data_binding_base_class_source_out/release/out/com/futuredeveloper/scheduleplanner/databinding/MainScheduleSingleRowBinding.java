// Generated by view binder compiler. Do not edit!
package com.futuredeveloper.scheduleplanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.futuredeveloper.scheduleplanner.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MainScheduleSingleRowBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView itemDescription;

  @NonNull
  public final TextView itemName;

  @NonNull
  public final RelativeLayout mainScheduleScheduleRow;

  @NonNull
  public final FrameLayout repeatTaskBox;

  @NonNull
  public final TextView rowCount;

  @NonNull
  public final TextView taskTime;

  private MainScheduleSingleRowBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView itemDescription, @NonNull TextView itemName,
      @NonNull RelativeLayout mainScheduleScheduleRow, @NonNull FrameLayout repeatTaskBox,
      @NonNull TextView rowCount, @NonNull TextView taskTime) {
    this.rootView = rootView;
    this.itemDescription = itemDescription;
    this.itemName = itemName;
    this.mainScheduleScheduleRow = mainScheduleScheduleRow;
    this.repeatTaskBox = repeatTaskBox;
    this.rowCount = rowCount;
    this.taskTime = taskTime;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainScheduleSingleRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainScheduleSingleRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_schedule_single_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainScheduleSingleRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.itemDescription;
      TextView itemDescription = ViewBindings.findChildViewById(rootView, id);
      if (itemDescription == null) {
        break missingId;
      }

      id = R.id.itemName;
      TextView itemName = ViewBindings.findChildViewById(rootView, id);
      if (itemName == null) {
        break missingId;
      }

      RelativeLayout mainScheduleScheduleRow = (RelativeLayout) rootView;

      id = R.id.repeat_task_box;
      FrameLayout repeatTaskBox = ViewBindings.findChildViewById(rootView, id);
      if (repeatTaskBox == null) {
        break missingId;
      }

      id = R.id.rowCount;
      TextView rowCount = ViewBindings.findChildViewById(rootView, id);
      if (rowCount == null) {
        break missingId;
      }

      id = R.id.task_time;
      TextView taskTime = ViewBindings.findChildViewById(rootView, id);
      if (taskTime == null) {
        break missingId;
      }

      return new MainScheduleSingleRowBinding((RelativeLayout) rootView, itemDescription, itemName,
          mainScheduleScheduleRow, repeatTaskBox, rowCount, taskTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
