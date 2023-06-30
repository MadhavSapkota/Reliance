package com.reliance.yeticarpet.activity.retailer.bill_details.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/bill_details/di/BillDetailsComponent;", "", "inject", "", "billDetailsActivity", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/BillDetailsActivity;", "app_debug"})
@dagger.Component(modules = {com.reliance.yeticarpet.activity.retailer.bill_details.di.BillDetailsModule.class}, dependencies = {com.reliance.yeticarpet.app.AppComponent.class})
@com.reliance.yeticarpet.app.AppActivity()
public abstract interface BillDetailsComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.bill_details.BillDetailsActivity billDetailsActivity);
}