package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentAboutPlayersBinding
import com.example.finalproject.databinding.FragmentHomeBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class AboutPlayersFragment : Fragment() {
    private var _binding: FragmentAboutPlayersBinding? = null
    private val binding get() = _binding!!
    private val viewModel: FinalViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutPlayersBinding.inflate(inflater, container, false)
        val rootView = binding.root

//Alert Dialog Code
        viewModel.clickedAbout.observe(viewLifecycleOwner) { clickedAbout: Boolean->
            if (clickedAbout) {
                MaterialAlertDialogBuilder(requireContext()).setTitle(R.string.returnHome)
                    .setPositiveButton("yes") { _, _:Int->
                        val action = AboutPlayersFragmentDirections.actionAboutPlayersFragmentToHomeFragment()
                        binding.root.findNavController().navigateUp()
                    }.setNegativeButton("no") { _, _:Int ->
                    }.show()
            }
        }
        return rootView
    }
}