// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.retailer.dashboard.di;

import com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardModel;
import com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardPresenter;
import com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetailerDashboardModule_GetRetailerDashboardPresenterFactory implements Factory<RetailerDashboardPresenter> {
  private final RetailerDashboardModule module;

  private final Provider<RetailerDashboardView> retailerDashboardViewProvider;

  private final Provider<RetailerDashboardModel> retailerDashboardModelProvider;

  public RetailerDashboardModule_GetRetailerDashboardPresenterFactory(
      RetailerDashboardModule module, Provider<RetailerDashboardView> retailerDashboardViewProvider,
      Provider<RetailerDashboardModel> retailerDashboardModelProvider) {
    this.module = module;
    this.retailerDashboardViewProvider = retailerDashboardViewProvider;
    this.retailerDashboardModelProvider = retailerDashboardModelProvider;
  }

  @Override
  public RetailerDashboardPresenter get() {
    return getRetailerDashboardPresenter(module, retailerDashboardViewProvider.get(), retailerDashboardModelProvider.get());
  }

  public static RetailerDashboardModule_GetRetailerDashboardPresenterFactory create(
      RetailerDashboardModule module, Provider<RetailerDashboardView> retailerDashboardViewProvider,
      Provider<RetailerDashboardModel> retailerDashboardModelProvider) {
    return new RetailerDashboardModule_GetRetailerDashboardPresenterFactory(module, retailerDashboardViewProvider, retailerDashboardModelProvider);
  }

  public static RetailerDashboardPresenter getRetailerDashboardPresenter(
      RetailerDashboardModule instance, RetailerDashboardView retailerDashboardView,
      RetailerDashboardModel retailerDashboardModel) {
    return Preconditions.checkNotNullFromProvides(instance.getRetailerDashboardPresenter(retailerDashboardView, retailerDashboardModel));
  }
}