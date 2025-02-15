// Generated by view binder compiler. Do not edit!
package com.example.homework6.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.homework6.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline bottomguideline;

  @NonNull
  public final Button btnChangeTheme;

  @NonNull
  public final Button btnOpenDialog;

  @NonNull
  public final TextView dateText;

  @NonNull
  public final Guideline horizontal50;

  @NonNull
  public final Guideline topguideline;

  @NonNull
  public final Guideline vertical50;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull Guideline bottomguideline, @NonNull Button btnChangeTheme,
      @NonNull Button btnOpenDialog, @NonNull TextView dateText, @NonNull Guideline horizontal50,
      @NonNull Guideline topguideline, @NonNull Guideline vertical50) {
    this.rootView = rootView;
    this.bottomguideline = bottomguideline;
    this.btnChangeTheme = btnChangeTheme;
    this.btnOpenDialog = btnOpenDialog;
    this.dateText = dateText;
    this.horizontal50 = horizontal50;
    this.topguideline = topguideline;
    this.vertical50 = vertical50;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomguideline;
      Guideline bottomguideline = ViewBindings.findChildViewById(rootView, id);
      if (bottomguideline == null) {
        break missingId;
      }

      id = R.id.btnChangeTheme;
      Button btnChangeTheme = ViewBindings.findChildViewById(rootView, id);
      if (btnChangeTheme == null) {
        break missingId;
      }

      id = R.id.btnOpenDialog;
      Button btnOpenDialog = ViewBindings.findChildViewById(rootView, id);
      if (btnOpenDialog == null) {
        break missingId;
      }

      id = R.id.dateText;
      TextView dateText = ViewBindings.findChildViewById(rootView, id);
      if (dateText == null) {
        break missingId;
      }

      id = R.id.horizontal50;
      Guideline horizontal50 = ViewBindings.findChildViewById(rootView, id);
      if (horizontal50 == null) {
        break missingId;
      }

      id = R.id.topguideline;
      Guideline topguideline = ViewBindings.findChildViewById(rootView, id);
      if (topguideline == null) {
        break missingId;
      }

      id = R.id.vertical50;
      Guideline vertical50 = ViewBindings.findChildViewById(rootView, id);
      if (vertical50 == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, bottomguideline, btnChangeTheme,
          btnOpenDialog, dateText, horizontal50, topguideline, vertical50);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
