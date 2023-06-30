package com.reliance.yeticarpet.fragment.retailer.dashboard.di
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import com.reliance.yeticarpet.fragment.retailer.dashboard.RetailerDashboardFragment
import dagger.Component

@AppActivity
@Component(modules=[(RetailerDashboardFragmentModule::class)], dependencies = [(AppComponent::class)])
interface RetailerDashboardFragmentComponent {
    abstract fun inject(retailerDashboardFragment: RetailerDashboardFragment)
}