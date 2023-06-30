package com.reliance.yeticarpet.fragment.retailer.dashboard.adapter
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.apputlis.AppConstant.totalPurchase
import com.reliance.yeticarpet.apputlis.AppUtils.convertToTitleCase
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumber
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumberWithCommasAndDecimals
import com.reliance.yeticarpet.apputlis.RetailerInfo.retailerListSize
import com.reliance.yeticarpet.databinding.RetailerDashboardDataBinding
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail
import io.reactivex.subjects.PublishSubject


class RetailerDashboardAdapter(
    private val appCompatActivity: AppCompatActivity) : RecyclerView.Adapter<RetailerDashboardHolder>() {
    private var schemeList = ArrayList<SchemeDetail>()

    var clickSubject = PublishSubject.create<SchemeDetail>()
    private var viewPool = RecyclerView.RecycledViewPool()
   lateinit var  pointList: ArrayList<Int>


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetailerDashboardHolder {
        val inflater = LayoutInflater.from(appCompatActivity)
        val binding = RetailerDashboardDataBinding.inflate(inflater, parent, false)
        val viewHolder = RetailerDashboardHolder(binding)
        CardViewListner(viewHolder, parent)
        return viewHolder
    }

    private fun CardViewListner(
        viewHolder: RetailerDashboardHolder,
        parent: ViewGroup
    ) {
        RxView.clicks(viewHolder.clickDown as View)
            .takeUntil(RxView.detaches(parent))
            .map { schemeList[viewHolder.adapterPosition] }
            .doOnEach {
                notifyDataSetChanged()
            }
            .subscribe(clickSubject)
    }

    @SuppressLint("ResourceAsColor", "SetTextI18n", "SuspiciousIndentation")
    override fun onBindViewHolder(holder: RetailerDashboardHolder, position: Int) {
        val result = schemeList[position]
        retailerListSize = schemeList.size.toString()
        var newValue = result.retailerScheme?.get(0)?.offer

        holder.tvPercentage.text = newValue?.let { formatNumber(it.toDouble()) } + "%"
        holder.tvAnnualScheme.text = result.retailerScheme.toString()
        holder.tvAnnualScheme.text = result.title?.let { convertToTitleCase(it) }


        holder.tvSchemeAmount.text = result.retailerScheme?.get(0)?.schemeAmount.let { it?.let { it1 -> formatNumber(it1.toDouble()) } }
            ?.let { formatNumberWithCommasAndDecimals(it) }

        when {
           result.title.equals("Category Scheme")->{
               holder.viewLine.visibility = View.GONE
           }

           else -> {

           }
       }


        when {
            result.offers?.get(position)?.target!!.isEmpty() || result.title.equals("ANNUAl SCHEME") -> {
                holder!!.rvGraphs.visibility = View.GONE
                holder.monthlyTargetTracker.visibility = View.GONE
            }
            else -> {
                when {
                    result.offers?.get(position)?.target!!.isNotEmpty() -> {
                        holder!!.rvGraphs.visibility = View.VISIBLE
                        holder.monthlyTargetTracker.visibility = View.VISIBLE
                    }
                }
            }

        }



        holder.tvTotalPurchasePrice.text = formatNumberWithCommasAndDecimals(totalPurchase.let { formatNumber(it.toDouble()) })


        when {
            holder.clickDown.isChecked -> {
                holder.rlPurchase.visibility = View.VISIBLE
            }
            else -> {
                holder.rlPurchase.visibility = View.GONE
            }
        }

        try {
            holder.rvGraphs.apply {
                layoutManager =
                    LinearLayoutManager(
                        holder.rvGraphs.context,
                        LinearLayoutManager.HORIZONTAL,
                        false
                    )
                adapter = HorizontalBarChartAdapter(pointList, 0, appCompatActivity)
                setRecycledViewPool(viewPool)
            }
        }
        catch (ex:Exception){

        }
    }

    override fun getItemCount(): Int {
        return schemeList.size
    }


    //to display the bookingdata
    fun showBillsItem(dashboardlist: java.util.ArrayList<SchemeDetail>?, aboolean: Boolean) {
        when {
            aboolean -> schemeList.clear()
        }
        if ((dashboardlist != null) && !dashboardlist.isEmpty())
            this.schemeList.addAll(dashboardlist)
        notifyDataSetChanged()
    }
}
