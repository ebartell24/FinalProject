package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentRosterBinding


class CoachingFragment : Fragment() {
    private var _binding: FragmentRosterBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRosterBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val args = CoachingFragmentArgs.fromBundle(requireArguments())
        binding.Welcome.text = "Welcome ${args.nameArg}"
        return rootView
    }
}