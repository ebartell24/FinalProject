package com.example.finalproject

import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutGamesBinding

class GamesViewHolder(val binding: ListItemLayoutGamesBinding):
    RecyclerView.ViewHolder(binding.root){
        private lateinit var currentGame:Games

        fun bindGames(games: Games){
            currentGame = games
            binding.one.text = currentGame.opponent
            binding.two.text = currentGame.time
            binding.three.text = currentGame.score
            binding.four.text = currentGame.winLose

        }
}