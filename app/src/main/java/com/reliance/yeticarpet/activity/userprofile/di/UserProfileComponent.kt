package com.reliance.yeticarpet.activity.userprofile.di
import com.reliance.yeticarpet.activity.userprofile.UserProfileActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(UserProfileModule::class)], dependencies=[(AppComponent::class)])
interface UserProfileComponent {
    abstract fun inject(userProfileActivity: UserProfileActivity)
}