package com.reliance.yeticarpet.app
import android.content.Context
import com.reliance.yeticarpet.databasemanager.ApplicationDatabase
import dagger.Component
import dagger.android.AndroidInjectionModule


@AppScope
@Component(modules=[AndroidInjectionModule::class, AppModule::class, NetworkModule::class, DatabaseModule::class])
interface AppComponent {
    fun context(): Context
    fun webservice(): Webservice
    fun database(): ApplicationDatabase
}
