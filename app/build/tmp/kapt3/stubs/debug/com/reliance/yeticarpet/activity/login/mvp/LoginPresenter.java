package com.reliance.yeticarpet.activity.login.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u0006\u0010\u0019\u001a\u00020\u0011J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0011H\u0002J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/reliance/yeticarpet/activity/login/mvp/LoginPresenter;", "", "loginModel", "Lcom/reliance/yeticarpet/activity/login/mvp/LoginModel;", "loginView", "Lcom/reliance/yeticarpet/activity/login/mvp/LoginView;", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Lcom/reliance/yeticarpet/activity/login/mvp/LoginModel;Lcom/reliance/yeticarpet/activity/login/mvp/LoginView;Landroidx/appcompat/app/AppCompatActivity;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isSavePassword", "", "()Z", "setSavePassword", "(Z)V", "checkUserDeviceError", "", "e", "", "getCheckDeviceApi", "getCheckDevicesApiResult", "result", "Lcom/reliance/yeticarpet/activity/login/dto/CheckDeviceResponse;", "getLoginRequest", "onCreateView", "tokenError", "tokenSuccess", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "userLoginRequestApi", "userLoginSuccessApi", "Lcom/reliance/yeticarpet/activity/login/dto/LoginResponse;", "userRefreshRequestTokenApi", "userloginError", "app_debug"})
public final class LoginPresenter {
    private final com.reliance.yeticarpet.activity.login.mvp.LoginModel loginModel = null;
    private final com.reliance.yeticarpet.activity.login.mvp.LoginView loginView = null;
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private boolean isSavePassword = false;
    
    public LoginPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.login.mvp.LoginModel loginModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.login.mvp.LoginView loginView, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    public final boolean isSavePassword() {
        return false;
    }
    
    public final void setSavePassword(boolean p0) {
    }
    
    public final void onCreateView() {
    }
    
    private final void getLoginRequest() {
    }
    
    private final void userLoginRequestApi() {
    }
    
    private final void getCheckDeviceApi() {
    }
    
    private final void getCheckDevicesApiResult(com.reliance.yeticarpet.activity.login.dto.CheckDeviceResponse result) {
    }
    
    private final void checkUserDeviceError(java.lang.Throwable e) {
    }
    
    private final void userRefreshRequestTokenApi() {
    }
    
    private final void tokenSuccess(com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse result) {
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    private final void tokenError(java.lang.Throwable e) {
    }
    
    private final void userLoginSuccessApi(com.reliance.yeticarpet.activity.login.dto.LoginResponse result) {
    }
    
    private final void userloginError(java.lang.Throwable e) {
    }
}