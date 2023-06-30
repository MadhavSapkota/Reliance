package com.reliance.yeticarpet.fragment.setting.mvp
import android.annotation.SuppressLint
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.apputlis.AppConstant.distributorDashboardChecked
import com.reliance.yeticarpet.apputlis.AppConstant.retailerDashboardChecked
import com.reliance.yeticarpet.apputlis.CustomProgressBar
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.databinding.UserSettingFragmentBinding
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.ErrorDailog
import io.reactivex.Observable

class SettingView(
    private val appCompatActivity: AppCompatActivity,
    private val credentialsErrorDialog: CredentialsErrorDialog
) {
    var binding: UserSettingFragmentBinding? = null
    private var progressBar = CustomProgressBar()

    //Date Picker
    @SuppressLint("SetTextI18n")
    fun start(fragmentRetailerBinding: UserSettingFragmentBinding) {
        binding = fragmentRetailerBinding
        setPartyListOrDistributorList()
    }

    fun showProgressDialog(statusString: String) {
        progressBar.show(appCompatActivity, statusString)
    }

    fun setPartyListOrDistributorList(){
        if (distributorDashboardChecked.equals(true)){
            retailerDashboardChecked = false
            binding!!.tvDistributorList.text = "Party List"
        }
        else if (retailerDashboardChecked.equals(true)){
            distributorDashboardChecked = false
            binding!!.tvDistributorList.text = "Distributor List"
        }
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

    fun clickDataIcon(): Observable<Any>{
        return RxView.clicks(binding!!.ivDropIconData)
    }

    fun clickBillList(): Observable<Any>{
        return RxView.clicks(binding!!.tvBillData)
    }

    fun clickUserList(): Observable<Any>{
        return RxView.clicks(binding!!.rlUser)
    }



    fun clickDistributorList(): Observable<Any>{
        return RxView.clicks(binding!!.tvDistributorList)
    }

    fun loadFragment(fragment: Fragment) {
        val transaction=appCompatActivity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container_view_dashboard, fragment)
        transaction.commit()
    }

    fun setDataDropClickable(){
        when{
            binding!!.ivDropIconData.isChecked->{
                binding!!.tvBillData.visibility = View.VISIBLE
                binding!!.tvDistributorList.visibility = View.VISIBLE

            }
            else -> {
                binding!!.tvBillData.visibility = View.GONE
                binding!!.tvDistributorList.visibility = View.GONE
            }
        }

    }

}