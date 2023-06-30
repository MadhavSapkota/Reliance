package com.reliance.yeticarpet.activity.retailer.distributordetails.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018J\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/distributordetails/mvp/DistributorDetailsView;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "loginErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;)V", "binding", "Lcom/reliance/yeticarpet/databinding/DistributorDetailsActivityBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/DistributorDetailsActivityBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/DistributorDetailsActivityBinding;)V", "progressDialog", "Landroid/app/ProgressDialog;", "checkNetwork", "", "getCredentialErrorMessage", "", "message", "", "getDismissDialog", "getErrorMessage", "getOkObserable", "Lio/reactivex/Observable;", "hidProgressDialog", "showProgressDialog", "start", "binding_tracker", "app_debug"})
public final class DistributorDetailsView {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog = null;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.DistributorDetailsActivityBinding binding;
    private final android.app.ProgressDialog progressDialog = null;
    
    public DistributorDetailsView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.DistributorDetailsActivityBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.DistributorDetailsActivityBinding p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.DistributorDetailsActivityBinding binding_tracker) {
    }
    
    public final void showProgressDialog() {
    }
    
    public final void hidProgressDialog() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getOkObserable() {
        return null;
    }
    
    public final void getDismissDialog() {
    }
}