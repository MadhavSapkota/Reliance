package com.reliance.yeticarpet.activity.forgotpassword.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u000eJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001aJ\b\u0010\u001e\u001a\u00020\u0018H\u0002J\u0006\u0010\u001f\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010!\u001a\u00020\u0018J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\bJ\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/reliance/yeticarpet/activity/forgotpassword/mvp/ForgotPasswordView;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "loginErrorDialog", "Lcom/reliance/yeticarpet/dialog/LoginErrorDialog;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/dialog/LoginErrorDialog;)V", "binding", "Lcom/reliance/yeticarpet/databinding/ActivityForgetPasswordBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/ActivityForgetPasswordBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/ActivityForgetPasswordBinding;)V", "isEmailUsernameValid", "", "()Z", "setEmailUsernameValid", "(Z)V", "progressDialog", "Landroid/app/ProgressDialog;", "checkNetwork", "getDirectToLoginObservable", "Lio/reactivex/Observable;", "getErrorMessage", "", "message", "", "getForgotRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$ForgotPasswordRequest;", "getUserName", "getUserNameListener", "hidProgressDialog", "loadDialog", "showProgressDialog", "start", "binding_login", "submitButton", "app_debug"})
public final class ForgotPasswordView {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.dialog.LoginErrorDialog loginErrorDialog = null;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.ActivityForgetPasswordBinding binding;
    private final android.app.ProgressDialog progressDialog = null;
    private boolean isEmailUsernameValid = false;
    
    public ForgotPasswordView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.LoginErrorDialog loginErrorDialog) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.ActivityForgetPasswordBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.ActivityForgetPasswordBinding p0) {
    }
    
    public final boolean isEmailUsernameValid() {
        return false;
    }
    
    public final void setEmailUsernameValid(boolean p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.ActivityForgetPasswordBinding binding_login) {
    }
    
    public final void showProgressDialog() {
    }
    
    public final void hidProgressDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getDirectToLoginObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> submitButton() {
        return null;
    }
    
    private final void getUserNameListener() {
    }
    
    public final boolean checkNetwork() {
        return false;
    }
    
    public final void getErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.ApiRequest.ForgotPasswordRequest getForgotRequest() {
        return null;
    }
    
    public final void loadDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
}