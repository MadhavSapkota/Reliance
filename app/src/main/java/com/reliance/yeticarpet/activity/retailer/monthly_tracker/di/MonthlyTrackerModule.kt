package com.reliance.yeticarpet.activity.retailer.monthly_tracker.di

import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.PercentageAdapter
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.TrackerAdapter
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerModel
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerPresenter
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import dagger.Module
import dagger.Provides

@Module
class MonthlyTrackerModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getMonthlyTrackerView(
        loginErrorDialog: CredentialsErrorDialog,
        monthlyTrackerAdapter: TrackerAdapter,
        percentageAdapter: PercentageAdapter
    ): MonthlyTrackerView {
        return MonthlyTrackerView(appCompatActivity, loginErrorDialog, monthlyTrackerAdapter, percentageAdapter)
    }

    @Provides
    fun getMonthlyTrackerModel(webservice: Webservice): MonthlyTrackerModel {
        return MonthlyTrackerModel(appCompatActivity, webservice)
    }

    @Provides
    fun getRetailerDashboardAdapter(): TrackerAdapter {
        return TrackerAdapter(appCompatActivity)
    }

    @Provides
    fun getPercentageAdapter(): PercentageAdapter {
        return PercentageAdapter(appCompatActivity)
    }

    @Provides
    fun getMonthlyTrackerPresenter(
        monthlyTrackerModel: MonthlyTrackerModel,
        monthlyTrackerView: MonthlyTrackerView
    ): MonthlyTrackerPresenter {
        return MonthlyTrackerPresenter(monthlyTrackerModel, monthlyTrackerView)
    }

    @Provides
    fun getCredentialsErrorDialog(errorMessage: String): CredentialsErrorDialog {
        return CredentialsErrorDialog(appCompatActivity, errorMessage)
    }

    @Provides
    fun getErrorMessage(): String {
        return String.Companion.toString()
    }
}