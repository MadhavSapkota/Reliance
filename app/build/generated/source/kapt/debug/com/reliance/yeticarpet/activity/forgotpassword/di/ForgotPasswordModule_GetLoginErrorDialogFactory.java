// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.forgotpassword.di;

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
public final class ForgotPasswordModule_GetLoginErrorDialogFactory implements Factory<LoginErrorDialog> {
  private final ForgotPasswordModule module;

  private final Provider<String> errorMessageProvider;

  public ForgotPasswordModule_GetLoginErrorDialogFactory(ForgotPasswordModule module,
      Provider<String> errorMessageProvider) {
    this.module = module;
    this.errorMessageProvider = errorMessageProvider;
  }

  @Override
  public LoginErrorDialog get() {
    return getLoginErrorDialog(module, errorMessageProvider.get());
  }

  public static ForgotPasswordModule_GetLoginErrorDialogFactory create(ForgotPasswordModule module,
      Provider<String> errorMessageProvider) {
    return new ForgotPasswordModule_GetLoginErrorDialogFactory(module, errorMessageProvider);
  }

  public static LoginErrorDialog getLoginErrorDialog(ForgotPasswordModule instance,
      String errorMessage) {
    return Preconditions.checkNotNullFromProvides(instance.getLoginErrorDialog(errorMessage));
  }
}
