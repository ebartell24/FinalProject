package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.Person.fromBundle
import com.example.finalproject.databinding.FragmentHomeBinding
import com.example.finalproject.databinding.FragmentRosterBinding

class RosterFragment : Fragment() {

    private var _binding: FragmentRosterBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRosterBinding.inflate(inflater, container, false)
        val rootView = binding.root
        return rootView
    }

}