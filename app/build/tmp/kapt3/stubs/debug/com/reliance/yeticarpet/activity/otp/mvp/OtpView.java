package com.reliance.yeticarpet.activity.otp.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u001aJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u001f\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/reliance/yeticarpet/activity/otp/mvp/OtpView;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "loginErrorDialog", "Lcom/reliance/yeticarpet/dialog/LoginErrorDialog;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/dialog/LoginErrorDialog;)V", "binding", "Lcom/reliance/yeticarpet/databinding/ActivityOtpBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/ActivityOtpBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/ActivityOtpBinding;)V", "isOtpValid", "", "progressDialog", "Landroid/app/ProgressDialog;", "checkNetwork", "getDirectToLoginObservable", "Lio/reactivex/Observable;", "getErrorMessage", "", "message", "", "getOtpCode", "getOtpRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$OtpRequest;", "getSubmitOtpObservable", "getUserOtpListener", "hidProgressDialog", "loadDialog", "showProgressDialog", "start", "binding_otp", "app_debug"})
public final class OtpView {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.dialog.LoginErrorDialog loginErrorDialog = null;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.ActivityOtpBinding binding;
    private boolean isOtpValid = false;
    private final android.app.ProgressDialog progressDialog = null;
    
    public OtpView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.LoginErrorDialog loginErrorDialog) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.ActivityOtpBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.ActivityOtpBinding p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.ActivityOtpBinding binding_otp) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getDirectToLoginObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getSubmitOtpObservable() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtpCode() {
        return null;
    }
    
    private final void getUserOtpListener() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.ApiRequest.OtpRequest getOtpRequest() {
        return null;
    }
    
    public final void loadDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
}