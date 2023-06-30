package com.reliance.yeticarpet.activity.setting.di
import com.reliance.yeticarpet.activity.setting.SettingActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(SettingModule::class)], dependencies=[(AppComponent::class)])
interface SettingComponent {
    abstract fun inject(settingActivity: SettingActivity)
}