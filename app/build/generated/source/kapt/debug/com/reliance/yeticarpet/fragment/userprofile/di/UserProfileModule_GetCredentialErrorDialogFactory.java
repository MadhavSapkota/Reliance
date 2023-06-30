// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.fragment.userprofile.di;

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
public final class UserProfileModule_GetCredentialErrorDialogFactory implements Factory<CredentialsErrorDialog> {
  private final UserProfileModule module;

  private final Provider<String> errorMessageProvider;

  public UserProfileModule_GetCredentialErrorDialogFactory(UserProfileModule module,
      Provider<String> errorMessageProvider) {
    this.module = module;
    this.errorMessageProvider = errorMessageProvider;
  }

  @Override
  public CredentialsErrorDialog get() {
    return getCredentialErrorDialog(module, errorMessageProvider.get());
  }

  public static UserProfileModule_GetCredentialErrorDialogFactory create(UserProfileModule module,
      Provider<String> errorMessageProvider) {
    return new UserProfileModule_GetCredentialErrorDialogFactory(module, errorMessageProvider);
  }

  public static CredentialsErrorDialog getCredentialErrorDialog(UserProfileModule instance,
      String errorMessage) {
    return Preconditions.checkNotNullFromProvides(instance.getCredentialErrorDialog(errorMessage));
  }
}