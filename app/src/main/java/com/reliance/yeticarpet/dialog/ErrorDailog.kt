/*
The main purpose of creating this dialog box is to  display  api errors information when user tries
 to make connection with the server and various operations
 */

package com.reliance.yeticarpet.dialog
import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.R
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.Observable


class ErrorDailog(
    private var appCompatActivity: AppCompatActivity,
    private var errorMessage: String,
) {

    private var dialog: Dialog=Dialog(appCompatActivity)
    private var tvError: TextView
    private var cvOKBtn: Button


    init {
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)

        dialog.setContentView(R.layout.error_layout)
        tvError=dialog.findViewById(R.id.tvError)
        cvOKBtn=dialog.findViewById(R.id.btnRate)
        tvError.text=errorMessage
        showDialog(appCompatActivity)
    }

    @SuppressLint("CheckResult")

    fun showDialog(activity: Activity?) {
        activity?.let {
            dialog.setCancelable(false)

            val lp = WindowManager.LayoutParams()
            lp.copyFrom(dialog.window?.attributes)
            lp.width = WindowManager.LayoutParams.MATCH_PARENT
            dialog.window?.attributes = lp

            dialog.show()

            getOKObservable().subscribe {
                dialog.dismiss()
            }
        }
    }




    //    fun showDialog() {
//
//        val lp = WindowManager.LayoutParams()
//        lp.copyFrom(dialog.window!!.attributes)
//        lp.width = WindowManager.LayoutParams.MATCH_PARENT
//        dialog.window!!.attributes = lp
//        dialog.setCanceledOnTouchOutside(false)
//        dialog.setCancelable(false)
//        dialog.show()
//
//        getOKObservable().subscribe {
//            dismissDialog()
//        }
//    }
    fun getOKObservable(): Observable<Any> {
        return RxView.clicks(cvOKBtn)
    }

    fun dismissDialog() {
        dialog.dismiss()
    }
}
