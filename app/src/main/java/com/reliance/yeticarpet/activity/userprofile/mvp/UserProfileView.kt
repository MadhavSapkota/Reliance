package com.reliance.yeticarpet.activity.userprofile.mvp
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.databinding.ActivityUserProfileLayoutBinding
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.ErrorDailog

class  UserProfileView(private val appCompatActivity: AppCompatActivity,
                   private val loginErrorDialog: CredentialsErrorDialog
) {
    var binding: ActivityUserProfileLayoutBinding? = null
    private val progressDialog = ProgressDialog(appCompatActivity, R.style.MyProgressDialogStyle)
    fun start(binding_tracker: ActivityUserProfileLayoutBinding) {
        binding = binding_tracker
    }

    fun showProgressDialog() {
        progressDialog.show()
        progressDialog.setMessage(appCompatActivity.getString(R.string.processing))
    }

    fun hidProgressDialog() {
        progressDialog.dismiss()
    }

    fun checkNetwork(): Boolean {
        return NetworkUtil.checkInternetConnection(appCompatActivity)
    }

    fun getErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            ErrorDailog(appCompatActivity, message!!)
        })
    }

    fun getCredentialErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            loginErrorDialog.showDialog(message!!)
        })
    }
}



