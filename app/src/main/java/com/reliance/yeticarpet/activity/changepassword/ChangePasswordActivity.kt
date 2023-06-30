package com.reliance.yeticarpet.activity.changepassword
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.changepassword.di.ChangePasswordModule
import com.reliance.yeticarpet.activity.changepassword.di.DaggerChangePasswordComponent
import com.reliance.yeticarpet.activity.changepassword.mvp.ChangePasswordPresenter
import com.reliance.yeticarpet.activity.changepassword.mvp.ChangePasswordView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.ChangePasswordBinding
import javax.inject.Inject

class ChangePasswordActivity : AppCompatActivity() {

    @Inject
    lateinit var changePasswordView: ChangePasswordView

    @Inject
    lateinit var changePasswordPresenter: ChangePasswordPresenter

    private lateinit var binding: ChangePasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerChangePasswordComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .changePasswordModule(ChangePasswordModule(this))
            .build()
            .inject(this)
        binding= ChangePasswordBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        changePasswordView.start(binding)
        changePasswordPresenter.onCreateView()
    }
    //Splash Activity is started.
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, ChangePasswordActivity::class.java))
        }
    }
}
