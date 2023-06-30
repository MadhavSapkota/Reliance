package com.reliance.yeticarpet.fragment.setting.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/reliance/yeticarpet/fragment/setting/di/SettingModule;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "getCredentialErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "errorMessage", "", "getErrorMessage", "getSettingModel", "Lcom/reliance/yeticarpet/fragment/setting/mvp/SettingModel;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "getSettingPresenter", "Lcom/reliance/yeticarpet/fragment/setting/mvp/SettingPresenter;", "settingView", "Lcom/reliance/yeticarpet/fragment/setting/mvp/SettingView;", "settingModel", "getSettingView", "credentialsErrorDialog", "app_debug"})
@dagger.Module()
public final class SettingModule {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    
    public SettingModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.reliance.yeticarpet.app.AppActivity()
    public final com.reliance.yeticarpet.fragment.setting.mvp.SettingView getSettingView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog credentialsErrorDialog) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.setting.mvp.SettingModel getSettingModel(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.setting.mvp.SettingPresenter getSettingPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.setting.mvp.SettingView settingView, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.setting.mvp.SettingModel settingModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.CredentialsErrorDialog getCredentialErrorDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String getErrorMessage() {
        return null;
    }
}