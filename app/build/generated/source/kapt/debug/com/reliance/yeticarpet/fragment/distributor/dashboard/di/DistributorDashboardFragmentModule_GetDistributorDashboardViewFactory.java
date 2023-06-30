// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.fragment.distributor.dashboard.di;

import com.reliance.yeticarpet.dialog.CredentialsErrorDialog;
import com.reliance.yeticarpet.dialog.FiscalYearDialog;
import com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListAdapter;
import com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsAdapter;
import com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.RetailerListAdapter;
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
public final class DistributorDashboardFragmentModule_GetDistributorDashboardViewFactory implements Factory<DistributorDashboardView> {
  private final DistributorDashboardFragmentModule module;

  private final Provider<CredentialsErrorDialog> credentialsErrorDialogProvider;

  private final Provider<RetailerListAdapter> retailerListAdapterProvider;

  private final Provider<MonthlySalesItemsAdapter> monthlySalesItemsAdapterProvider;

  private final Provider<MonthListAdapter> monthListAdapterProvider;

  private final Provider<FiscalYearDialog> fiscalYearDialogProvider;

  public DistributorDashboardFragmentModule_GetDistributorDashboardViewFactory(
      DistributorDashboardFragmentModule module,
      Provider<CredentialsErrorDialog> credentialsErrorDialogProvider,
      Provider<RetailerListAdapter> retailerListAdapterProvider,
      Provider<MonthlySalesItemsAdapter> monthlySalesItemsAdapterProvider,
      Provider<MonthListAdapter> monthListAdapterProvider,
      Provider<FiscalYearDialog> fiscalYearDialogProvider) {
    this.module = module;
    this.credentialsErrorDialogProvider = credentialsErrorDialogProvider;
    this.retailerListAdapterProvider = retailerListAdapterProvider;
    this.monthlySalesItemsAdapterProvider = monthlySalesItemsAdapterProvider;
    this.monthListAdapterProvider = monthListAdapterProvider;
    this.fiscalYearDialogProvider = fiscalYearDialogProvider;
  }

  @Override
  public DistributorDashboardView get() {
    return getDistributorDashboardView(module, credentialsErrorDialogProvider.get(), retailerListAdapterProvider.get(), monthlySalesItemsAdapterProvider.get(), monthListAdapterProvider.get(), fiscalYearDialogProvider.get());
  }

  public static DistributorDashboardFragmentModule_GetDistributorDashboardViewFactory create(
      DistributorDashboardFragmentModule module,
      Provider<CredentialsErrorDialog> credentialsErrorDialogProvider,
      Provider<RetailerListAdapter> retailerListAdapterProvider,
      Provider<MonthlySalesItemsAdapter> monthlySalesItemsAdapterProvider,
      Provider<MonthListAdapter> monthListAdapterProvider,
      Provider<FiscalYearDialog> fiscalYearDialogProvider) {
    return new DistributorDashboardFragmentModule_GetDistributorDashboardViewFactory(module, credentialsErrorDialogProvider, retailerListAdapterProvider, monthlySalesItemsAdapterProvider, monthListAdapterProvider, fiscalYearDialogProvider);
  }

  public static DistributorDashboardView getDistributorDashboardView(
      DistributorDashboardFragmentModule instance, CredentialsErrorDialog credentialsErrorDialog,
      RetailerListAdapter retailerListAdapter, MonthlySalesItemsAdapter monthlySalesItemsAdapter,
      MonthListAdapter monthListAdapter, FiscalYearDialog fiscalYearDialog) {
    return Preconditions.checkNotNullFromProvides(instance.getDistributorDashboardView(credentialsErrorDialog, retailerListAdapter, monthlySalesItemsAdapter, monthListAdapter, fiscalYearDialog));
  }
}