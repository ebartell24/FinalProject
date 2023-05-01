package com.example.finalproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutGamesBinding
import com.example.finalproject.databinding.ListItemLayoutRosterBinding

data class Games(val opponent: String, val time: String, val score: String, val winLose: String) {
}

class gamesAdapter(val gameList: List<Games>): RecyclerView.Adapter<GamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesViewHolder {
        val binding =
            ListItemLayoutGamesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GamesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GamesViewHolder, position: Int) {
        val currentGame = gameList[position]
        holder.bindGames(currentGame)
    }

    override fun getItemCount(): Int {
        return gameList.size
    }
}