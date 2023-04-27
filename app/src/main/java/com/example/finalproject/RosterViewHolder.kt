package com.example.finalproject

import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutRosterBinding

class RosterViewHolder(val binding: ListItemLayoutRosterBinding):
   RecyclerView.ViewHolder(binding.root){

       private lateinit var currentRosterSpot: Roster

       fun bindRoster(roster: Roster){
           currentRosterSpot = roster
           binding.playerName.text = currentRosterSpot.name
           binding.playerNumber.text = "# ${currentRosterSpot.number}"
           binding.playerPosition.text = currentRosterSpot.position
           binding.playerGradYear.text = currentRosterSpot.gradYear
       }
}