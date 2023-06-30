package com.reliance.yeticarpet.fragment.userprofile.di
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import com.reliance.yeticarpet.fragment.userprofile.UserProfileFragment
import dagger.Component

@AppActivity
@Component(modules=[(UserProfileModule::class)], dependencies = [(AppComponent::class)])
interface UserProfileComponent {
    abstract fun inject(userProfileFragment: UserProfileFragment)
}