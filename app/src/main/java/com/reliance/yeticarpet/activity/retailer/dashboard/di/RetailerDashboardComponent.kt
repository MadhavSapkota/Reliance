package com.reliance.yeticarpet.activity.retailer.dashboard.di
import com.reliance.yeticarpet.activity.retailer.dashboard.RetailerDashboardActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(RetailerDashboardModule::class)], dependencies=[(AppComponent::class)])
interface RetailerDashboardComponent {
    abstract fun inject(retailerDashboardActivity: RetailerDashboardActivity)
}