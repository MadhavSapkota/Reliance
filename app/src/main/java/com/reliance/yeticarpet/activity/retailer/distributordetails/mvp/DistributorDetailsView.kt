package com.reliance.yeticarpet.activity.retailer.distributordetails.mvp
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.databinding.DistributorDetailsActivityBinding
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.ErrorDailog
import io.reactivex.Observable

class DistributorDetailsView(private val appCompatActivity: AppCompatActivity,
                      private val loginErrorDialog: CredentialsErrorDialog
) {
    var binding: DistributorDetailsActivityBinding? = null
    private val progressDialog = ProgressDialog(appCompatActivity, R.style.MyProgressDialogStyle)
    fun start(binding_tracker: DistributorDetailsActivityBinding) {
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


    fun getOkObserable(): Observable<Any> {
        return loginErrorDialog.getOKObservable()
    }

    fun getDismissDialog(){
        loginErrorDialog.dismissDialog()
    }
}



