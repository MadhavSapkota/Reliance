package com.reliance.yeticarpet.activity.retailer.monthly_tracker.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0018H\u0007J\b\u0010\u001a\u001a\u00020\u0016H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/di/MonthlyTrackerModule;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "getCredentialsErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "errorMessage", "", "getErrorMessage", "getMonthlyTrackerModel", "Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/mvp/MonthlyTrackerModel;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "getMonthlyTrackerPresenter", "Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/mvp/MonthlyTrackerPresenter;", "monthlyTrackerModel", "monthlyTrackerView", "Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/mvp/MonthlyTrackerView;", "getMonthlyTrackerView", "loginErrorDialog", "monthlyTrackerAdapter", "Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/adapter/TrackerAdapter;", "percentageAdapter", "Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/adapter/PercentageAdapter;", "getPercentageAdapter", "getRetailerDashboardAdapter", "app_debug"})
@dagger.Module()
public final class MonthlyTrackerModule {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    
    public MonthlyTrackerModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.reliance.yeticarpet.app.AppActivity()
    public final com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerView getMonthlyTrackerView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.TrackerAdapter monthlyTrackerAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.PercentageAdapter percentageAdapter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerModel getMonthlyTrackerModel(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.TrackerAdapter getRetailerDashboardAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.PercentageAdapter getPercentageAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerPresenter getMonthlyTrackerPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerModel monthlyTrackerModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerView monthlyTrackerView) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.CredentialsErrorDialog getCredentialsErrorDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String getErrorMessage() {
        return null;
    }
}