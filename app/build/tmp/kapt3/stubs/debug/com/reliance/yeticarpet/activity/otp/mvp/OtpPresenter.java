package com.reliance.yeticarpet.activity.otp.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0017H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/reliance/yeticarpet/activity/otp/mvp/OtpPresenter;", "", "otpModel", "Lcom/reliance/yeticarpet/activity/otp/mvp/OtpModel;", "otpView", "Lcom/reliance/yeticarpet/activity/otp/mvp/OtpView;", "(Lcom/reliance/yeticarpet/activity/otp/mvp/OtpModel;Lcom/reliance/yeticarpet/activity/otp/mvp/OtpView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getOtpApi", "", "getOtpRequest", "getVerifyOtpApi", "token", "", "onCreateView", "otpError", "e", "", "otpSuccess", "result", "Lcom/reliance/yeticarpet/activity/otp/dto/OtpResponse;", "verifyOtpSuccess", "Lcom/reliance/yeticarpet/activity/login/dto/CheckDeviceResponse;", "app_debug"})
public final class OtpPresenter {
    private final com.reliance.yeticarpet.activity.otp.mvp.OtpModel otpModel = null;
    private final com.reliance.yeticarpet.activity.otp.mvp.OtpView otpView = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    public OtpPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.otp.mvp.OtpModel otpModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.otp.mvp.OtpView otpView) {
        super();
    }
    
    public final void onCreateView() {
    }
    
    public final void getOtpRequest() {
    }
    
    private final void getOtpApi() {
    }
    
    private final void getVerifyOtpApi(int token) {
    }
    
    private final void verifyOtpSuccess(com.reliance.yeticarpet.activity.login.dto.CheckDeviceResponse result) {
    }
    
    private final void otpSuccess(com.reliance.yeticarpet.activity.otp.dto.OtpResponse result) {
    }
    
    private final void otpError(java.lang.Throwable e) {
    }
}