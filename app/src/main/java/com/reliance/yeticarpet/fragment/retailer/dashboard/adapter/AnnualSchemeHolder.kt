package com.reliance.yeticarpet.fragment.retailer.dashboard.adapter
import android.widget.CheckBox
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.AnnualSchemeDataBinding

class AnnualSchemeHolder(val binding: AnnualSchemeDataBinding): RecyclerView.ViewHolder(binding.root) {
    var tvAnnualScheme: TextView = binding.textAnnualScheme
    var rlPurchase: RelativeLayout = binding.rlPurchase
    var tvCurrentOffer: TextView = binding.textCurrentOffer
    var tvPercentage: TextView = binding.textPercentage
    var tvSchemeAmount: TextView = binding.textRsAmount
    var tvSchemeEarned: TextView = binding.textSchemeEarned
    var tvTotalPurchasePrice: TextView = binding.tvTotalPurchasePrice
    var clickDown: CheckBox = binding.ivDropIcon
}