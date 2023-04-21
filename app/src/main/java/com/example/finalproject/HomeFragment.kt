package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.coaching.setOnClickListener(){
            val guest = binding.enterName.text.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCoachingFragment(guest)
            rootView.findNavController().navigate(action)
        }
        binding.roster.setOnClickListener(){
            val action = HomeFragmentDirections.actionHomeFragmentToRosterFragment()
            rootView.findNavController().navigate(action)
        }
        binding.games.setOnClickListener(){
            val action = HomeFragmentDirections.actionHomeFragmentToGamesFragment()
            rootView.findNavController().navigate(action)
        }

        return rootView
    }
}