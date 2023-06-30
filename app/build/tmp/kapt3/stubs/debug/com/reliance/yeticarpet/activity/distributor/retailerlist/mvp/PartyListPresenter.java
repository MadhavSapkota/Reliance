package com.reliance.yeticarpet.activity.distributor.retailerlist.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\nJ\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003J\u0006\u0010\u0017\u001a\u00020\rJ\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\rH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/reliance/yeticarpet/activity/distributor/retailerlist/mvp/PartyListPresenter;", "", "partyListModel", "Lcom/reliance/yeticarpet/activity/distributor/retailerlist/mvp/PartyListModel;", "partyListView", "Lcom/reliance/yeticarpet/activity/distributor/retailerlist/mvp/PartyListView;", "(Lcom/reliance/yeticarpet/activity/distributor/retailerlist/mvp/PartyListModel;Lcom/reliance/yeticarpet/activity/distributor/retailerlist/mvp/PartyListView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "endPageNumber", "", "startPageNumber", "credentialError", "", "e", "", "getNestedScrollActionListner", "fiscalId", "getPartyListApi", "getPartyListRequest", "getPartyListSuccess", "result", "Lcom/reliance/yeticarpet/activity/distributor/retailerlist/dto/PartyListResponse;", "onCreateView", "tokenError", "tokenSuccess", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "userRefreshRequestTokenApi", "app_debug"})
public final class PartyListPresenter {
    private final com.reliance.yeticarpet.activity.distributor.retailerlist.mvp.PartyListModel partyListModel = null;
    private final com.reliance.yeticarpet.activity.distributor.retailerlist.mvp.PartyListView partyListView = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private int startPageNumber = 0;
    private int endPageNumber = 20;
    
    public PartyListPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerlist.mvp.PartyListModel partyListModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerlist.mvp.PartyListView partyListView) {
        super();
    }
    
    public final void onCreateView() {
    }
    
    public final void getPartyListRequest(int fiscalId) {
    }
    
    private final void getNestedScrollActionListner(int fiscalId) {
    }
    
    private final void getPartyListApi(int fiscalId) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void getPartyListSuccess(com.reliance.yeticarpet.activity.distributor.retailerlist.dto.PartyListResponse result) {
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