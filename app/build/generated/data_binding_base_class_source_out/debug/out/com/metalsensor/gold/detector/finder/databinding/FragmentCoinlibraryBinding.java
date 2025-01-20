// Generated by view binder compiler. Do not edit!
package com.metalsensor.gold.detector.finder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.metalsensor.gold.detector.finder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCoinlibraryBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout3;

  @NonNull
  public final EditText edtsearch;

  @NonNull
  public final ImageView icsearch;

  @NonNull
  public final ConstraintLayout noitem;

  @NonNull
  public final RecyclerView rcvCoin;

  private FragmentCoinlibraryBinding(@NonNull FrameLayout rootView,
      @NonNull ConstraintLayout constraintLayout3, @NonNull EditText edtsearch,
      @NonNull ImageView icsearch, @NonNull ConstraintLayout noitem,
      @NonNull RecyclerView rcvCoin) {
    this.rootView = rootView;
    this.constraintLayout3 = constraintLayout3;
    this.edtsearch = edtsearch;
    this.icsearch = icsearch;
    this.noitem = noitem;
    this.rcvCoin = rcvCoin;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCoinlibraryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCoinlibraryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_coinlibrary, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCoinlibraryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout3;
      ConstraintLayout constraintLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout3 == null) {
        break missingId;
      }

      id = R.id.edtsearch;
      EditText edtsearch = ViewBindings.findChildViewById(rootView, id);
      if (edtsearch == null) {
        break missingId;
      }

      id = R.id.icsearch;
      ImageView icsearch = ViewBindings.findChildViewById(rootView, id);
      if (icsearch == null) {
        break missingId;
      }

      id = R.id.noitem;
      ConstraintLayout noitem = ViewBindings.findChildViewById(rootView, id);
      if (noitem == null) {
        break missingId;
      }

      id = R.id.rcvCoin;
      RecyclerView rcvCoin = ViewBindings.findChildViewById(rootView, id);
      if (rcvCoin == null) {
        break missingId;
      }

      return new FragmentCoinlibraryBinding((FrameLayout) rootView, constraintLayout3, edtsearch,
          icsearch, noitem, rcvCoin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
