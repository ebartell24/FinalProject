package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentAboutGamesBinding
import com.example.finalproject.databinding.FragmentAboutPlayersBinding

class AboutGamesFragment : Fragment() {
    private var _binding: FragmentAboutGamesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutGamesBinding.inflate(inflater, container, false)
        val rootView = binding.root
        return rootView
    }
}