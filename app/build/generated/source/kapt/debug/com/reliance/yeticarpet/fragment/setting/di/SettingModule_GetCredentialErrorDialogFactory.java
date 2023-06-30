// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.fragment.setting.di;

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
public final class SettingModule_GetCredentialErrorDialogFactory implements Factory<CredentialsErrorDialog> {
  private final SettingModule module;

  private final Provider<String> errorMessageProvider;

  public SettingModule_GetCredentialErrorDialogFactory(SettingModule module,
      Provider<String> errorMessageProvider) {
    this.module = module;
    this.errorMessageProvider = errorMessageProvider;
  }

  @Override
  public CredentialsErrorDialog get() {
    return getCredentialErrorDialog(module, errorMessageProvider.get());
  }

  public static SettingModule_GetCredentialErrorDialogFactory create(SettingModule module,
      Provider<String> errorMessageProvider) {
    return new SettingModule_GetCredentialErrorDialogFactory(module, errorMessageProvider);
  }

  public static CredentialsErrorDialog getCredentialErrorDialog(SettingModule instance,
      String errorMessage) {
    return Preconditions.checkNotNullFromProvides(instance.getCredentialErrorDialog(errorMessage));
  }
}