package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.core.app.Person.fromBundle
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.example.finalproject.databinding.FragmentHomeBinding
import com.example.finalproject.databinding.FragmentRosterBinding

class RosterFragment : Fragment() {

    private var _binding: FragmentRosterBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRosterBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val args = RosterFragmentArgs.fromBundle(requireArguments())
        binding.welcome3.text = "Welcome ${args.nameArg}"

        val roster = listOf(Roster("Emily Bartell", 9, "Defense", "Class Of 2024"),
            Roster("Sadie Bonczek", 2, "Defense", "Class Of 2023"),
            Roster("Bella DeRiggi", 22, "Forward", "Class Of 2026"),
            Roster("Kaylyn Elliott", 18, "Defense", "Class Of 2024"),
            Roster("Amelia Gonzalez", 24, "Midfield", "Class Of 2025"),
            Roster("Grace Keris", 21, "Defense", "Class Of 2026"),
            Roster("Emma Newman", 33, "Goalie", "Class Of 2024"),
            Roster("Caroline Pease", 1, "Forward", "Class Of 2023"),
            Roster("Olivia Piasecki", 5, "Defense", "Class Of 2024"),
            Roster("Sofia Policare", 26, "Midfield", "Class Of 2025"),
            Roster("Marygrace Sabatini", 3, "Midfield", "Class Of 2024"),
            Roster("Caly Yankow", 14, "Forward", "Class Of 2024"),
            Roster("Maddie Zalewski", 6, "Midfield", "Class Of 2024"))

        val mAdaptor = rosterAdapter(roster)
        binding.recyclerView.adapter = mAdaptor
        return rootView
    }

}