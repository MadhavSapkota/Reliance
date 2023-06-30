package com.reliance.yeticarpet.activity.retailer.distributorlist.adapter
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.apputlis.AppUtils
import com.reliance.yeticarpet.databinding.DataDistributorListBinding
import com.reliance.yeticarpet.activity.retailer.bill.dto.Result
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumberWithCommasAndDecimals


class DistributorListAdapter(private val context: Context) : RecyclerView.Adapter<DistributorListHolder>() {
    private var resultList = ArrayList<Result>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DistributorListHolder {
        val inflater = LayoutInflater.from(context)
        val binding = DataDistributorListBinding.inflate(inflater, parent, false)
        return DistributorListHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: DistributorListHolder, position: Int) {
        val result = resultList[position]
        if (result.distributor != null && result.distributor!!.length > 20) {
            holder.tvDistributorName.text = "${result.distributor!!.substring(0, 20)}..."
        } else {
            holder.tvDistributorName.text = result.distributor
        }
        holder.tvDistributorRs.text = "Rs"
        val formattedResult = result.total?.toDouble()?.let { AppUtils.formatDecimalValue(it) }
        holder.tvDistributorDigit.text = formatNumberWithCommasAndDecimals(formattedResult.toString())
    }


    override fun getItemCount(): Int {
        return resultList.size
    }

    fun showBillsItem(dashboardItem:List<Result>?, clearList: Boolean) {
        if (clearList) {
            resultList.clear()
        }
        if (dashboardItem != null) {
            resultList.addAll(dashboardItem)
        }
        notifyDataSetChanged()
    }
}