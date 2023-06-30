package com.reliance.yeticarpet.activity.forgotpassword.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/reliance/yeticarpet/activity/forgotpassword/di/ForgotPasswordModule;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "getErrorMessage", "", "getForgotPasswordModel", "Lcom/reliance/yeticarpet/activity/forgotpassword/mvp/ForgotPasswordModel;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "getForgotPasswordPresenter", "Lcom/reliance/yeticarpet/activity/forgotpassword/mvp/ForgotPasswordPresenter;", "forgotPasswordModel", "forgotPasswordView", "Lcom/reliance/yeticarpet/activity/forgotpassword/mvp/ForgotPasswordView;", "getForgotPasswordView", "loginErrorDialog", "Lcom/reliance/yeticarpet/dialog/LoginErrorDialog;", "getLoginErrorDialog", "errorMessage", "app_debug"})
@dagger.Module()
public final class ForgotPasswordModule {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    
    public ForgotPasswordModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.reliance.yeticarpet.app.AppActivity()
    public final com.reliance.yeticarpet.activity.forgotpassword.mvp.ForgotPasswordView getForgotPasswordView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.LoginErrorDialog loginErrorDialog) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.forgotpassword.mvp.ForgotPasswordModel getForgotPasswordModel(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.activity.forgotpassword.mvp.ForgotPasswordPresenter getForgotPasswordPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.forgotpassword.mvp.ForgotPasswordModel forgotPasswordModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.forgotpassword.mvp.ForgotPasswordView forgotPasswordView) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.LoginErrorDialog getLoginErrorDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String getErrorMessage() {
        return null;
    }
}