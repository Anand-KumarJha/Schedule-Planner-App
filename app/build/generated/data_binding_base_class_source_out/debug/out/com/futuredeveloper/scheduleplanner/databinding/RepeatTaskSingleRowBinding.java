// Generated by view binder compiler. Do not edit!
package com.futuredeveloper.scheduleplanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.futuredeveloper.scheduleplanner.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RepeatTaskSingleRowBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView count;

  @NonNull
  public final ImageView delete2;

  @NonNull
  public final TextView description;

  @NonNull
  public final ImageView done;

  @NonNull
  public final ImageView edit2;

  @NonNull
  public final View horizontalRow;

  @NonNull
  public final RelativeLayout taskView;

  @NonNull
  public final TextView time;

  @NonNull
  public final TextView title;

  @NonNull
  public final View verticalRow;

  private RepeatTaskSingleRowBinding(@NonNull CardView rootView, @NonNull TextView count,
      @NonNull ImageView delete2, @NonNull TextView description, @NonNull ImageView done,
      @NonNull ImageView edit2, @NonNull View horizontalRow, @NonNull RelativeLayout taskView,
      @NonNull TextView time, @NonNull TextView title, @NonNull View verticalRow) {
    this.rootView = rootView;
    this.count = count;
    this.delete2 = delete2;
    this.description = description;
    this.done = done;
    this.edit2 = edit2;
    this.horizontalRow = horizontalRow;
    this.taskView = taskView;
    this.time = time;
    this.title = title;
    this.verticalRow = verticalRow;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RepeatTaskSingleRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RepeatTaskSingleRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.repeat_task_single_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RepeatTaskSingleRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.count;
      TextView count = ViewBindings.findChildViewById(rootView, id);
      if (count == null) {
        break missingId;
      }

      id = R.id.delete2;
      ImageView delete2 = ViewBindings.findChildViewById(rootView, id);
      if (delete2 == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.done;
      ImageView done = ViewBindings.findChildViewById(rootView, id);
      if (done == null) {
        break missingId;
      }

      id = R.id.edit2;
      ImageView edit2 = ViewBindings.findChildViewById(rootView, id);
      if (edit2 == null) {
        break missingId;
      }

      id = R.id.horizontal_row;
      View horizontalRow = ViewBindings.findChildViewById(rootView, id);
      if (horizontalRow == null) {
        break missingId;
      }

      id = R.id.taskView;
      RelativeLayout taskView = ViewBindings.findChildViewById(rootView, id);
      if (taskView == null) {
        break missingId;
      }

      id = R.id.time;
      TextView time = ViewBindings.findChildViewById(rootView, id);
      if (time == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.vertical_row;
      View verticalRow = ViewBindings.findChildViewById(rootView, id);
      if (verticalRow == null) {
        break missingId;
      }

      return new RepeatTaskSingleRowBinding((CardView) rootView, count, delete2, description, done,
          edit2, horizontalRow, taskView, time, title, verticalRow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
