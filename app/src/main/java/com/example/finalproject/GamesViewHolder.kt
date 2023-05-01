package com.example.finalproject

import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutGamesBinding

class GamesViewHolder(val binding: ListItemLayoutGamesBinding):
    RecyclerView.ViewHolder(binding.root){
        private lateinit var currentGame:Games

        fun bindGames(games: Games){
            currentGame = games
            binding.opponent.text = currentGame.opponent
            binding.time.text = currentGame.time
            binding.score.text = currentGame.score
            binding.winLose.text = currentGame.winLose

        }
}