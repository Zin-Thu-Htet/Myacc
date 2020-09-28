package com.example.myacc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myacc.adapter.acclistadapter
import com.example.myacc.model.acclist
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var accarraylist= ArrayList<acclist>()
        accarraylist.add(acclist("My Wishlist",R.drawable.ic_wishlist))
        accarraylist.add(acclist("My Followed Sellers",R.drawable.ic_wallet))
        accarraylist.add(acclist("My Purchased Item", R.drawable.ic_purchase))
        accarraylist.add(acclist("My Coupons", R.drawable.ic_discount))
        accarraylist.add(acclist("My Card Wallet",R.drawable.ic_wallet))
        accarraylist.add(acclist("Exp Points", R.drawable.ic_discount))
        accarraylist.add(acclist("My Given Feedbacks",R.drawable.ic_wishlist))
        accarraylist.add(acclist("Searched History",R.drawable.ic_clock))
        accarraylist.add(acclist("Events & Calender", R.drawable.ic_wishlist))

        var Acclistadapter = acclistadapter(accarraylist)
        accrecycler.layoutManager = GridLayoutManager(this,3)
        accrecycler.adapter = Acclistadapter
    }
}
