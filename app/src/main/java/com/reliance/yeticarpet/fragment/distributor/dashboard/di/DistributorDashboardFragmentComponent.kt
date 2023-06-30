package com.reliance.yeticarpet.fragment.distributor.dashboard.di
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import com.reliance.yeticarpet.fragment.distributor.dashboard.DistributorDashboardFragment
import dagger.Component

@AppActivity
@Component(modules=[(DistributorDashboardFragmentModule::class)], dependencies = [(AppComponent::class)])
interface DistributorDashboardFragmentComponent {
    abstract fun inject(distributorDashboardFragment: DistributorDashboardFragment)
}