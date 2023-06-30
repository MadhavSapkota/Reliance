package com.reliance.yeticarpet.activity.retailer.dashboard.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/dashboard/di/RetailerDashboardModule;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "getFiscalYearDialog", "Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;", "getRetailerDashboardModel", "Lcom/reliance/yeticarpet/activity/retailer/dashboard/mvp/RetailerDashboardModel;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "getRetailerDashboardPresenter", "Lcom/reliance/yeticarpet/activity/retailer/dashboard/mvp/RetailerDashboardPresenter;", "retailerDashboardView", "Lcom/reliance/yeticarpet/activity/retailer/dashboard/mvp/RetailerDashboardView;", "retailerDashboardModel", "getRetailerDashboardView", "fiscalYearDialog", "app_debug"})
@dagger.Module()
public final class RetailerDashboardModule {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    
    public RetailerDashboardModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.reliance.yeticarpet.app.AppActivity()
    public final com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView getRetailerDashboardView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.FiscalYearDialog fiscalYearDialog) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardModel getRetailerDashboardModel(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.FiscalYearDialog getFiscalYearDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardPresenter getRetailerDashboardPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView retailerDashboardView, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardModel retailerDashboardModel) {
        return null;
    }
}