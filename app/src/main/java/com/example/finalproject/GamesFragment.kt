package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentGamesBinding
import com.example.finalproject.databinding.FragmentRosterBinding


class GamesFragment : Fragment() {
    private var _binding: FragmentGamesBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGamesBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val args = GamesFragmentArgs.fromBundle(requireArguments())
        binding.welcome2.text = "Welcome ${args.nameArg}"

        val games = listOf(Games("", "", "", ""), Games("", "", "", ""))

        val mAdaptor = gamesAdapter(games)
        binding.recyclerView.adapter = mAdaptor
        return rootView
    }

}