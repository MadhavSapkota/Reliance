package com.reliance.yeticarpet.activity.login
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.login.di.DaggerLoginComponent
import com.reliance.yeticarpet.activity.login.di.LoginModule
import com.reliance.yeticarpet.activity.login.mvp.LoginPresenter
import com.reliance.yeticarpet.activity.login.mvp.LoginView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.ActivityLoginBinding

import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var loginView: LoginView

    @Inject
    lateinit var loginPresenter: LoginPresenter

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerLoginComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .loginModule(LoginModule(this))
            .build()
            .inject(this)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        loginView.start(binding)
        loginPresenter.onCreateView()
    }
    //Splash Activity is started.
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, LoginActivity::class.java))
        }
    }
}
