package com.example.finalproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutRosterBinding

data class Roster(val name: String, val number: Int, val position: String, val gradYear: String) {
}

class rosterAdapter(val rosterList: List<Roster>): RecyclerView.Adapter<RosterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RosterViewHolder {
        val binding = ListItemLayoutRosterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RosterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RosterViewHolder, position: Int) {
        val currentRosterSpot = rosterList[position]
        holder.bindRoster(currentRosterSpot)
    }

    override fun getItemCount(): Int {
        return rosterList.size
    }
}