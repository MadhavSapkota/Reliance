package com.reliance.yeticarpet.activity.distributor.retailerdetails.adapter
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumberWithCommasAndDecimals
import com.reliance.yeticarpet.databinding.PartylistDetailsDataBinding

class PartyListDetailsAdapter(private val context: Context) : RecyclerView.Adapter<PartyListDetailsHolder>() {
    private var retailerPurchase = ArrayList<RetailerData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PartyListDetailsHolder {
        val inflater = LayoutInflater.from(context)
        val binding = PartylistDetailsDataBinding.inflate(inflater, parent, false)
        return PartyListDetailsHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: PartyListDetailsHolder, position: Int) {
        val result = retailerPurchase[position]
        holder.tvPvcFlooringPrice.text = "Rs"+" "+ result.pvcFlooring?.let {
            formatNumberWithCommasAndDecimals(
                it
            )
        }
        holder.tvCoilMatePrice.text ="Rs"+" "+ result.coilMat?.let { formatNumberWithCommasAndDecimals(it) }
        holder.tvNonWoovenPrice.text ="Rs"+" "+ result.nonWovenCarpet?.let {
            formatNumberWithCommasAndDecimals(
                it
            )
        }
        holder.tvTuffedCarpetPrice.text = "Rs"+" "+ result.tuftedCarpet?.let {
            formatNumberWithCommasAndDecimals(
                it
            )
        }
    }


    override fun getItemCount(): Int {
        return retailerPurchase.size
    }

    fun showRetailerListItem(dashboardMap: Map<String, RetailerData>?, aboolean: Boolean) {
        when (aboolean) {
            true -> retailerPurchase.clear()
        }
        if (dashboardMap != null && dashboardMap.isNotEmpty()) {
            this.retailerPurchase.addAll(dashboardMap.values)
        }
        notifyDataSetChanged()
    }
}





