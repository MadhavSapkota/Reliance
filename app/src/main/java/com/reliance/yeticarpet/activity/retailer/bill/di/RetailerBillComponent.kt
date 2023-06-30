package com.reliance.yeticarpet.activity.retailer.bill.di
import com.reliance.yeticarpet.activity.retailer.bill.RetailerBillActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(RetailerBillModule::class)], dependencies=[(AppComponent::class)])
interface RetailerBillComponent {
    abstract fun inject(retailerBillActivity: RetailerBillActivity)
}