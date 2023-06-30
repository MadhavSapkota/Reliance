// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.fragment.distributor.dashboard.di;

import com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.RetailerListAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DistributorDashboardFragmentModule_GetDistributorDashboardAdapterFactory implements Factory<RetailerListAdapter> {
  private final DistributorDashboardFragmentModule module;

  public DistributorDashboardFragmentModule_GetDistributorDashboardAdapterFactory(
      DistributorDashboardFragmentModule module) {
    this.module = module;
  }

  @Override
  public RetailerListAdapter get() {
    return getDistributorDashboardAdapter(module);
  }

  public static DistributorDashboardFragmentModule_GetDistributorDashboardAdapterFactory create(
      DistributorDashboardFragmentModule module) {
    return new DistributorDashboardFragmentModule_GetDistributorDashboardAdapterFactory(module);
  }

  public static RetailerListAdapter getDistributorDashboardAdapter(
      DistributorDashboardFragmentModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getDistributorDashboardAdapter());
  }
}