package com.reliance.yeticarpet.fragment.retailer.dashboard.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0007J \u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\rH\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\u0018\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001e0 j\b\u0012\u0004\u0012\u00020\u001e`!H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/reliance/yeticarpet/fragment/retailer/dashboard/di/RetailerDashboardFragmentModule;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "getAnnualSchemeAdapter", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/adapter/AnnualSchemeAdapter;", "getCredentialErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "errorMessage", "", "getErrorMessage", "getFiscalYearDialog", "Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;", "getRetailerDashboardAdapter", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/adapter/RetailerDashboardAdapter;", "getRetailerDashboardModel", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/mvp/RetailerDashboardModel;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "getRetailerDashboardPresenter", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/mvp/RetailerDashboardPresenter;", "retailerDashboardView", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/mvp/RetailerDashboardView;", "retailerDashboardModel", "getRetailerDashboardView", "credentialsErrorDialog", "retailerDashboardAdapter", "fiscalYearDialog", "provideMaxValue", "", "providePointList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
@dagger.Module()
public final class RetailerDashboardFragmentModule {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    
    public RetailerDashboardFragmentModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.reliance.yeticarpet.app.AppActivity()
    public final com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardView getRetailerDashboardView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog credentialsErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.RetailerDashboardAdapter retailerDashboardAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.FiscalYearDialog fiscalYearDialog) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardModel getRetailerDashboardModel(@org.jetbrains.annotations.NotNull()
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
    public final com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.RetailerDashboardAdapter getRetailerDashboardAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.AnnualSchemeAdapter getAnnualSchemeAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardPresenter getRetailerDashboardPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardView retailerDashboardView, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardModel retailerDashboardModel) {
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
    public final java.util.ArrayList<java.lang.Integer> providePointList() {
        return null;
    }
    
    @dagger.Provides()
    public final int provideMaxValue() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String getErrorMessage() {
        return null;
    }
}