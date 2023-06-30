package com.reliance.yeticarpet.activity.distributor.retailerlist
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.distributor.retailerlist.di.DaggerPartyListComponent
import com.reliance.yeticarpet.activity.distributor.retailerlist.di.PartyListModule
import com.reliance.yeticarpet.activity.distributor.retailerlist.mvp.PartyListView
import com.reliance.yeticarpet.activity.distributor.retailerlist.mvp.PartyListPresenter
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.PartyListActivityBinding
import javax.inject.Inject

class PartyListActivity : AppCompatActivity() {

    @Inject
    lateinit var distributorListView: PartyListView

    @Inject
    lateinit var distributorListPresenter: PartyListPresenter

    private lateinit var binding: PartyListActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerPartyListComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .partyListModule(PartyListModule(this))
            .build()
            .inject(this)
        binding= PartyListActivityBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        distributorListView.start(binding)
        distributorListPresenter.onCreateView()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, PartyListActivity::class.java))
        }
    }
}
