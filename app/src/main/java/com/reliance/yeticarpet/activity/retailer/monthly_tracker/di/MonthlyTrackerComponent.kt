package com.reliance.yeticarpet.activity.retailer.monthly_tracker.di
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.MonthlyTrackerActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(MonthlyTrackerModule::class)], dependencies=[(AppComponent::class)])
interface MonthlyTrackerComponent {
    abstract fun inject(monthlyTrackerActivity: MonthlyTrackerActivity)
}