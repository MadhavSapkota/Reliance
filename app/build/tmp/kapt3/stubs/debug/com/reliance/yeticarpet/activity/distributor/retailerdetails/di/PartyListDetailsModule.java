package com.reliance.yeticarpet.activity.distributor.retailerdetails.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/di/PartyListDetailsModule;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "getCredentialsErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "errorMessage", "", "getErrorMessage", "getPartyListDetailsAdapter", "Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/adapter/PartyListDetailsAdapter;", "getPartyListDetailsModel", "Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsModel;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "getPartyListDetailsPresenter", "Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsPresenter;", "partyListDetailsModel", "partyListDetailsView", "Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsView;", "getPartyListDetailsTrackerView", "loginErrorDialog", "partyListDetailsAdapter", "app_debug"})
@dagger.Module()
public final class PartyListDetailsModule {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    
    public PartyListDetailsModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.reliance.yeticarpet.app.AppActivity()
    public final com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsView getPartyListDetailsTrackerView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerdetails.adapter.PartyListDetailsAdapter partyListDetailsAdapter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsModel getPartyListDetailsModel(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.distributor.retailerdetails.adapter.PartyListDetailsAdapter getPartyListDetailsAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsPresenter getPartyListDetailsPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsModel partyListDetailsModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsView partyListDetailsView) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.CredentialsErrorDialog getCredentialsErrorDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String getErrorMessage() {
        return null;
    }
}