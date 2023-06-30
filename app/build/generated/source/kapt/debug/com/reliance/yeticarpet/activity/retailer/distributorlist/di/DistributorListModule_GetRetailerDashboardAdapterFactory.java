// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.retailer.distributorlist.di;

import com.reliance.yeticarpet.activity.retailer.distributorlist.adapter.DistributorListAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DistributorListModule_GetRetailerDashboardAdapterFactory implements Factory<DistributorListAdapter> {
  private final DistributorListModule module;

  public DistributorListModule_GetRetailerDashboardAdapterFactory(DistributorListModule module) {
    this.module = module;
  }

  @Override
  public DistributorListAdapter get() {
    return getRetailerDashboardAdapter(module);
  }

  public static DistributorListModule_GetRetailerDashboardAdapterFactory create(
      DistributorListModule module) {
    return new DistributorListModule_GetRetailerDashboardAdapterFactory(module);
  }

  public static DistributorListAdapter getRetailerDashboardAdapter(DistributorListModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getRetailerDashboardAdapter());
  }
}