package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentHomeBinding
import com.google.android.material.snackbar.Snackbar

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
            Snackbar.make(binding.coaching, R.string.coachSnackBar, Snackbar.LENGTH_SHORT).show()
            rootView.findNavController().navigate(action)
        }
        binding.roster.setOnClickListener(){
            val guest = binding.enterName.text.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToRosterFragment(guest)
            Toast.makeText(activity, R.string.rosterToast, Toast.LENGTH_SHORT).show()
            rootView.findNavController().navigate(action)
        }
        binding.games.setOnClickListener(){
            val guest = binding.enterName.text.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToGamesFragment(guest)
            Toast.makeText(activity, R.string.gamesToast, Toast.LENGTH_SHORT).show()
            rootView.findNavController().navigate(action)
        }

        return rootView
    }
}