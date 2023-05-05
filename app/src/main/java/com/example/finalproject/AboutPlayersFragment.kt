package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentAboutPlayersBinding
import com.example.finalproject.databinding.FragmentHomeBinding

class AboutPlayers : Fragment() {
    private var _binding: FragmentAboutPlayersBinding? = null
    private val binding get() = _binding!!
    // private val viewModel:ViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutPlayersBinding.inflate(inflater, container, false)
        val rootView = binding.root
        return rootView
    }

}