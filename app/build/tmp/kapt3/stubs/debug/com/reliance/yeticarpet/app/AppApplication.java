package com.reliance.yeticarpet.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/reliance/yeticarpet/app/AppApplication;", "Landroid/app/Application;", "()V", "appComponent", "Lcom/reliance/yeticarpet/app/AppComponent;", "getAppComponent", "()Lcom/reliance/yeticarpet/app/AppComponent;", "setAppComponent", "(Lcom/reliance/yeticarpet/app/AppComponent;)V", "instance", "attachBaseContext", "", "base", "Landroid/content/Context;", "get", "activity", "Landroidx/fragment/app/FragmentActivity;", "onCreate", "Companion", "body", "app_debug"})
public final class AppApplication extends android.app.Application {
    public com.reliance.yeticarpet.app.AppComponent appComponent;
    private com.reliance.yeticarpet.app.AppApplication instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.reliance.yeticarpet.app.AppApplication.Companion Companion = null;
    
    public AppApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.AppComponent getAppComponent() {
        return null;
    }
    
    public final void setAppComponent(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.AppComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.AppApplication get(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.app.AppComponent appComponent() {
        return null;
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/reliance/yeticarpet/app/AppApplication$body;", "", "()V", "appcontext", "Lcom/reliance/yeticarpet/app/AppApplication;", "getAppcontext", "()Lcom/reliance/yeticarpet/app/AppApplication;", "setAppcontext", "(Lcom/reliance/yeticarpet/app/AppApplication;)V", "app_debug"})
    public static final class body {
        @org.jetbrains.annotations.NotNull()
        public static final com.reliance.yeticarpet.app.AppApplication.body INSTANCE = null;
        @org.jetbrains.annotations.Nullable()
        private static com.reliance.yeticarpet.app.AppApplication appcontext;
        
        private body() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.reliance.yeticarpet.app.AppApplication getAppcontext() {
            return null;
        }
        
        public final void setAppcontext(@org.jetbrains.annotations.Nullable()
        com.reliance.yeticarpet.app.AppApplication p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/reliance/yeticarpet/app/AppApplication$Companion;", "", "()V", "getContext", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context getContext() {
            return null;
        }
    }
}