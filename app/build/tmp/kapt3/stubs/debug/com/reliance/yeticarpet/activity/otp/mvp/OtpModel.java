package com.reliance.yeticarpet.activity.otp.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/reliance/yeticarpet/activity/otp/mvp/OtpModel;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/app/Webservice;)V", "checkDeviceVerifyOtp", "Lio/reactivex/Observable;", "Lcom/reliance/yeticarpet/activity/login/dto/CheckDeviceResponse;", "token", "", "getDashboardRetailerView", "", "getLoginView", "getOtpView", "postOtpRequest", "Lcom/reliance/yeticarpet/activity/otp/dto/OtpResponse;", "info", "Lcom/reliance/yeticarpet/app/ApiRequest$OtpRequest;", "app_debug"})
public final class OtpModel {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.app.Webservice webservice = null;
    
    public OtpModel(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        super();
    }
    
    public final void getDashboardRetailerView() {
    }
    
    public final void getLoginView() {
    }
    
    public final void getOtpView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.otp.dto.OtpResponse> postOtpRequest(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.ApiRequest.OtpRequest info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.login.dto.CheckDeviceResponse> checkDeviceVerifyOtp(int token) {
        return null;
    }
}