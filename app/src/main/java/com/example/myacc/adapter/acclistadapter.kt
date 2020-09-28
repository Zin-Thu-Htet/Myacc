package com.example.myacc.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myacc.R
import com.example.myacc.model.acclist
import kotlinx.android.synthetic.main.acc_profile.view.*
import kotlinx.android.synthetic.main.activity_main.view.*

class acclistadapter (var accarraylist: ArrayList<acclist>): RecyclerView.Adapter<acclistadapter.acclistViewHolder>() {

    class acclistViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){
        fun bind(Acclist: acclist){
            itemView.txtname.text = Acclist.name
            itemView.imgphoto.setImageResource(Acclist.img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): acclistViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.acc_profile,parent,false)
        return acclistViewHolder(view)
    }

    override fun getItemCount(): Int =  accarraylist.size

    override fun onBindViewHolder(holder: acclistViewHolder, position: Int) {
        holder.bind(accarraylist[position])
    }
}