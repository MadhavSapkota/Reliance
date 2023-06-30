package com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/mvp/MonthlyTrackerPresenter;", "", "monthlyTrackerModel", "Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/mvp/MonthlyTrackerModel;", "monthlyTrackerView", "Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/mvp/MonthlyTrackerView;", "(Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/mvp/MonthlyTrackerModel;Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/mvp/MonthlyTrackerView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "credentialError", "", "e", "", "getMonthlyApi", "fiscalId", "", "getMonthlySuccess", "result", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/RetailerDashboardResponse;", "getMonthlyTrackerRequest", "onCreateView", "tokenError", "tokenSuccess", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "userRefreshRequestTokenApi", "app_debug"})
public final class MonthlyTrackerPresenter {
    private final com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerModel monthlyTrackerModel = null;
    private final com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerView monthlyTrackerView = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    public MonthlyTrackerPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerModel monthlyTrackerModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerView monthlyTrackerView) {
        super();
    }
    
    public final void onCreateView() {
    }
    
    public final void getMonthlyTrackerRequest(int fiscalId) {
    }
    
    private final void getMonthlyApi(int fiscalId) {
    }
    
    private final void getMonthlySuccess(com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse result) {
    }
    
    private final void credentialError(java.lang.Throwable e) {
    }
    
    private final void userRefreshRequestTokenApi() {
    }
    
    private final void tokenSuccess(com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse result) {
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    private final void tokenError(java.lang.Throwable e) {
    }
}