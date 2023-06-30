package com.reliance.yeticarpet.activity.login.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eJ\u0006\u0010#\u001a\u00020\u0012J\b\u0010$\u001a\u00020!H\u0002J\u000e\u0010\u000f\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eJ\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010&J\u000e\u0010\'\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eJ\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010&J\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020!H\u0002J\u0006\u0010,\u001a\u00020\u000eJ\u0006\u0010-\u001a\u00020\u000eJ\b\u0010.\u001a\u00020!H\u0002J\u0006\u0010/\u001a\u00020!J\b\u00100\u001a\u00020\u0012H\u0002J\u000e\u00101\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eJ\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020!H\u0002J\u0006\u00105\u001a\u00020!J\u000e\u00106\u001a\u00020!2\u0006\u00107\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/reliance/yeticarpet/activity/login/mvp/LoginView;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "loginErrorDialog", "Lcom/reliance/yeticarpet/dialog/LoginErrorDialog;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/dialog/LoginErrorDialog;)V", "binding", "Lcom/reliance/yeticarpet/databinding/ActivityLoginBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/ActivityLoginBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/ActivityLoginBinding;)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "isEmailUsernameValid", "", "()Z", "setEmailUsernameValid", "(Z)V", "isPasswordvalid", "setPasswordvalid", "isSavePassword", "setSavePassword", "isUserInputEmpty", "setUserInputEmpty", "progressBar", "Lcom/reliance/yeticarpet/apputlis/CustomProgressBar;", "progressDialog", "Landroid/app/ProgressDialog;", "checkEmptyOrNotEmpty", "", "message", "checkNetwork", "checkTokenStatus", "getForgotPasswordObservable", "Lio/reactivex/Observable;", "getLoginErrorMessage", "getLoginObservable", "getLoginRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$LoginRequest;", "getPasswordListner", "getUserName", "getUserPassowrd", "getUsernameListner", "hidProgressDialog", "isValid", "loadDialog", "postRefreshRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "savePassword", "showProgressDialog", "start", "binding_login", "app_debug"})
public final class LoginView {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.dialog.LoginErrorDialog loginErrorDialog = null;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.ActivityLoginBinding binding;
    private boolean isEmailUsernameValid = false;
    private boolean isPasswordvalid = false;
    private final android.app.ProgressDialog progressDialog = null;
    private com.reliance.yeticarpet.apputlis.CustomProgressBar progressBar;
    private boolean isSavePassword = false;
    private boolean isUserInputEmpty = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String errorMessage = null;
    
    public LoginView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.LoginErrorDialog loginErrorDialog) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.ActivityLoginBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.ActivityLoginBinding p0) {
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
    
    public final boolean isSavePassword() {
        return false;
    }
    
    public final void setSavePassword(boolean p0) {
    }
    
    public final boolean isUserInputEmpty() {
        return false;
    }
    
    public final void setUserInputEmpty(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.ActivityLoginBinding binding_login) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getLoginObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getForgotPasswordObservable() {
        return null;
    }
    
    public final void showProgressDialog() {
    }
    
    public final void hidProgressDialog() {
    }
    
    public final boolean checkNetwork() {
        return false;
    }
    
    public final void getLoginErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void getErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserPassowrd() {
        return null;
    }
    
    private final void getUsernameListner() {
    }
    
    private final void getPasswordListner() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.ApiRequest.LoginRequest getLoginRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.ApiRequest.RefreshTokenRequest postRefreshRequest() {
        return null;
    }
    
    private final boolean isValid() {
        return false;
    }
    
    public final void checkEmptyOrNotEmpty(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void savePassword() {
    }
    
    public final void loadDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void checkTokenStatus() {
    }
}