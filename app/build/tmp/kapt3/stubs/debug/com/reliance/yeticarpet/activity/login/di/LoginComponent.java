package com.reliance.yeticarpet.activity.login.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/reliance/yeticarpet/activity/login/di/LoginComponent;", "", "inject", "", "loginActivity", "Lcom/reliance/yeticarpet/activity/login/LoginActivity;", "app_debug"})
@dagger.Component(modules = {com.reliance.yeticarpet.activity.login.di.LoginModule.class}, dependencies = {com.reliance.yeticarpet.app.AppComponent.class})
@com.reliance.yeticarpet.app.AppActivity()
public abstract interface LoginComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.login.LoginActivity loginActivity);
}