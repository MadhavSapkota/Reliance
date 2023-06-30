package com.reliance.yeticarpet.fragment.retailer.dashboard.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u001e\u001a\u00020\nJ\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020 H\u0003J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/reliance/yeticarpet/fragment/retailer/dashboard/mvp/RetailerDashboardPresenter;", "", "retailerDashboardView", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/mvp/RetailerDashboardView;", "retailerDashboardModel", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/mvp/RetailerDashboardModel;", "(Lcom/reliance/yeticarpet/fragment/retailer/dashboard/mvp/RetailerDashboardView;Lcom/reliance/yeticarpet/fragment/retailer/dashboard/mvp/RetailerDashboardModel;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "apiSuccess", "", "result", "Lcom/reliance/yeticarpet/activity/login/dto/FiscalYearResponse;", "credentialError", "e", "", "fiscalYearApiRequest", "status", "", "fiscalYearDialogApiRequest", "fiscalYearDialogapiSuccess", "fiscalYearError", "getBillsItemsClickObserver", "Lio/reactivex/observers/DisposableObserver;", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/SchemeDetail;", "getDropButtonItemClick", "getRetailerDashboardApiRequest", "id", "", "loginError", "onCreate", "retailerDashboardSuccess", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/RetailerDashboardResponse;", "tokenError", "tokenSuccess", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "userRefreshRequestTokenApi", "app_debug"})
public final class RetailerDashboardPresenter {
    private final com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardView retailerDashboardView = null;
    private final com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardModel retailerDashboardModel = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    public RetailerDashboardPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardView retailerDashboardView, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardModel retailerDashboardModel) {
        super();
    }
    
    public final void onCreate() {
    }
    
    private final void fiscalYearDialogApiRequest() {
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    private final void fiscalYearDialogapiSuccess(com.reliance.yeticarpet.activity.login.dto.FiscalYearResponse result) {
    }
    
    private final void fiscalYearApiRequest(boolean status) {
    }
    
    private final void apiSuccess(com.reliance.yeticarpet.activity.login.dto.FiscalYearResponse result) {
    }
    
    private final void getRetailerDashboardApiRequest(int id) {
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    private final void retailerDashboardSuccess(com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse result) {
    }
    
    private final void fiscalYearError(java.lang.Throwable e) {
    }
    
    private final void loginError(java.lang.Throwable e) {
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
    
    private final void getDropButtonItemClick() {
    }
    
    private final io.reactivex.observers.DisposableObserver<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail> getBillsItemsClickObserver() {
        return null;
    }
}