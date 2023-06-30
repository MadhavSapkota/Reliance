package com.reliance.yeticarpet.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "errorMessage", "", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;)V", "cvOkBtn", "Landroid/widget/Button;", "dialog", "Landroid/app/Dialog;", "tvError", "Landroid/widget/TextView;", "dismissDialog", "", "getOKObservable", "Lio/reactivex/Observable;", "showDialog", "app_debug"})
public final class CredentialsErrorDialog {
    private androidx.appcompat.app.AppCompatActivity appCompatActivity;
    private java.lang.String errorMessage;
    private android.app.Dialog dialog;
    private android.widget.TextView tvError;
    private android.widget.Button cvOkBtn;
    
    public CredentialsErrorDialog(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getOKObservable() {
        return null;
    }
    
    public final void dismissDialog() {
    }
}