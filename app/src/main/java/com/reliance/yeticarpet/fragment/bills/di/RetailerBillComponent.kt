package com.reliance.yeticarpet.fragment.bills.di
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import com.reliance.yeticarpet.fragment.bills.RetailerBillFragment
import dagger.Component

@AppActivity
@Component(modules=[(RetailerBillModule::class)], dependencies = [(AppComponent::class)])
interface RetailerBillComponent {
    abstract fun inject(retailerBillFragment: RetailerBillFragment)
}