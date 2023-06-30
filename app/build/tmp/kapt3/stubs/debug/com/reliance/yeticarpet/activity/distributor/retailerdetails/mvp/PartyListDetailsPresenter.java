package com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u001e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0003J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000fJ\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsPresenter;", "", "partyListDetailsModel", "Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsModel;", "partyListDetailsView", "Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsView;", "(Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsModel;Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "credentialError", "", "e", "", "getPartyListApi", "fiscalId", "", "distributor_id", "retailer_id", "getPartyListRequest", "getPartyListSuccess", "result", "Lcom/reliance/yeticarpet/activity/distributor/retailerlist/dto/PartyListResponse;", "onCreateView", "partyListId", "tokenError", "tokenSuccess", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "userRefreshRequestTokenApi", "app_debug"})
public final class PartyListDetailsPresenter {
    private final com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsModel partyListDetailsModel = null;
    private final com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsView partyListDetailsView = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    public PartyListDetailsPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsModel partyListDetailsModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsView partyListDetailsView) {
        super();
    }
    
    public final void onCreateView(int partyListId) {
    }
    
    public final void getPartyListRequest(int fiscalId, int distributor_id, int retailer_id) {
    }
    
    private final void getPartyListApi(int fiscalId, int distributor_id, int retailer_id) {
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