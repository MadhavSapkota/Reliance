// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.fragment.distributor.dashboard.di;

import com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardModel;
import com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardPresenter;
import com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardView;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DistributorDashboardFragmentModule_GetDistributorDashboardPresenterFactory implements Factory<DistributorDashboardPresenter> {
  private final DistributorDashboardFragmentModule module;

  private final Provider<DistributorDashboardView> distributorDashboardViewProvider;

  private final Provider<DistributorDashboardModel> distributorDashboardModelProvider;

  public DistributorDashboardFragmentModule_GetDistributorDashboardPresenterFactory(
      DistributorDashboardFragmentModule module,
      Provider<DistributorDashboardView> distributorDashboardViewProvider,
      Provider<DistributorDashboardModel> distributorDashboardModelProvider) {
    this.module = module;
    this.distributorDashboardViewProvider = distributorDashboardViewProvider;
    this.distributorDashboardModelProvider = distributorDashboardModelProvider;
  }

  @Override
  public DistributorDashboardPresenter get() {
    return getDistributorDashboardPresenter(module, distributorDashboardViewProvider.get(), distributorDashboardModelProvider.get());
  }

  public static DistributorDashboardFragmentModule_GetDistributorDashboardPresenterFactory create(
      DistributorDashboardFragmentModule module,
      Provider<DistributorDashboardView> distributorDashboardViewProvider,
      Provider<DistributorDashboardModel> distributorDashboardModelProvider) {
    return new DistributorDashboardFragmentModule_GetDistributorDashboardPresenterFactory(module, distributorDashboardViewProvider, distributorDashboardModelProvider);
  }

  public static DistributorDashboardPresenter getDistributorDashboardPresenter(
      DistributorDashboardFragmentModule instance,
      DistributorDashboardView distributorDashboardView,
      DistributorDashboardModel distributorDashboardModel) {
    return Preconditions.checkNotNullFromProvides(instance.getDistributorDashboardPresenter(distributorDashboardView, distributorDashboardModel));
  }
}
