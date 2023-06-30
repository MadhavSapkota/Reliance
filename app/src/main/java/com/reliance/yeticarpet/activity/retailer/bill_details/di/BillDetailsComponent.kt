package com.reliance.yeticarpet.activity.retailer.bill_details.di
import com.reliance.yeticarpet.activity.retailer.bill_details.BillDetailsActivity
import com.reliance.yeticarpet.activity.retailer.bill_details.di.BillDetailsModule
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(BillDetailsModule::class)], dependencies=[(AppComponent::class)])
interface BillDetailsComponent {
    abstract fun inject(billDetailsActivity: BillDetailsActivity)
}