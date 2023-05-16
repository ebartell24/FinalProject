package com.example.finalproject

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.finalproject.databinding.FragmentHomeBinding
import com.example.finalproject.databinding.FragmentMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val rootView = binding.root


        return rootView
    }


}