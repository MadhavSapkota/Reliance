// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.retailer.monthly_tracker.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MonthlyTrackerModule_GetErrorMessageFactory implements Factory<String> {
  private final MonthlyTrackerModule module;

  public MonthlyTrackerModule_GetErrorMessageFactory(MonthlyTrackerModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return getErrorMessage(module);
  }

  public static MonthlyTrackerModule_GetErrorMessageFactory create(MonthlyTrackerModule module) {
    return new MonthlyTrackerModule_GetErrorMessageFactory(module);
  }

  public static String getErrorMessage(MonthlyTrackerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getErrorMessage());
  }
}