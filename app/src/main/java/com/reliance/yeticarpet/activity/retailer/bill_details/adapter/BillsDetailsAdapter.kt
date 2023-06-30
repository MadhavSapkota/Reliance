package com.reliance.yeticarpet.activity.retailer.bill_details.adapter
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData
import com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDatum
import com.reliance.yeticarpet.apputlis.AppUtils.formatDecimalValue
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumberWithCommasAndDecimals
import com.reliance.yeticarpet.databinding.BillDetailsDataBinding
import io.reactivex.subjects.PublishSubject
import java.util.*
import kotlin.collections.ArrayList

class BillsDetailsAdapter(private val context: Context) : RecyclerView.Adapter<BillsDetailsHolder>()
{
    private var billsList = ArrayList<BillDatum>()
    var clickSubject = PublishSubject.create<ResultData>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BillsDetailsHolder {
        val inflater = LayoutInflater.from(context)
        val binding = BillDetailsDataBinding.inflate(inflater, parent, false)
        val viewHolder = BillsDetailsHolder(binding)
        return viewHolder
    }


    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: BillsDetailsHolder, position: Int) {
        val result = billsList[position]
       var name = result.brand.toString()

       holder.tvCalio.text = result.brand?.name.toString()
       holder.tvItemName.text = result.brand?.name.toString()
        val formattedResult = result?.totalPrice?.let { formatDecimalValue(it.toDouble()) }
        holder.tvCalioPrice.text = formatNumberWithCommasAndDecimals(formattedResult.toString())
    }

    override fun getItemCount(): Int {
        return billsList.size
    }


    //to display the bookingdata
    fun showBillsItem(dashboardlist: java.util.ArrayList<BillDatum>?, aboolean: Boolean) {
        when {aboolean -> billsList.clear() }
        if ((dashboardlist != null) && !dashboardlist.isEmpty())
            this.billsList.addAll(dashboardlist)
        notifyDataSetChanged()
    }
}