package com.reliance.yeticarpet.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/reliance/yeticarpet/app/DatabaseModule;", "", "()V", "provideDatabase", "Lcom/reliance/yeticarpet/databasemanager/ApplicationDatabase;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @AppScope()
    public final com.reliance.yeticarpet.databasemanager.ApplicationDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}