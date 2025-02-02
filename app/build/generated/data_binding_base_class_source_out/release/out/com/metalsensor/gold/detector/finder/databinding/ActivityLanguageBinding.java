// Generated by data binding compiler. Do not edit!
package com.metalsensor.gold.detector.finder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.metalsensor.gold.detector.finder.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLanguageBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final ImageView imvBack;

  @NonNull
  public final ImageView imvText;

  @NonNull
  public final ImageView imvTick;

  @NonNull
  public final LinearLayout lnStatus;

  @NonNull
  public final LinearLayout lnStatus2;

  @NonNull
  public final RecyclerView recLanguage;

  @NonNull
  public final TextView tvLanguage1;

  @NonNull
  public final TextView tvLanguage2;

  protected ActivityLanguageBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout frameLayout, ImageView imvBack, ImageView imvText, ImageView imvTick,
      LinearLayout lnStatus, LinearLayout lnStatus2, RecyclerView recLanguage, TextView tvLanguage1,
      TextView tvLanguage2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.frameLayout = frameLayout;
    this.imvBack = imvBack;
    this.imvText = imvText;
    this.imvTick = imvTick;
    this.lnStatus = lnStatus;
    this.lnStatus2 = lnStatus2;
    this.recLanguage = recLanguage;
    this.tvLanguage1 = tvLanguage1;
    this.tvLanguage2 = tvLanguage2;
  }

  @NonNull
  public static ActivityLanguageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_language, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLanguageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLanguageBinding>inflateInternal(inflater, R.layout.activity_language, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLanguageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_language, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLanguageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLanguageBinding>inflateInternal(inflater, R.layout.activity_language, null, false, component);
  }

  public static ActivityLanguageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityLanguageBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLanguageBinding)bind(component, view, R.layout.activity_language);
  }
}
