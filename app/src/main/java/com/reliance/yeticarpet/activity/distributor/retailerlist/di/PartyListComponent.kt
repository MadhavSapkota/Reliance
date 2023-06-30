package com.reliance.yeticarpet.activity.distributor.retailerlist.di
import com.reliance.yeticarpet.activity.distributor.retailerlist.PartyListActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(PartyListModule::class)], dependencies=[(AppComponent::class)])
interface PartyListComponent {
    abstract fun inject(partyListActivity: PartyListActivity)
}