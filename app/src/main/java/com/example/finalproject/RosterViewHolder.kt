package com.example.finalproject

import android.view.View
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutRosterBinding

class RosterViewHolder(val binding: ListItemLayoutRosterBinding):
   RecyclerView.ViewHolder(binding.root){

       private lateinit var currentRosterSpot: Roster



       fun bindRoster(roster: Roster){
           currentRosterSpot = roster
           binding.one.text = currentRosterSpot.name
           binding.four.text = "# ${currentRosterSpot.number}"
           binding.two.text = currentRosterSpot.position
           binding.three.text = currentRosterSpot.gradYear
       }

    init{
        binding.root.setOnClickListener{
            val action = RosterFragmentDirections.actionRosterFragmentToAboutPlayers()
            binding.root.findNavController().navigate(action)

        }
    }
}