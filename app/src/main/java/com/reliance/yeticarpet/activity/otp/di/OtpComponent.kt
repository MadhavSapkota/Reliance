package com.reliance.yeticarpet.activity.otp.di
import com.reliance.yeticarpet.activity.otp.OtpActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(OtpModule::class)], dependencies=[(AppComponent::class)])
interface OtpComponent {
    abstract fun inject(otpActivity: OtpActivity)
}