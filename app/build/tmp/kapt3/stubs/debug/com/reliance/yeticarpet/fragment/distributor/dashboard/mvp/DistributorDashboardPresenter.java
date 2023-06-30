package com.reliance.yeticarpet.fragment.distributor.dashboard.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0002J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010#\u001a\u00020\u0011J\b\u0010\u000e\u001a\u00020\u0011H\u0002J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006("}, d2 = {"Lcom/reliance/yeticarpet/fragment/distributor/dashboard/mvp/DistributorDashboardPresenter;", "", "distributorDashboardView", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/mvp/DistributorDashboardView;", "distributorDashboardModel", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/mvp/DistributorDashboardModel;", "(Lcom/reliance/yeticarpet/fragment/distributor/dashboard/mvp/DistributorDashboardView;Lcom/reliance/yeticarpet/fragment/distributor/dashboard/mvp/DistributorDashboardModel;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "monthList", "Ljava/util/ArrayList;", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/MonthData;", "getMonthList", "()Ljava/util/ArrayList;", "setMonthList", "(Ljava/util/ArrayList;)V", "apiSuccess", "", "result", "Lcom/reliance/yeticarpet/activity/login/dto/FiscalYearResponse;", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/DistributorDashboardResponse;", "credentialError", "e", "", "distributorListRequest", "fiscalYear", "", "fiscalYearApiRequest", "status", "", "fiscalYearDialogApiRequest", "fiscalYearDialogapiSuccess", "fiscalYearError", "graphApiSuccess", "graphUpdateRequest", "onCreate", "tokenError", "tokenSuccess", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "userRefreshRequestTokenApi", "app_debug"})
public final class DistributorDashboardPresenter {
    private final com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardView distributorDashboardView = null;
    private final com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardModel distributorDashboardModel = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthData> monthList;
    
    public DistributorDashboardPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardView distributorDashboardView, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardModel distributorDashboardModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthData> getMonthList() {
        return null;
    }
    
    public final void setMonthList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthData> p0) {
    }
    
    public final void onCreate() {
    }
    
    private final void fiscalYearDialogApiRequest() {
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    private final void fiscalYearDialogapiSuccess(com.reliance.yeticarpet.activity.login.dto.FiscalYearResponse result) {
    }
    
    private final void fiscalYearError(java.lang.Throwable e) {
    }
    
    private final void fiscalYearApiRequest(boolean status) {
    }
    
    private final void apiSuccess(com.reliance.yeticarpet.activity.login.dto.FiscalYearResponse result) {
    }
    
    private final void distributorListRequest(int fiscalYear) {
    }
    
    private final void apiSuccess(com.reliance.yeticarpet.fragment.distributor.dashboard.dto.DistributorDashboardResponse result) {
    }
    
    private final void graphUpdateRequest(int fiscalYear) {
    }
    
    private final void graphApiSuccess(com.reliance.yeticarpet.fragment.distributor.dashboard.dto.DistributorDashboardResponse result) {
    }
    
    private final void setMonthList() {
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