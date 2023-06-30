package com.reliance.yeticarpet.activity.otp
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.otp.di.DaggerOtpComponent
import com.reliance.yeticarpet.activity.otp.di.OtpModule
import com.reliance.yeticarpet.activity.otp.mvp.OtpPresenter
import com.reliance.yeticarpet.activity.otp.mvp.OtpView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.ActivityOtpBinding

import javax.inject.Inject

class OtpActivity : AppCompatActivity() {

    @Inject
    lateinit var otpView: OtpView

    @Inject
    lateinit var otpPresenter: OtpPresenter

    private lateinit var binding: ActivityOtpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerOtpComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .otpModule(OtpModule(this))
            .build()
            .inject(this)
        binding= ActivityOtpBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        otpView.start(binding)
        otpPresenter.onCreateView()
    }
    override fun onResume() {
        super.onResume()
    }


    //Splash Activity is started.
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, OtpActivity::class.java))
        }
    }
}
