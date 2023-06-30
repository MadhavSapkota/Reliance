package com.reliance.yeticarpet.activity.userprofile
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.userprofile.di.DaggerUserProfileComponent
import com.reliance.yeticarpet.activity.userprofile.di.UserProfileModule
import com.reliance.yeticarpet.activity.userprofile.mvp.UserProfilePresenter
import com.reliance.yeticarpet.activity.userprofile.mvp.UserProfileView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.ActivityUserProfileLayoutBinding
import javax.inject.Inject

class UserProfileActivity : AppCompatActivity() {

    @Inject
    lateinit var userProfileView: UserProfileView

    @Inject
    lateinit var  userProfilePresenter: UserProfilePresenter

    private lateinit var binding: ActivityUserProfileLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerUserProfileComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .userProfileModule(UserProfileModule(this))
            .build()
            .inject(this)
        binding=ActivityUserProfileLayoutBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        userProfileView.start(binding)
        userProfilePresenter.onCreateView()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, UserProfileActivity::class.java))
        }
    }
}
