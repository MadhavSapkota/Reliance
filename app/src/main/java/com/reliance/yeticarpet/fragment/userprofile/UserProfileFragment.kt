package com.reliance.yeticarpet.fragment.userprofile
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.FragmentUserprofileBinding
import com.reliance.yeticarpet.fragment.userprofile.di.DaggerUserProfileComponent
import com.reliance.yeticarpet.fragment.userprofile.di.UserProfileModule
import com.reliance.yeticarpet.fragment.userprofile.mvp.UserProfilePresenter
import com.reliance.yeticarpet.fragment.userprofile.mvp.UserProfileView
import javax.inject.Inject

class UserProfileFragment : Fragment() {

    @Inject
    lateinit var userProfileView: UserProfileView

    @Inject
    lateinit var userProfilePresenter: UserProfilePresenter
    var showEt: Boolean? = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val hrApplication = AppApplication()
        DaggerUserProfileComponent.builder()
            .appComponent(hrApplication.get(requireActivity()).appComponent)
            .userProfileModule(UserProfileModule(activity as AppCompatActivity))
            .build()
            .inject(this)

        var binding = FragmentUserprofileBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        userProfileView.start(binding)
        userProfilePresenter.onCreate()
        return view
    }

    companion object {
        fun start(): UserProfileFragment {
            val fragment = UserProfileFragment()
            return fragment
        }
    }

    override fun onResume() {
        super.onResume()
    }
}




