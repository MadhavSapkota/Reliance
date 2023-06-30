package com.reliance.yeticarpet.activity.login.di
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(LoginModule::class)], dependencies=[(AppComponent::class)])
interface LoginComponent {
    abstract fun inject(loginActivity: LoginActivity)
}