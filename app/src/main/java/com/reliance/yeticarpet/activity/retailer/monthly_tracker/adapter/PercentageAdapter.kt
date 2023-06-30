package com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter
import com.reliance.yeticarpet.R
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.apputlis.AppConstant.clickedTPosition
import com.reliance.yeticarpet.apputlis.AppConstant.monthlyItemsClickStatus
import com.reliance.yeticarpet.apputlis.AppConstant.target
import com.reliance.yeticarpet.apputlis.AppUtils
import com.reliance.yeticarpet.databinding.HorizontalTrackerDataBinding
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Offer
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Targets


class PercentageAdapter(
    private val context: Context
) : RecyclerView.Adapter<PercentageHolder>() {

    private var offerList  = ArrayList<Offer>()
    private var targetList: List<Targets> = emptyList()
    private var onPercentageClickListener: OnPercentageClickListener? = null
    private var clickedPosition = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PercentageHolder {
        val inflater = LayoutInflater.from(context)
        val binding = HorizontalTrackerDataBinding.inflate(inflater, parent, false)
        return PercentageHolder(binding)
    }


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: PercentageHolder, @SuppressLint("RecyclerView") position: Int) {
        val result = target[position]
        val formattedResult = result.toDouble().let { AppUtils.formatDecimalValue(it) }
        holder.tvMatTextView.text = formattedResult + " %"


        holder.rlButton.setOnClickListener {
            monthlyItemsClickStatus = true
            clickedTPosition = position
            setBackground(context, holder,  position)
            onPercentageClickListener?.onPercentageClick(position)
            notifyDataSetChanged()
        }
        setBackground(context, holder, position)
    }


    fun setBackground(context: Context?, holder: PercentageHolder, position: Int) {
        if (position==clickedTPosition) {
            holder.rlButton.background = ContextCompat.getDrawable(context!!, R.drawable.bills_all_background)

        } else {
           holder. rlButton.background = ContextCompat.getDrawable(context!!, R.drawable.monthly_tracker_no_background)
        }
    }


    override fun getItemCount(): Int {
        return target.size
    }

    fun showBillsItem(dashboardList: List<Offer>?, clearList: Boolean) {
        if (clearList) {
            offerList.clear()
        }
        if (dashboardList != null && dashboardList.isNotEmpty()) {
            offerList.addAll(dashboardList)
        }
        notifyDataSetChanged()
    }

    fun setOnPercentageClickListener(listener: OnPercentageClickListener) {
        onPercentageClickListener = listener
    }
    fun setTargetList(targets: List<Targets>) {
        targetList = targets
    }

    interface OnPercentageClickListener {
        fun onPercentageClick(position: Int)
    }
}



