package com.reliance.yeticarpet.activity.distributor.retailerdetails
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.distributor.retailerdetails.PartyListDetailsActivity.info.partyListId
import com.reliance.yeticarpet.activity.distributor.retailerdetails.di.DaggerPartyListDetailsComponent
import com.reliance.yeticarpet.activity.distributor.retailerdetails.di.PartyListDetailsModule
import com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsPresenter
import com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.PartyListActivityBinding
import com.reliance.yeticarpet.databinding.PartyListDetailsLayoutBinding
import javax.inject.Inject

class PartyListDetailsActivity : AppCompatActivity() {

    @Inject
    lateinit var partyListDetailsView: PartyListDetailsView

    @Inject
    lateinit var partyListDetailsPresenter: PartyListDetailsPresenter

    private lateinit var binding: PartyListDetailsLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerPartyListDetailsComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .partyListDetailsModule(PartyListDetailsModule(this))
            .build()
            .inject(this)
        binding= PartyListDetailsLayoutBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        partyListDetailsView.start(binding)
        partyListId?.let { partyListDetailsPresenter.onCreateView(it) }
    }

    companion object {
        fun start(context: Context,id:Int) {
            partyListId = id
            context.startActivity(Intent(context, PartyListDetailsActivity::class.java))
        }
    }

    object info{
        var partyListId: Int? = null
    }

}
