package com.reliance.yeticarpet.fragment.retailer.dashboard.adapter
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.apputlis.AppConstant.totalPurchase
import com.reliance.yeticarpet.apputlis.AppUtils.convertToTitleCase
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumber
import com.reliance.yeticarpet.apputlis.RetailerInfo.retailerListSize
import com.reliance.yeticarpet.databinding.AnnualSchemeDataBinding
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail
import io.reactivex.subjects.PublishSubject


class AnnualSchemeAdapter(
    private val appCompatActivity: AppCompatActivity) :
    RecyclerView.Adapter<AnnualSchemeHolder>() {
    private var schemeList = ArrayList<SchemeDetail>()
    var clickSubject = PublishSubject.create<SchemeDetail>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnnualSchemeHolder {
        val inflater = LayoutInflater.from(appCompatActivity)
        val binding = AnnualSchemeDataBinding.inflate(inflater, parent, false)
        val viewHolder = AnnualSchemeHolder(binding)
        return viewHolder
    }


    @SuppressLint("ResourceAsColor", "SetTextI18n", "SuspiciousIndentation")
    override fun onBindViewHolder(holder: AnnualSchemeHolder, position: Int) {
        val result = schemeList[position]
        retailerListSize = schemeList.size.toString()
        var newValue = result.retailerScheme?.get(0)?.offer

        holder.tvPercentage.text = newValue?.let { formatNumber(it.toDouble()) } + "%"

        holder.tvAnnualScheme.text = result.retailerScheme.toString()

        holder.tvAnnualScheme.text = result.title?.let { convertToTitleCase(it) }
        holder.tvTotalPurchasePrice.text = totalPurchase

        holder.tvSchemeAmount.text = result.retailerScheme?.get(0)?.schemeAmount


        when {
            holder.clickDown.isChecked -> {
                holder.rlPurchase.visibility = View.VISIBLE
            }
            else -> {
                holder.rlPurchase.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int {
        return schemeList.size

    }
}
