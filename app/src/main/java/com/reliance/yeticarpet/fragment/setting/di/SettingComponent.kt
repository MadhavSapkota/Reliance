package com.reliance.yeticarpet.fragment.setting.di
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.AppComponent
import com.reliance.yeticarpet.fragment.setting.SettingFragment
import dagger.Component

@AppActivity
@Component(modules=[(SettingModule::class)], dependencies = [(AppComponent::class)])
interface SettingComponent {
    abstract fun inject(settingFragment: SettingFragment)
}