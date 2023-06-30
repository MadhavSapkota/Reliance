package com.reliance.yeticarpet.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/reliance/yeticarpet/app/AppComponent;", "", "context", "Landroid/content/Context;", "database", "Lcom/reliance/yeticarpet/databasemanager/ApplicationDatabase;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.reliance.yeticarpet.app.AppModule.class, com.reliance.yeticarpet.app.NetworkModule.class, com.reliance.yeticarpet.app.DatabaseModule.class})
@AppScope()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context context();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reliance.yeticarpet.app.Webservice webservice();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reliance.yeticarpet.databasemanager.ApplicationDatabase database();
}