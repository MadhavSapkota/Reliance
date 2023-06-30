package com.reliance.yeticarpet.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000202J\u0006\u00104\u001a\u000202J\u0006\u00105\u001a\u000202J\u0006\u00106\u001a\u00020\u0017J\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000108J\u0016\u00109\u001a\u0002022\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00170;H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR.\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u000e\u0010\"\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010\'\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001a\u0010*\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR.\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\u000e\u00100\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/reliance/yeticarpet/dialog/NepaliDatePickerDialog;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "DayPicker", "Landroid/widget/Spinner;", "btnCancel", "Landroid/widget/Button;", "currentDays", "", "getCurrentDays", "()I", "setCurrentDays", "(I)V", "currentMonth", "getCurrentMonth", "setCurrentMonth", "currentYear", "getCurrentYear", "setCurrentYear", "dayList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDayList", "()Ljava/util/ArrayList;", "setDayList", "(Ljava/util/ArrayList;)V", "dialog", "Landroid/app/Dialog;", "monthList", "getMonthList", "setMonthList", "monthPicker", "okButton", "selectedFromDay", "getSelectedFromDay", "setSelectedFromDay", "selectedFromMonth", "getSelectedFromMonth", "setSelectedFromMonth", "selectedFromYear", "getSelectedFromYear", "setSelectedFromYear", "yearList", "getYearList", "setYearList", "yearPicker", "getDismissDialog", "", "getFromListOfDays", "getFromListOfYear", "getFromMonthList", "getNepaliFromSelectedDate", "getOkObserable", "Lio/reactivex/Observable;", "showFromDialog", "stringArray", "", "app_debug"})
public final class NepaliDatePickerDialog {
    private androidx.appcompat.app.AppCompatActivity appCompatActivity;
    private android.app.Dialog dialog;
    private android.widget.Spinner yearPicker;
    private android.widget.Spinner monthPicker;
    private android.widget.Spinner DayPicker;
    private android.widget.Button okButton;
    private android.widget.Button btnCancel;
    private int selectedFromMonth = 1;
    private int selectedFromYear = 0;
    private int selectedFromDay = 0;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> yearList;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> dayList;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> monthList;
    private int currentYear = 0;
    private int currentMonth = 0;
    private int currentDays = 0;
    
    public NepaliDatePickerDialog(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    public final int getSelectedFromMonth() {
        return 0;
    }
    
    public final void setSelectedFromMonth(int p0) {
    }
    
    public final int getSelectedFromYear() {
        return 0;
    }
    
    public final void setSelectedFromYear(int p0) {
    }
    
    public final int getSelectedFromDay() {
        return 0;
    }
    
    public final void setSelectedFromDay(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getYearList() {
        return null;
    }
    
    public final void setYearList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getDayList() {
        return null;
    }
    
    public final void setDayList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getMonthList() {
        return null;
    }
    
    public final void setMonthList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public final int getCurrentYear() {
        return 0;
    }
    
    public final void setCurrentYear(int p0) {
    }
    
    public final int getCurrentMonth() {
        return 0;
    }
    
    public final void setCurrentMonth(int p0) {
    }
    
    public final int getCurrentDays() {
        return 0;
    }
    
    public final void setCurrentDays(int p0) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void showFromDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> stringArray) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getOkObserable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNepaliFromSelectedDate() {
        return null;
    }
    
    public final void getFromListOfYear() {
    }
    
    public final void getFromMonthList() {
    }
    
    public final void getFromListOfDays() {
    }
    
    public final void getDismissDialog() {
    }
}