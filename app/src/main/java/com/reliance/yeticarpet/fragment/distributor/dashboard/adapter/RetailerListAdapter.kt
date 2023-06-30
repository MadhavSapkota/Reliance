package com.reliance.yeticarpet.fragment.distributor.dashboard.adapter
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumberWithCommasAndDecimals
import com.reliance.yeticarpet.databinding.DistributorDashboardRetailerDataBinding
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.RetailerPurchase
import io.reactivex.subjects.PublishSubject


class RetailerListAdapter(private val context: Context) : RecyclerView.Adapter<RetailerListHolder>() {
    private var retailerPurchase = ArrayList<RetailerPurchase>()
    var clickSubject = PublishSubject.create<RetailerPurchase>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetailerListHolder {
        val inflater = LayoutInflater.from(context)
        val binding = DistributorDashboardRetailerDataBinding.inflate(inflater, parent, false)
        val viewHolder = RetailerListHolder(binding)
        return viewHolder
    }


    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: RetailerListHolder, position: Int) {
        val result = retailerPurchase[position]

        if (result.retailerName != null && result.retailerName!!.length > 15) {
            holder.tvRetailerName.text = "${result.retailerName!!.substring(0, 15)}..."
        } else {
            holder.tvRetailerName.text = result.retailerName
        }

        holder.tvRetailerAmount.text = formatNumberWithCommasAndDecimals(result.total.toString())
    }


    override fun getItemCount(): Int {
        return minOf(4, retailerPurchase.size)
    }

    fun showRetailerListItem(dashboardMap: Map<String, RetailerPurchase>?, aboolean: Boolean) {
        when (aboolean) {
            true -> retailerPurchase.clear()
        }
        if (dashboardMap != null && dashboardMap.isNotEmpty()) {
            this.retailerPurchase.addAll(dashboardMap.values)
        }
        notifyDataSetChanged()
    }
}