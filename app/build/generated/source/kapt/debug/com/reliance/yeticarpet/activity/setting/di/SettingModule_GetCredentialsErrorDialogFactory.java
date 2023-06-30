// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.setting.di;

import com.reliance.yeticarpet.dialog.CredentialsErrorDialog;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingModule_GetCredentialsErrorDialogFactory implements Factory<CredentialsErrorDialog> {
  private final SettingModule module;

  private final Provider<String> errorMessageProvider;

  public SettingModule_GetCredentialsErrorDialogFactory(SettingModule module,
      Provider<String> errorMessageProvider) {
    this.module = module;
    this.errorMessageProvider = errorMessageProvider;
  }

  @Override
  public CredentialsErrorDialog get() {
    return getCredentialsErrorDialog(module, errorMessageProvider.get());
  }

  public static SettingModule_GetCredentialsErrorDialogFactory create(SettingModule module,
      Provider<String> errorMessageProvider) {
    return new SettingModule_GetCredentialsErrorDialogFactory(module, errorMessageProvider);
  }

  public static CredentialsErrorDialog getCredentialsErrorDialog(SettingModule instance,
      String errorMessage) {
    return Preconditions.checkNotNullFromProvides(instance.getCredentialsErrorDialog(errorMessage));
  }
}
