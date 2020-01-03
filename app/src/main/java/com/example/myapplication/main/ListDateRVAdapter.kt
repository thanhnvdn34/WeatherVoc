package com.example.myapplication.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.models.Sample

class ListDateRVAdapter(private val listPlayer : MutableList<Sample>) : RecyclerView.Adapter<ListDateRVAdapter.ListDateViewHolder>(){

    class ListDateViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        var dateTextView = view.findViewById<TextView>(R.id.date)
        var tempTextView = view.findViewById<TextView>(R.id.temp)
        var huminityTextView = view.findViewById<TextView>(R.id.huminity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListDateViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_player,parent,false)
        return ListDateViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPlayer.size
    }

    override fun onBindViewHolder(holder: ListDateViewHolder, position: Int) {
        holder.dateTextView.text = listPlayer[position].date
        holder.tempTextView.text = (listPlayer[position].temperature.toString() + "°C")
        holder.huminityTextView.text = (listPlayer[position].humidity.toString()+"%")
    }
}