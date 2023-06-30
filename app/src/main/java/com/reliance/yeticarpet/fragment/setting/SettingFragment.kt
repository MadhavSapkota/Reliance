package com.reliance.yeticarpet.fragment.setting
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.UserSettingFragmentBinding
import com.reliance.yeticarpet.fragment.setting.di.DaggerSettingComponent
import com.reliance.yeticarpet.fragment.setting.di.SettingModule
import com.reliance.yeticarpet.fragment.setting.mvp.SettingPresenter
import com.reliance.yeticarpet.fragment.setting.mvp.SettingView
import javax.inject.Inject

class SettingFragment : Fragment() {

    @Inject
    lateinit var settingView: SettingView

    @Inject
    lateinit var settingPresenter: SettingPresenter
    var showEt: Boolean? = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val hrApplication = AppApplication()
        DaggerSettingComponent.builder()
            .appComponent(hrApplication.get(requireActivity()).appComponent)
            .settingModule(SettingModule(activity as AppCompatActivity))
            .build()
            .inject(this)

        var binding = UserSettingFragmentBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        settingView.start(binding)
        settingPresenter.onCreate()
        return view
    }

    companion object {
        fun start(): SettingFragment {
            val fragment = SettingFragment()
            return fragment
        }
    }

    override fun onResume() {
        super.onResume()
    }
}




