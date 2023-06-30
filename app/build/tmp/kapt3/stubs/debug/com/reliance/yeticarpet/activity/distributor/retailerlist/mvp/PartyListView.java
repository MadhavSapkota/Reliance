package com.reliance.yeticarpet.activity.distributor.retailerlist.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u001aJ\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u0006\u0010%\u001a\u00020 J\u0012\u0010&\u001a\u00020\u00182\b\u0010\'\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010(\u001a\u00020\u00182\b\u0010)\u001a\u0004\u0018\u00010 H\u0016J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\u001aJ\u0006\u0010-\u001a\u00020\u001aJ\u0006\u0010.\u001a\u00020\u001aJ\u0006\u0010/\u001a\u00020\u001aJ$\u00100\u001a\u00020\u001a2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u000203\u0018\u0001022\u0006\u00104\u001a\u00020\u0018J\u000e\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u00067"}, d2 = {"Lcom/reliance/yeticarpet/activity/distributor/retailerlist/mvp/PartyListView;", "Landroid/widget/SearchView$OnQueryTextListener;", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "loginErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "retailerListAdapter", "Lcom/reliance/yeticarpet/activity/distributor/retailerlist/adapter/PartyListAdapter;", "searchManager", "Landroid/app/SearchManager;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;Lcom/reliance/yeticarpet/activity/distributor/retailerlist/adapter/PartyListAdapter;Landroid/app/SearchManager;)V", "binding", "Lcom/reliance/yeticarpet/databinding/PartyListActivityBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/PartyListActivityBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/PartyListActivityBinding;)V", "progressDialog", "Landroid/app/ProgressDialog;", "getSearchManager", "()Landroid/app/SearchManager;", "setSearchManager", "(Landroid/app/SearchManager;)V", "checkNetwork", "", "dismissDialog", "", "getBackArrow", "Lio/reactivex/Observable;", "", "getCredentialErrorMessage", "message", "", "getDismissDialog", "getErrorMessage", "getOkObserable", "getSearchObservable", "getSessionErrorMessage", "onQueryTextChange", "textChange", "onQueryTextSubmit", "query", "postRefreshRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "searchBoxImplementation", "setDistributorListAdapter", "showDialog", "showPaginationProgressDialog", "showRetailerListData", "termlist", "", "Lcom/reliance/yeticarpet/activity/distributor/retailerlist/dto/RetailerData;", "aboolean", "start", "binding_tracker", "app_debug"})
public final class PartyListView implements android.widget.SearchView.OnQueryTextListener {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog = null;
    private final com.reliance.yeticarpet.activity.distributor.retailerlist.adapter.PartyListAdapter retailerListAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private android.app.SearchManager searchManager;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.PartyListActivityBinding binding;
    private final android.app.ProgressDialog progressDialog = null;
    
    public PartyListView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerlist.adapter.PartyListAdapter retailerListAdapter, @org.jetbrains.annotations.NotNull()
    android.app.SearchManager searchManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.SearchManager getSearchManager() {
        return null;
    }
    
    public final void setSearchManager(@org.jetbrains.annotations.NotNull()
    android.app.SearchManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.PartyListActivityBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.PartyListActivityBinding p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.PartyListActivityBinding binding_tracker) {
    }
    
    public final void searchBoxImplementation() {
    }
    
    public final void showPaginationProgressDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getSearchObservable() {
        return null;
    }
    
    public final void dismissDialog() {
    }
    
    public final void showDialog() {
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
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String textChange) {
        return false;
    }
}