package com.reliance.yeticarpet.activity.userprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/reliance/yeticarpet/activity/userprofile/UserProfileActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/reliance/yeticarpet/databinding/ActivityUserProfileLayoutBinding;", "userProfilePresenter", "Lcom/reliance/yeticarpet/activity/userprofile/mvp/UserProfilePresenter;", "getUserProfilePresenter", "()Lcom/reliance/yeticarpet/activity/userprofile/mvp/UserProfilePresenter;", "setUserProfilePresenter", "(Lcom/reliance/yeticarpet/activity/userprofile/mvp/UserProfilePresenter;)V", "userProfileView", "Lcom/reliance/yeticarpet/activity/userprofile/mvp/UserProfileView;", "getUserProfileView", "()Lcom/reliance/yeticarpet/activity/userprofile/mvp/UserProfileView;", "setUserProfileView", "(Lcom/reliance/yeticarpet/activity/userprofile/mvp/UserProfileView;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class UserProfileActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.reliance.yeticarpet.activity.userprofile.mvp.UserProfileView userProfileView;
    @javax.inject.Inject()
    public com.reliance.yeticarpet.activity.userprofile.mvp.UserProfilePresenter userProfilePresenter;
    private com.reliance.yeticarpet.databinding.ActivityUserProfileLayoutBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final com.reliance.yeticarpet.activity.userprofile.UserProfileActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public UserProfileActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.activity.userprofile.mvp.UserProfileView getUserProfileView() {
        return null;
    }
    
    public final void setUserProfileView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.userprofile.mvp.UserProfileView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.activity.userprofile.mvp.UserProfilePresenter getUserProfilePresenter() {
        return null;
    }
    
    public final void setUserProfilePresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.userprofile.mvp.UserProfilePresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/reliance/yeticarpet/activity/userprofile/UserProfileActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}