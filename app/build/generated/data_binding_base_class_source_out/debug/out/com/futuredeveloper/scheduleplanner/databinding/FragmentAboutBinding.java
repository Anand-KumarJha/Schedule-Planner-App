// Generated by view binder compiler. Do not edit!
package com.futuredeveloper.scheduleplanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.futuredeveloper.scheduleplanner.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAboutBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button contactButton;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView termsCondition;

  @NonNull
  public final TextView termsConditionDescription;

  @NonNull
  public final TextView text1;

  private FragmentAboutBinding(@NonNull ScrollView rootView, @NonNull Button contactButton,
      @NonNull TextView description, @NonNull TextView termsCondition,
      @NonNull TextView termsConditionDescription, @NonNull TextView text1) {
    this.rootView = rootView;
    this.contactButton = contactButton;
    this.description = description;
    this.termsCondition = termsCondition;
    this.termsConditionDescription = termsConditionDescription;
    this.text1 = text1;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contactButton;
      Button contactButton = ViewBindings.findChildViewById(rootView, id);
      if (contactButton == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.terms_condition;
      TextView termsCondition = ViewBindings.findChildViewById(rootView, id);
      if (termsCondition == null) {
        break missingId;
      }

      id = R.id.terms_condition_description;
      TextView termsConditionDescription = ViewBindings.findChildViewById(rootView, id);
      if (termsConditionDescription == null) {
        break missingId;
      }

      id = R.id.text1;
      TextView text1 = ViewBindings.findChildViewById(rootView, id);
      if (text1 == null) {
        break missingId;
      }

      return new FragmentAboutBinding((ScrollView) rootView, contactButton, description,
          termsCondition, termsConditionDescription, text1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}