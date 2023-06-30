package com.reliance.yeticarpet.activity.forgotpassword.di
import com.reliance.yeticarpet.activity.forgotpassword.ForgotPasswordActivity
import com.reliance.yeticarpet.activity.forgotpassword.di.ForgotPasswordModule
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(ForgotPasswordModule::class)], dependencies=[(AppComponent::class)])
interface ForgotPasswordComponent {
    abstract fun inject(forgotPasswordActivity: ForgotPasswordActivity)
}