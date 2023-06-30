// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.retailer.monthly_tracker.di;

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
public final class MonthlyTrackerModule_GetCredentialsErrorDialogFactory implements Factory<CredentialsErrorDialog> {
  private final MonthlyTrackerModule module;

  private final Provider<String> errorMessageProvider;

  public MonthlyTrackerModule_GetCredentialsErrorDialogFactory(MonthlyTrackerModule module,
      Provider<String> errorMessageProvider) {
    this.module = module;
    this.errorMessageProvider = errorMessageProvider;
  }

  @Override
  public CredentialsErrorDialog get() {
    return getCredentialsErrorDialog(module, errorMessageProvider.get());
  }

  public static MonthlyTrackerModule_GetCredentialsErrorDialogFactory create(
      MonthlyTrackerModule module, Provider<String> errorMessageProvider) {
    return new MonthlyTrackerModule_GetCredentialsErrorDialogFactory(module, errorMessageProvider);
  }

  public static CredentialsErrorDialog getCredentialsErrorDialog(MonthlyTrackerModule instance,
      String errorMessage) {
    return Preconditions.checkNotNullFromProvides(instance.getCredentialsErrorDialog(errorMessage));
  }
}
