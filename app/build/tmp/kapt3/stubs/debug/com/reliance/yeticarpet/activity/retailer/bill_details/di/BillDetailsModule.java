package com.reliance.yeticarpet.activity.retailer.bill_details.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\nH\u0007J\b\u0010\u0017\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/bill_details/di/BillDetailsModule;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "getBillDetailsDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "errorMessage", "", "getBillsAdapter", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/adapter/BillsDetailsAdapter;", "getBillsDetailsModel", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/mvp/BillDetailsModel;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "getBillsDetailsPresenter", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/mvp/BillDetailsPresenter;", "billDetailsModel", "billDetailsView", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/mvp/BillDetailsView;", "getBillsDetailsView", "loginErrorDialog", "billsDetailsAdapter", "getErrorMessage", "app_debug"})
@dagger.Module()
public final class BillDetailsModule {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    
    public BillDetailsModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.reliance.yeticarpet.app.AppActivity()
    public final com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsView getBillsDetailsView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.bill_details.adapter.BillsDetailsAdapter billsDetailsAdapter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsModel getBillsDetailsModel(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.bill_details.adapter.BillsDetailsAdapter getBillsAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsPresenter getBillsDetailsPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsModel billDetailsModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsView billDetailsView) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.CredentialsErrorDialog getBillDetailsDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String getErrorMessage() {
        return null;
    }
}