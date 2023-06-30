package com.reliance.yeticarpet.fragment.userprofile.mvp
import android.annotation.SuppressLint
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.apputlis.CustomProgressBar
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.databinding.FragmentUserprofileBinding
import com.reliance.yeticarpet.databinding.UserSettingFragmentBinding
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.ErrorDailog
import io.reactivex.Observable

class UserProfileView(
    private val appCompatActivity: AppCompatActivity,
    private val credentialsErrorDialog: CredentialsErrorDialog
) {
    var binding: FragmentUserprofileBinding? = null
    private var progressBar = CustomProgressBar()

    //Date Picker
    @SuppressLint("SetTextI18n")
    fun start(fragmentRetailerBinding: FragmentUserprofileBinding) {
        binding = fragmentRetailerBinding
    }


    fun showProgressDialog(statusString: String) {
        progressBar.show(appCompatActivity, statusString)
    }

    fun getErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            ErrorDailog(appCompatActivity, message!!)
        })
    }

    fun getCredentialErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            credentialsErrorDialog.showDialog(message!!)
        })
    }


    fun checkNetwork(): Boolean {
        return NetworkUtil.checkInternetConnection(appCompatActivity)
    }


    fun getOkObserable(): Observable<Any> {
        return credentialsErrorDialog.getOKObservable()
    }

    fun logOutObserble():Observable<Any>{
        return RxView.clicks(binding!!.rlLogout)
    }

    fun changePasswordObserble():Observable<Any>{
        return RxView.clicks(binding!!.rlChangePassword)
    }

}