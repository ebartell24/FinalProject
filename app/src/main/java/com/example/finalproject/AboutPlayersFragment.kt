package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentAboutPlayersBinding
import com.example.finalproject.databinding.FragmentHomeBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class AboutPlayers : Fragment() {
    private var _binding: FragmentAboutPlayersBinding? = null
    private val binding get() = _binding!!
    // private val viewModel:ViewModel by activityViewModels()  VIEWMODEL CODE

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutPlayersBinding.inflate(inflater, container, false)
        val rootView = binding.root
//ALERT DIALOG CODE
//        viewModel.clickedAbout.observe(viewLifecycleOwner) { clickedAbout: Boolean->
//            if (clickedAbout) {
//                MaterialAlertDialogBuilder(requireContext()).setTitle(R.string.Congrats)
//                    .setMessage(R.string.win)
//                    .setPositiveButton("yes") { dialog, which->
//                        viewModel.reset()
//
//                    }.setNegativeButton("no") { dialog, which ->
//                        val action = AboutPlayersFragmentDirections.actionAboutPlayersFragmentToHomeFragment()
//                        binding.root.findNavController().navigate(action)
//                    }.show()
//
//            }
//        }

        return rootView
    }

}