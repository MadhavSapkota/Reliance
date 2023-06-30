// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.fragment.distributor.dashboard.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DistributorDashboardFragmentModule_GetErrorMessageFactory implements Factory<String> {
  private final DistributorDashboardFragmentModule module;

  public DistributorDashboardFragmentModule_GetErrorMessageFactory(
      DistributorDashboardFragmentModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return getErrorMessage(module);
  }

  public static DistributorDashboardFragmentModule_GetErrorMessageFactory create(
      DistributorDashboardFragmentModule module) {
    return new DistributorDashboardFragmentModule_GetErrorMessageFactory(module);
  }

  public static String getErrorMessage(DistributorDashboardFragmentModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getErrorMessage());
  }
}