// Generated by view binder compiler. Do not edit!
package com.example.mahnyoh.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mahnyoh.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText eMail;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout logInLayout;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final EditText passwords;

  @NonNull
  public final TextView signupButton;

  @NonNull
  public final LinearLayout singUpLayout;

  private LoginBinding(@NonNull LinearLayout rootView, @NonNull EditText eMail,
      @NonNull ImageView imageView, @NonNull LinearLayout logInLayout, @NonNull Button loginButton,
      @NonNull EditText passwords, @NonNull TextView signupButton,
      @NonNull LinearLayout singUpLayout) {
    this.rootView = rootView;
    this.eMail = eMail;
    this.imageView = imageView;
    this.logInLayout = logInLayout;
    this.loginButton = loginButton;
    this.passwords = passwords;
    this.signupButton = signupButton;
    this.singUpLayout = singUpLayout;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LoginBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.eMail;
      EditText eMail = ViewBindings.findChildViewById(rootView, id);
      if (eMail == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.logInLayout;
      LinearLayout logInLayout = ViewBindings.findChildViewById(rootView, id);
      if (logInLayout == null) {
        break missingId;
      }

      id = R.id.login_button;
      Button loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.passwords;
      EditText passwords = ViewBindings.findChildViewById(rootView, id);
      if (passwords == null) {
        break missingId;
      }

      id = R.id.signup_button;
      TextView signupButton = ViewBindings.findChildViewById(rootView, id);
      if (signupButton == null) {
        break missingId;
      }

      id = R.id.singUpLayout;
      LinearLayout singUpLayout = ViewBindings.findChildViewById(rootView, id);
      if (singUpLayout == null) {
        break missingId;
      }

      return new LoginBinding((LinearLayout) rootView, eMail, imageView, logInLayout, loginButton,
          passwords, signupButton, singUpLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
