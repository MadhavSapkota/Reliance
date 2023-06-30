package com.reliance.yeticarpet.activity.setting
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.setting.di.DaggerSettingComponent
import com.reliance.yeticarpet.activity.setting.di.SettingModule
import com.reliance.yeticarpet.activity.setting.mvp.SettingPresenter
import com.reliance.yeticarpet.activity.setting.mvp.SettingView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.ActivityUserSettingBinding
import javax.inject.Inject

class SettingActivity : AppCompatActivity() {

    @Inject
    lateinit var settingView: SettingView

    @Inject
    lateinit var  settingPresenter: SettingPresenter

    private lateinit var binding: ActivityUserSettingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerSettingComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .settingModule(SettingModule(this))
            .build()
            .inject(this)
        binding=ActivityUserSettingBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        settingView.start(binding)
        settingPresenter.onCreateView()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, SettingActivity::class.java))
        }
    }
}
