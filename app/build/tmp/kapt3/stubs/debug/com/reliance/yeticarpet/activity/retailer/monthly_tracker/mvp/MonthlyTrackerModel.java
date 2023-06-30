package com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/mvp/MonthlyTrackerModel;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/app/Webservice;)V", "getBackActivity", "", "getLoginActivityResponse", "getRetailerDashboard", "Lio/reactivex/Observable;", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/RetailerDashboardResponse;", "id", "", "postRefresh", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "info", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "app_debug"})
public final class MonthlyTrackerModel {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.app.Webservice webservice = null;
    
    public MonthlyTrackerModel(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse> getRetailerDashboard(int id) {
        return null;
    }
    
    public final void getLoginActivityResponse() {
    }
    
    public final void getBackActivity() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse> postRefresh(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.ApiRequest.RefreshTokenRequest info) {
        return null;
    }
}