package com.reliance.yeticarpet.activity.retailer.distributordetails.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\bH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/distributordetails/di/DistributorDetailsModule;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "getCredentialsErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "errorMessage", "", "getDistributorListPresenter", "Lcom/reliance/yeticarpet/activity/retailer/distributordetails/mvp/DistributorDetailsPresenter;", "distributorDetailsModel", "Lcom/reliance/yeticarpet/activity/retailer/distributordetails/mvp/DistributorDetailsModel;", "distributorDetailsView", "Lcom/reliance/yeticarpet/activity/retailer/distributordetails/mvp/DistributorDetailsView;", "getErrorMessage", "getMonthlyTrackerModel", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "getMonthlyTrackerView", "loginErrorDialog", "app_debug"})
@dagger.Module()
public final class DistributorDetailsModule {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    
    public DistributorDetailsModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.reliance.yeticarpet.app.AppActivity()
    public final com.reliance.yeticarpet.activity.retailer.distributordetails.mvp.DistributorDetailsView getMonthlyTrackerView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.distributordetails.mvp.DistributorDetailsModel getMonthlyTrackerModel(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.distributordetails.mvp.DistributorDetailsPresenter getDistributorListPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.distributordetails.mvp.DistributorDetailsModel distributorDetailsModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.distributordetails.mvp.DistributorDetailsView distributorDetailsView) {
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