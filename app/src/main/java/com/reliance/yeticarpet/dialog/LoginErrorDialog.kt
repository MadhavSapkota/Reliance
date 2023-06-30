package com.reliance.yeticarpet.dialog
import android.annotation.SuppressLint
import android.app.Dialog
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import io.reactivex.Observable


class LoginErrorDialog(
    private var appCompatActivity: AppCompatActivity,
    private var errorMessage: String
) {

    private var dialog: Dialog=Dialog(appCompatActivity)
    private var tvError: TextView
    private var cvOkBtn: Button

    init {
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialog.setContentView(R.layout.email_validation_error)
        tvError=dialog.findViewById(R.id.tvError)
        cvOkBtn=dialog.findViewById(R.id.btnOK)
    }

    @SuppressLint("CheckResult")
    fun showDialog(errorMessage: String) {
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialog.window!!.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        dialog.window!!.attributes = lp
        tvError.text=errorMessage
        dialog.setCanceledOnTouchOutside(false)
        dialog.setCancelable(false)
        dialog.show()

        getOKObservable().subscribe {
            dismissDialog()
        }

    }

    fun getOKObservable(): Observable<Any> {
        return RxView.clicks(cvOkBtn)
    }

    fun dismissDialog() {
        dialog.dismiss()
    }
}
