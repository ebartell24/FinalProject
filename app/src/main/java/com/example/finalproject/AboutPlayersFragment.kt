package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.setFragmentResult
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentAboutPlayersBinding
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


        binding.backButton.setOnClickListener() {
            MaterialAlertDialogBuilder(requireContext()).setTitle(R.string.returnHome)
                .setPositiveButton("yes") { _, _ ->
                    binding.root.findNavController().navigateUp()
                    binding.root.findNavController().navigateUp()
                }.setNegativeButton("no") { _, _ ->
                    binding.root.findNavController().navigateUp()
                }.show()
        }
//sending information back
        binding.backButton.setOnClickListener {
            val reply = binding.backButton.text.toString()
            setFragmentResult("requestKey", bundleOf("bundleKey" to reply))
            rootView.findNavController().navigateUp()
        }

        return rootView
    }
}