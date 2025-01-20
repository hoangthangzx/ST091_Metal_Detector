// Generated by view binder compiler. Do not edit!
package com.metalsensor.gold.detector.finder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.metalsensor.gold.detector.finder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomDialogPermissionBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView tvNo;

  @NonNull
  public final TextView tvYes;

  private CustomDialogPermissionBinding(@NonNull LinearLayout rootView,
      @NonNull TextView textView16, @NonNull TextView textView17, @NonNull TextView tvNo,
      @NonNull TextView tvYes) {
    this.rootView = rootView;
    this.textView16 = textView16;
    this.textView17 = textView17;
    this.tvNo = tvNo;
    this.tvYes = tvYes;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomDialogPermissionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomDialogPermissionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_dialog_permission, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomDialogPermissionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = ViewBindings.findChildViewById(rootView, id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.tv_No;
      TextView tvNo = ViewBindings.findChildViewById(rootView, id);
      if (tvNo == null) {
        break missingId;
      }

      id = R.id.tv_yes;
      TextView tvYes = ViewBindings.findChildViewById(rootView, id);
      if (tvYes == null) {
        break missingId;
      }

      return new CustomDialogPermissionBinding((LinearLayout) rootView, textView16, textView17,
          tvNo, tvYes);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
