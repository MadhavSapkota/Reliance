package com.reliance.yeticarpet.fragment.distributor.dashboard.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0007J0\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\b\u0010\u001d\u001a\u00020\bH\u0007J\b\u0010\u001e\u001a\u00020\u001cH\u0007J\b\u0010\u001f\u001a\u00020\u001aH\u0007J\b\u0010 \u001a\u00020\u0018H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/reliance/yeticarpet/fragment/distributor/dashboard/di/DistributorDashboardFragmentModule;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "getCredentialErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "errorMessage", "", "getDistributorDashboardAdapter", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/RetailerListAdapter;", "getDistributorDashboardModel", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/mvp/DistributorDashboardModel;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "getDistributorDashboardPresenter", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/mvp/DistributorDashboardPresenter;", "distributorDashboardView", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/mvp/DistributorDashboardView;", "distributorDashboardModel", "getDistributorDashboardView", "credentialsErrorDialog", "retailerListAdapter", "monthlySalesItemsAdapter", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthlySalesItemsAdapter;", "monthListAdapter", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthListAdapter;", "fiscalYearDialog", "Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;", "getErrorMessage", "getFiscalYearDialog", "getMonthListAdapter", "getMonthlySalesItemAdapter", "app_debug"})
@dagger.Module()
public final class DistributorDashboardFragmentModule {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    
    public DistributorDashboardFragmentModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.reliance.yeticarpet.app.AppActivity()
    public final com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardView getDistributorDashboardView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog credentialsErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.RetailerListAdapter retailerListAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsAdapter monthlySalesItemsAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListAdapter monthListAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.FiscalYearDialog fiscalYearDialog) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.FiscalYearDialog getFiscalYearDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardModel getDistributorDashboardModel(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.RetailerListAdapter getDistributorDashboardAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsAdapter getMonthlySalesItemAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListAdapter getMonthListAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardPresenter getDistributorDashboardPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardView distributorDashboardView, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardModel distributorDashboardModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.CredentialsErrorDialog getCredentialErrorDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String getErrorMessage() {
        return null;
    }
}