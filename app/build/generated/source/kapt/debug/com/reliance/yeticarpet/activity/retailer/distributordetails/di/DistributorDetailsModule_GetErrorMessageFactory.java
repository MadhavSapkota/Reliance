// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.retailer.distributordetails.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DistributorDetailsModule_GetErrorMessageFactory implements Factory<String> {
  private final DistributorDetailsModule module;

  public DistributorDetailsModule_GetErrorMessageFactory(DistributorDetailsModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return getErrorMessage(module);
  }

  public static DistributorDetailsModule_GetErrorMessageFactory create(
      DistributorDetailsModule module) {
    return new DistributorDetailsModule_GetErrorMessageFactory(module);
  }

  public static String getErrorMessage(DistributorDetailsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getErrorMessage());
  }
}
