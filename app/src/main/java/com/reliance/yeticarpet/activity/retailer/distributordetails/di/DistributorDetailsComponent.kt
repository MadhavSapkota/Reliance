package com.reliance.yeticarpet.activity.retailer.distributordetails.di
import com.reliance.yeticarpet.activity.retailer.distributordetails.DistributorDetailsActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(DistributorDetailsModule::class)], dependencies=[(AppComponent::class)])
interface DistributorDetailsComponent {
    abstract fun inject(distributorDetailsActivity: DistributorDetailsActivity)
}