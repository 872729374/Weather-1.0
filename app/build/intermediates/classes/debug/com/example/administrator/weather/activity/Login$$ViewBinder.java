// Generated code from Butter Knife. Do not modify!
package com.example.administrator.weather.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Login$$ViewBinder<T extends com.example.administrator.weather.activity.Login> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492945, "field 'usernameEdit'");
    target.usernameEdit = finder.castView(view, 2131492945, "field 'usernameEdit'");
    view = finder.findRequiredView(source, 2131492946, "field 'passwordEdit'");
    target.passwordEdit = finder.castView(view, 2131492946, "field 'passwordEdit'");
    view = finder.findRequiredView(source, 2131492947, "field 'loginButton'");
    target.loginButton = finder.castView(view, 2131492947, "field 'loginButton'");
    view = finder.findRequiredView(source, 2131492948, "field 'checkboxButton'");
    target.checkboxButton = finder.castView(view, 2131492948, "field 'checkboxButton'");
  }

  @Override public void unbind(T target) {
    target.usernameEdit = null;
    target.passwordEdit = null;
    target.loginButton = null;
    target.checkboxButton = null;
  }
}
