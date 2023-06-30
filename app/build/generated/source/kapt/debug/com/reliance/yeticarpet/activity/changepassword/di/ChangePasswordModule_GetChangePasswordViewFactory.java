// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.changepassword.di;

import com.reliance.yeticarpet.activity.changepassword.mvp.ChangePasswordView;
import com.reliance.yeticarpet.dialog.LoginErrorDialog;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChangePasswordModule_GetChangePasswordViewFactory implements Factory<ChangePasswordView> {
  private final ChangePasswordModule module;

  private final Provider<LoginErrorDialog> loginErrorDialogProvider;

  public ChangePasswordModule_GetChangePasswordViewFactory(ChangePasswordModule module,
      Provider<LoginErrorDialog> loginErrorDialogProvider) {
    this.module = module;
    this.loginErrorDialogProvider = loginErrorDialogProvider;
  }

  @Override
  public ChangePasswordView get() {
    return getChangePasswordView(module, loginErrorDialogProvider.get());
  }

  public static ChangePasswordModule_GetChangePasswordViewFactory create(
      ChangePasswordModule module, Provider<LoginErrorDialog> loginErrorDialogProvider) {
    return new ChangePasswordModule_GetChangePasswordViewFactory(module, loginErrorDialogProvider);
  }

  public static ChangePasswordView getChangePasswordView(ChangePasswordModule instance,
      LoginErrorDialog loginErrorDialog) {
    return Preconditions.checkNotNullFromProvides(instance.getChangePasswordView(loginErrorDialog));
  }
}