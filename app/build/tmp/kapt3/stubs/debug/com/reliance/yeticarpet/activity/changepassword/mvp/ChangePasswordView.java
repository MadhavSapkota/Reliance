package com.reliance.yeticarpet.activity.changepassword.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u001cJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u001eJ\u000e\u0010\u000f\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000eJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u001eJ\u0006\u0010\"\u001a\u00020\u000eJ\b\u0010#\u001a\u00020\u001fH\u0002J\u0006\u0010$\u001a\u00020\u000eJ\b\u0010%\u001a\u00020\u001fH\u0002J\b\u0010&\u001a\u00020\u001fH\u0002J\u0006\u0010\'\u001a\u00020\u000eJ\u0006\u0010(\u001a\u00020\u001fJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020\u001fJ\u000e\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/reliance/yeticarpet/activity/changepassword/mvp/ChangePasswordView;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "loginErrorDialog", "Lcom/reliance/yeticarpet/dialog/LoginErrorDialog;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/dialog/LoginErrorDialog;)V", "binding", "Lcom/reliance/yeticarpet/databinding/ChangePasswordBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/ChangePasswordBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/ChangePasswordBinding;)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "isEmailUsernameValid", "", "()Z", "setEmailUsernameValid", "(Z)V", "isPasswordvalid", "setPasswordvalid", "progressDialog", "Landroid/app/ProgressDialog;", "checkNetwork", "getChangePasswordRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$ChangePasswordRequest;", "getDiscardObservable", "Lio/reactivex/Observable;", "", "message", "getLoginObservable", "getNewPassword", "getNewPasswordListner", "getOldPassword", "getOldPasswordListner", "getPasswordListner", "getReEnterNewPassword", "hidProgressDialog", "postRefreshRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "showProgressDialog", "start", "binding_login", "app_debug"})
public final class ChangePasswordView {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.dialog.LoginErrorDialog loginErrorDialog = null;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.ChangePasswordBinding binding;
    private boolean isEmailUsernameValid = false;
    private boolean isPasswordvalid = false;
    private final android.app.ProgressDialog progressDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String errorMessage = null;
    
    public ChangePasswordView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.LoginErrorDialog loginErrorDialog) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.ChangePasswordBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.ChangePasswordBinding p0) {
    }
    
    public final boolean isEmailUsernameValid() {
        return false;
    }
    
    public final void setEmailUsernameValid(boolean p0) {
    }
    
    public final boolean isPasswordvalid() {
        return false;
    }
    
    public final void setPasswordvalid(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.ChangePasswordBinding binding_login) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getLoginObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getDiscardObservable() {
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
    public final java.lang.String getNewPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReEnterNewPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOldPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.ApiRequest.ChangePasswordRequest getChangePasswordRequest() {
        return null;
    }
    
    private final void getNewPasswordListner() {
    }
    
    private final void getPasswordListner() {
    }
    
    private final void getOldPasswordListner() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.ApiRequest.RefreshTokenRequest postRefreshRequest() {
        return null;
    }
}