package com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.apputlis.AppConstant
import com.reliance.yeticarpet.apputlis.AppConstant.clickedTPosition
import com.reliance.yeticarpet.apputlis.AppUtils
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumberWithCommasAndDecimals
import com.reliance.yeticarpet.apputlis.RetailerInfo
import com.reliance.yeticarpet.databinding.MonthlyTargetTrackerDataBinding
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Offer
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Targets
import java.math.BigDecimal
import java.math.RoundingMode

class TrackerAdapter(private val context: Context) : RecyclerView.Adapter<TrackerHolder>() {
    private var schemeList = ArrayList<Targets>()
    private var clickedTargets: List<Targets>? = null

    private var selectedPosition = 0
   var currentValue =0
    var requiredValue = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackerHolder {
        val inflater = LayoutInflater.from(context)
        val binding = MonthlyTargetTrackerDataBinding.inflate(inflater, parent, false)
        return TrackerHolder(binding)
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: TrackerHolder, position: Int) {
        val result = schemeList[position]
        val targetList = result.target


        val currentMonth: Int = RetailerInfo.currentMonth

        for ((category, totalSell) in AppConstant.hashMap) {
            if (category == result.category) {
                val formattedResult = totalSell.toDouble().let { AppUtils.formatDecimalValue(it) }
                val dividedResult1 = formattedResult.toDouble().toInt() / currentMonth
                requiredValue = dividedResult1
                holder.tvCoilMaxPrice.text = formatNumberWithCommasAndDecimals(dividedResult1.toString()) //requiredValue
                println("Category: ${result.category}, Total Sell: $totalSell")
            }
        }

        if (targetList != null && targetList.isNotEmpty()) {
            holder.tvMatTextView.text = result.category

            val targetValue = BigDecimal(result.target!!)
            val dividedResult = targetValue.divide(BigDecimal(12), 2, RoundingMode.HALF_UP)
            val intValue = dividedResult.toInt() //currentValue
            currentValue = intValue
            holder.tvCurrentMonthlyPurchase.text = formatNumberWithCommasAndDecimals(intValue.toString())

            val lightGreenColor = ContextCompat.getColor(context, R.color.colorLightGreen)
            val redColor = ContextCompat.getColor(context, R.color.colorRed)

            if (requiredValue< currentValue) {
                holder.tvCoilMaxPrice.setTextColor(redColor)
            }
            else{
                holder.tvCoilMaxPrice.setTextColor(lightGreenColor)

            }

        } else if (targetList == null) {
            holder.tvCurrentMonthlyPurchase.text = "0"
            holder.tvMatTextView.text = "Empty target list"
            Toast.makeText(context, "No targets available for this item", Toast.LENGTH_SHORT).show()
        }
    }


    override fun getItemCount(): Int {
        return schemeList.size
    }


    fun showItem(dashboardList: List<Offer>?, clearList: Boolean) {
        if (clearList) {
            schemeList.clear()
        }
        if (dashboardList != null && dashboardList.isNotEmpty()) {
            dashboardList.get(clickedTPosition+1).target?.let { schemeList.addAll(it) }
        }
        notifyDataSetChanged()
    }

    fun showBillsItem(dashboardItem: List<Targets>?, clearList: Boolean) {
        if (clearList) {
            schemeList.clear()
        }
        if (dashboardItem != null) {
            schemeList.addAll(dashboardItem)
        }
        notifyDataSetChanged()
    }

    fun setClickedTarget(targets: List<Targets>?, position: Int) {
        clickedTargets = targets
        selectedPosition = position
        notifyDataSetChanged()
    }

    fun setOutSideClickedTarget(targets: List<Targets>?, position: Int) {
        clickedTargets = targets
        selectedPosition = position
        notifyDataSetChanged()
    }


}