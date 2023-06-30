package com.reliance.yeticarpet.activity.retailer.distributorlist.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\nJ\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/distributorlist/mvp/DistributorListPresenter;", "", "distributorListModel", "Lcom/reliance/yeticarpet/activity/retailer/distributorlist/mvp/DistributorListModel;", "distributorListView", "Lcom/reliance/yeticarpet/activity/retailer/distributorlist/mvp/DistributorListView;", "(Lcom/reliance/yeticarpet/activity/retailer/distributorlist/mvp/DistributorListModel;Lcom/reliance/yeticarpet/activity/retailer/distributorlist/mvp/DistributorListView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "credentialError", "", "e", "", "getDistributorListApi", "fiscalId", "", "retailerId", "getDistributorListRequest", "getDistributorListSuccess", "result", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/DistributorListResponse;", "onCreateView", "tokenError", "tokenSuccess", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "userRefreshRequestTokenApi", "app_debug"})
public final class DistributorListPresenter {
    private final com.reliance.yeticarpet.activity.retailer.distributorlist.mvp.DistributorListModel distributorListModel = null;
    private final com.reliance.yeticarpet.activity.retailer.distributorlist.mvp.DistributorListView distributorListView = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    public DistributorListPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.distributorlist.mvp.DistributorListModel distributorListModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.distributorlist.mvp.DistributorListView distributorListView) {
        super();
    }
    
    public final void onCreateView() {
    }
    
    public final void getDistributorListRequest(int fiscalId) {
    }
    
    private final void getDistributorListApi(int fiscalId, int retailerId) {
    }
    
    private final void getDistributorListSuccess(com.reliance.yeticarpet.activity.retailer.bill.dto.DistributorListResponse result) {
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