package com.reliance.yeticarpet.activity.changepassword.di
import com.reliance.yeticarpet.activity.changepassword.ChangePasswordActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(ChangePasswordModule::class)], dependencies=[(AppComponent::class)])
interface ChangePasswordComponent {
    abstract fun inject(changePasswordActivity: ChangePasswordActivity)
}