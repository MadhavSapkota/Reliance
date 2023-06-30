package com.reliance.yeticarpet.activity.retailer.bill.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/bill/di/RetailerBillModule;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "getRetailerBillModel", "Lcom/reliance/yeticarpet/activity/retailer/bill/mvp/RetailerBillModel;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "getRetailerBillPresenter", "Lcom/reliance/yeticarpet/activity/retailer/bill/mvp/RetailerBillPresenter;", "retailerBillView", "Lcom/reliance/yeticarpet/activity/retailer/bill/mvp/RetailerBillView;", "retailerBillModel", "getRetailerBillView", "app_debug"})
@dagger.Module()
public final class RetailerBillModule {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    
    public RetailerBillModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.reliance.yeticarpet.app.AppActivity()
    public final com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillView getRetailerBillView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillModel getRetailerBillModel(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillPresenter getRetailerBillPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillView retailerBillView, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillModel retailerBillModel) {
        return null;
    }
}