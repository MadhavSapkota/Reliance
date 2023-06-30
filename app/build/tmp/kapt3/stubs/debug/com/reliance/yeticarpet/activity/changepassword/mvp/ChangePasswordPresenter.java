package com.reliance.yeticarpet.activity.changepassword.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/reliance/yeticarpet/activity/changepassword/mvp/ChangePasswordPresenter;", "", "changePasswordModel", "Lcom/reliance/yeticarpet/activity/changepassword/mvp/ChangePasswordModel;", "changePasswordView", "Lcom/reliance/yeticarpet/activity/changepassword/mvp/ChangePasswordView;", "(Lcom/reliance/yeticarpet/activity/changepassword/mvp/ChangePasswordModel;Lcom/reliance/yeticarpet/activity/changepassword/mvp/ChangePasswordView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isSavePassword", "", "()Z", "setSavePassword", "(Z)V", "getLoginRequest", "", "onCreateView", "userLoginRequestApi", "userLoginSuccessApi", "result", "Lcom/reliance/yeticarpet/activity/changepassword/dto/ChangePasswordResponse;", "userloginError", "e", "", "app_debug"})
public final class ChangePasswordPresenter {
    private final com.reliance.yeticarpet.activity.changepassword.mvp.ChangePasswordModel changePasswordModel = null;
    private final com.reliance.yeticarpet.activity.changepassword.mvp.ChangePasswordView changePasswordView = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private boolean isSavePassword = false;
    
    public ChangePasswordPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.changepassword.mvp.ChangePasswordModel changePasswordModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.changepassword.mvp.ChangePasswordView changePasswordView) {
        super();
    }
    
    public final boolean isSavePassword() {
        return false;
    }
    
    public final void setSavePassword(boolean p0) {
    }
    
    public final void onCreateView() {
    }
    
    private final void getLoginRequest() {
    }
    
    private final void userLoginRequestApi() {
    }
    
    private final void userLoginSuccessApi(com.reliance.yeticarpet.activity.changepassword.dto.ChangePasswordResponse result) {
    }
    
    private final void userloginError(java.lang.Throwable e) {
    }
}