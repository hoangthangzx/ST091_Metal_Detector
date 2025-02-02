// Generated by data binding compiler. Do not edit!
package com.metalsensor.gold.detector.finder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.metalsensor.gold.detector.finder.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCoinrecognitionBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imv1;

  @NonNull
  public final ImageView imv2;

  @NonNull
  public final ImageView imvBack;

  @NonNull
  public final ImageView imvTick;

  @NonNull
  public final LinearLayout library;

  @NonNull
  public final LinearLayout linearLayout5;

  @NonNull
  public final LinearLayout lnStatus2;

  @NonNull
  public final LinearLayout scan;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final TextView tv1;

  @NonNull
  public final TextView tv2;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final ViewPager2 viewPager;

  protected ActivityCoinrecognitionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView imv1, ImageView imv2, ImageView imvBack, ImageView imvTick,
      LinearLayout library, LinearLayout linearLayout5, LinearLayout lnStatus2, LinearLayout scan,
      TabLayout tabLayout, TextView tv1, TextView tv2, TextView tvTitle, ViewPager2 viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imv1 = imv1;
    this.imv2 = imv2;
    this.imvBack = imvBack;
    this.imvTick = imvTick;
    this.library = library;
    this.linearLayout5 = linearLayout5;
    this.lnStatus2 = lnStatus2;
    this.scan = scan;
    this.tabLayout = tabLayout;
    this.tv1 = tv1;
    this.tv2 = tv2;
    this.tvTitle = tvTitle;
    this.viewPager = viewPager;
  }

  @NonNull
  public static ActivityCoinrecognitionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_coinrecognition, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCoinrecognitionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCoinrecognitionBinding>inflateInternal(inflater, R.layout.activity_coinrecognition, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCoinrecognitionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_coinrecognition, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCoinrecognitionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCoinrecognitionBinding>inflateInternal(inflater, R.layout.activity_coinrecognition, null, false, component);
  }

  public static ActivityCoinrecognitionBinding bind(@NonNull View view) {
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
  public static ActivityCoinrecognitionBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityCoinrecognitionBinding)bind(component, view, R.layout.activity_coinrecognition);
  }
}
