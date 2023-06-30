package com.reliance.yeticarpet.activity.retailer.distributorlist.di
import com.reliance.yeticarpet.activity.retailer.distributorlist.DistributorListActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(DistributorListModule::class)], dependencies=[(AppComponent::class)])
interface DistributorListComponent {
    abstract fun inject(distributorListActivity: DistributorListActivity)
}