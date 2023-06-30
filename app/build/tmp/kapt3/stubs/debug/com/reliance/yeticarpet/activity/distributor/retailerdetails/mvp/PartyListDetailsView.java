package com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0012J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014J\u0006\u0010\u001b\u001a\u00020\u0017J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0012J$\u0010#\u001a\u00020\u00122\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020!\u0018\u00010%2\u0006\u0010&\u001a\u00020\u0010J\u000e\u0010\'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsView;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "loginErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "retailerListAdapter", "Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/adapter/PartyListDetailsAdapter;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/adapter/PartyListDetailsAdapter;)V", "binding", "Lcom/reliance/yeticarpet/databinding/PartyListDetailsLayoutBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/PartyListDetailsLayoutBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/PartyListDetailsLayoutBinding;)V", "checkNetwork", "", "dismissDialog", "", "getBackArrow", "Lio/reactivex/Observable;", "getCredentialErrorMessage", "message", "", "getDismissDialog", "getErrorMessage", "getOkObserable", "getSessionErrorMessage", "postRefreshRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "setDistributorListAdapter", "setPartyDetails", "result", "Lcom/reliance/yeticarpet/activity/distributor/retailerlist/dto/RetailerData;", "showDialog", "showRetailerListData", "termlist", "", "aboolean", "start", "binding_tracker", "app_debug"})
public final class PartyListDetailsView {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog = null;
    private final com.reliance.yeticarpet.activity.distributor.retailerdetails.adapter.PartyListDetailsAdapter retailerListAdapter = null;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.PartyListDetailsLayoutBinding binding;
    
    public PartyListDetailsView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerdetails.adapter.PartyListDetailsAdapter retailerListAdapter) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.PartyListDetailsLayoutBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.PartyListDetailsLayoutBinding p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.PartyListDetailsLayoutBinding binding_tracker) {
    }
    
    public final void dismissDialog() {
    }
    
    public final void showDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionErrorMessage() {
        return null;
    }
    
    public final boolean checkNetwork() {
        return false;
    }
    
    public final void getErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void getCredentialErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showRetailerListData(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData> termlist, boolean aboolean) {
    }
    
    public final void setDistributorListAdapter() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getOkObserable() {
        return null;
    }
    
    public final void getDismissDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.ApiRequest.RefreshTokenRequest postRefreshRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getBackArrow() {
        return null;
    }
    
    public final void setPartyDetails(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData result) {
    }
}