// Generated by view binder compiler. Do not edit!
package com.example.mahnyoh.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mahnyoh.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final CardView ViewSteps;

  @NonNull
  public final CardView cardView5;

  @NonNull
  public final ImageView cardio;

  @NonNull
  public final HorizontalScrollView horizontalScrollView2;

  @NonNull
  public final ShapeableImageView notifyBtnId;

  @NonNull
  public final LinearLayout nt;

  @NonNull
  public final ImageView sprint;

  @NonNull
  public final ImageView squat;

  @NonNull
  public final ImageView strength;

  @NonNull
  public final ImageView stretch;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView tv1;

  private FragmentHomeBinding(@NonNull ScrollView rootView, @NonNull CardView ViewSteps,
      @NonNull CardView cardView5, @NonNull ImageView cardio,
      @NonNull HorizontalScrollView horizontalScrollView2, @NonNull ShapeableImageView notifyBtnId,
      @NonNull LinearLayout nt, @NonNull ImageView sprint, @NonNull ImageView squat,
      @NonNull ImageView strength, @NonNull ImageView stretch, @NonNull TextView textView10,
      @NonNull TextView textView11, @NonNull TextView textView18, @NonNull TextView textView19,
      @NonNull TextView tv1) {
    this.rootView = rootView;
    this.ViewSteps = ViewSteps;
    this.cardView5 = cardView5;
    this.cardio = cardio;
    this.horizontalScrollView2 = horizontalScrollView2;
    this.notifyBtnId = notifyBtnId;
    this.nt = nt;
    this.sprint = sprint;
    this.squat = squat;
    this.strength = strength;
    this.stretch = stretch;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView18 = textView18;
    this.textView19 = textView19;
    this.tv1 = tv1;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ViewSteps;
      CardView ViewSteps = ViewBindings.findChildViewById(rootView, id);
      if (ViewSteps == null) {
        break missingId;
      }

      id = R.id.cardView5;
      CardView cardView5 = ViewBindings.findChildViewById(rootView, id);
      if (cardView5 == null) {
        break missingId;
      }

      id = R.id.cardio;
      ImageView cardio = ViewBindings.findChildViewById(rootView, id);
      if (cardio == null) {
        break missingId;
      }

      id = R.id.horizontalScrollView2;
      HorizontalScrollView horizontalScrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (horizontalScrollView2 == null) {
        break missingId;
      }

      id = R.id.notifyBtn_id;
      ShapeableImageView notifyBtnId = ViewBindings.findChildViewById(rootView, id);
      if (notifyBtnId == null) {
        break missingId;
      }

      id = R.id.nt;
      LinearLayout nt = ViewBindings.findChildViewById(rootView, id);
      if (nt == null) {
        break missingId;
      }

      id = R.id.sprint;
      ImageView sprint = ViewBindings.findChildViewById(rootView, id);
      if (sprint == null) {
        break missingId;
      }

      id = R.id.squat;
      ImageView squat = ViewBindings.findChildViewById(rootView, id);
      if (squat == null) {
        break missingId;
      }

      id = R.id.strength;
      ImageView strength = ViewBindings.findChildViewById(rootView, id);
      if (strength == null) {
        break missingId;
      }

      id = R.id.stretch;
      ImageView stretch = ViewBindings.findChildViewById(rootView, id);
      if (stretch == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.tv1;
      TextView tv1 = ViewBindings.findChildViewById(rootView, id);
      if (tv1 == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ScrollView) rootView, ViewSteps, cardView5, cardio,
          horizontalScrollView2, notifyBtnId, nt, sprint, squat, strength, stretch, textView10,
          textView11, textView18, textView19, tv1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
