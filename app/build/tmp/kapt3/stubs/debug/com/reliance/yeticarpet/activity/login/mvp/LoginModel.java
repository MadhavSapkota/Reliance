package com.reliance.yeticarpet.activity.login.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0010\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/reliance/yeticarpet/activity/login/mvp/LoginModel;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/app/Webservice;)V", "getCheckDevice", "Lio/reactivex/Observable;", "Lcom/reliance/yeticarpet/activity/login/dto/CheckDeviceResponse;", "getForgetPasswordView", "", "getOtpView", "getRetailerDashboardView", "postLogin", "Lcom/reliance/yeticarpet/activity/login/dto/LoginResponse;", "info", "Lcom/reliance/yeticarpet/app/ApiRequest$LoginRequest;", "postRefresh", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "app_debug"})
public final class LoginModel {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.app.Webservice webservice = null;
    
    public LoginModel(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        super();
    }
    
    public final void getOtpView() {
    }
    
    public final void getForgetPasswordView() {
    }
    
    public final void getRetailerDashboardView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.login.dto.LoginResponse> postLogin(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.ApiRequest.LoginRequest info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.login.dto.CheckDeviceResponse> getCheckDevice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse> postRefresh(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.ApiRequest.RefreshTokenRequest info) {
        return null;
    }
}