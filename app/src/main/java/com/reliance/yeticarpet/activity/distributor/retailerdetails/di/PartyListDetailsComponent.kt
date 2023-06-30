package com.reliance.yeticarpet.activity.distributor.retailerdetails.di
import com.reliance.yeticarpet.activity.distributor.retailerdetails.PartyListDetailsActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(PartyListDetailsModule::class)], dependencies=[(AppComponent::class)])
interface PartyListDetailsComponent {
    abstract fun inject(partyListDetailsActivity: PartyListDetailsActivity)
}