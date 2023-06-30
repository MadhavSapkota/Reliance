package com.reliance.yeticarpet.activity.distributor.retailerlist.adapter
import android.content.Context
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.activity.distributor.retailerdetails.PartyListDetailsActivity
import com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData
import com.reliance.yeticarpet.apputlis.AppConstant
import com.reliance.yeticarpet.apputlis.AppUtils
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumberWithCommasAndDecimals
import com.reliance.yeticarpet.databinding.DataDistributorListBinding
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.RetailerPurchase
import io.reactivex.subjects.PublishSubject

class PartyListAdapter(private val context: Context) : RecyclerView.Adapter<PartyListHolder>(),
    Filterable {
    private var retailerPurchase = ArrayList<RetailerData>()
    var clickSubject = PublishSubject.create<RetailerData>()
    private var filteredList = retailerPurchase


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PartyListHolder {
        val inflater = LayoutInflater.from(context)
        val binding = DataDistributorListBinding.inflate(inflater, parent, false)
        val viewHolder = PartyListHolder(binding)
        CardViewListner(viewHolder, parent)
        return viewHolder
    }

    private fun CardViewListner(
        viewHolder: PartyListHolder,
        parent: ViewGroup
    ) {
        RxView.clicks(viewHolder.rlCard as View)
            .takeUntil(RxView.detaches(parent))
            .map { retailerPurchase[viewHolder.adapterPosition] }
            .doOnEach {
                notifyDataSetChanged()
            }
            .subscribe(clickSubject)
    }





    override fun onBindViewHolder(holder: PartyListHolder, position: Int) {
        val result = retailerPurchase[position]
        holder.tvDistributorRs.text = "Rs"
        if (result.retailerName != null && result.retailerName!!.length > 20) {
            holder.tvDistributorName.text = "${result.retailerName!!.substring(0, 20)}..."
        } else {
            holder.tvDistributorName.text = result.retailerName
        }

        val formattedResult = result.total?.toDouble()?.let { AppUtils.formatDecimalValue(it) }
        holder.tvDistributorDigit.text = formatNumberWithCommasAndDecimals(formattedResult.toString())
        holder.rlCard.setOnClickListener {
            result.retailerId?.let { it1 -> PartyListDetailsActivity.start(context, it1) }
        }
    }


    override fun getItemCount(): Int {
        return retailerPurchase.size
    }

    fun showRetailerListItem(dashboardMap: Map<String, RetailerData>?, aboolean: Boolean) {
        when (aboolean) { }
        if (dashboardMap != null && dashboardMap.isNotEmpty()) {
            this.retailerPurchase.addAll(dashboardMap.values)
        }
        notifyDataSetChanged()
    }



    override fun getFilter(): Filter {
        AppConstant.searchCount = true
        AppConstant.normalCount = false
        val filter: Filter = object : Filter() {
            var filterResults = FilterResults()
            override fun performFiltering(charSequence: CharSequence?): FilterResults {
                if (charSequence == null || charSequence?.length == 0) {
                    filterResults.count = filteredList?.size!!
                    filterResults.values = filteredList
                } else {
                    val searchChr = charSequence.toString()
                    val resultData: MutableList<RetailerData> = java.util.ArrayList<RetailerData>()

                    for (bookingData in filteredList!!) {
                        if (bookingData.retailerName!!.contains(searchChr) || bookingData.retailerName!!.lowercase().contains(searchChr)) {
                            resultData.add(bookingData)
                        }
                        else{
                            val toast = Toast.makeText(context, "No results found", Toast.LENGTH_SHORT)
                            toast.show()
                            val handler = Handler()
                            handler.postDelayed(Runnable { toast.cancel() }, 1000)
                        }
                    }
                    filterResults.count = resultData.size
                    filterResults.values = resultData

                    AppConstant.searchListCount = resultData.size
                    AppConstant.retailerListSize = AppConstant.searchListCount
                    filteredList
                }
                return filterResults
            }

            override fun publishResults(constraint: CharSequence, results: FilterResults) {
                retailerPurchase = results.values as ArrayList<RetailerData>
                notifyDataSetChanged()
                if (retailerPurchase.isEmpty()) {
                    AppConstant.searchCount = true
                    // Update any related UI or perform actions when the search list is empty
                }


            }
        }
        return filter
    }


}





