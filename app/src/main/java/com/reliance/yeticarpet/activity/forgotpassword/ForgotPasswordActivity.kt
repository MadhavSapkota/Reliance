package com.reliance.yeticarpet.activity.forgotpassword
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.forgotpassword.di.DaggerForgotPasswordComponent
import com.reliance.yeticarpet.activity.forgotpassword.di.ForgotPasswordModule
import com.reliance.yeticarpet.activity.forgotpassword.mvp.ForgotPasswordPresenter
import com.reliance.yeticarpet.activity.forgotpassword.mvp.ForgotPasswordView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.ActivityForgetPasswordBinding
import javax.inject.Inject

class ForgotPasswordActivity : AppCompatActivity() {

    @Inject
    lateinit var forgotPasswordView: ForgotPasswordView

    @Inject
    lateinit var forgotPasswordPresenter: ForgotPasswordPresenter

    private lateinit var binding: ActivityForgetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerForgotPasswordComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .forgotPasswordModule(ForgotPasswordModule(this))
            .build()
            .inject(this)
        binding=ActivityForgetPasswordBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        forgotPasswordView.start(binding)
        forgotPasswordPresenter.onCreateView()
    }
    override fun onResume() {
        super.onResume()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, ForgotPasswordActivity::class.java))
        }
    }
}
