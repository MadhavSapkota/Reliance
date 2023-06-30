// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.fragment.retailer.dashboard.di;

import com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.RetailerDashboardAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetailerDashboardFragmentModule_GetRetailerDashboardAdapterFactory implements Factory<RetailerDashboardAdapter> {
  private final RetailerDashboardFragmentModule module;

  public RetailerDashboardFragmentModule_GetRetailerDashboardAdapterFactory(
      RetailerDashboardFragmentModule module) {
    this.module = module;
  }

  @Override
  public RetailerDashboardAdapter get() {
    return getRetailerDashboardAdapter(module);
  }

  public static RetailerDashboardFragmentModule_GetRetailerDashboardAdapterFactory create(
      RetailerDashboardFragmentModule module) {
    return new RetailerDashboardFragmentModule_GetRetailerDashboardAdapterFactory(module);
  }

  public static RetailerDashboardAdapter getRetailerDashboardAdapter(
      RetailerDashboardFragmentModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getRetailerDashboardAdapter());
  }
}
