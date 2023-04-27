package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentHomeBinding
import com.example.finalproject.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val roster = listOf(Roster("Emily Bartell", 9, "defense", "2024"),
        Roster("Sadie Bonczek", 2, "defense", "2023"),
        Roster("Bella DeRiggi", 22, "forward", "2026"),
        Roster("Kaylyn Elliott", 18, "defense", "2024"),
        Roster("Amelia Gonzalez", 24, "midfield", "2025"),
        Roster("Grace Keris", 21, "defense", "2026"),
        Roster("Emma Newman", 33, "Goalie", "2024"),
        Roster("Caroline Pease", 1, "forward", "2023"),
        Roster("Olivia Piasecki", 5, "denfense", "2024"),
        Roster("Sofia Policare", 26, "midfield", "2025"),
        Roster("Marygrace Sabatini", 3, "midfield", "2024"),
        Roster("Caly Yankow", 14, "forward", "2024"),
        Roster("Maddie Zalewski", 6, "midfield", "2024"))

        val mAdaptor = rosterAdapter(roster)
        binding.recyclerView.adapter = mAdaptor



        return rootView
    }

}