package com.example.finalproject

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentAboutPlayersBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class AboutPlayersFragment : Fragment() {
    private var _binding: FragmentAboutPlayersBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutPlayersBinding.inflate(inflater, container, false)
        val rootView = binding.root

        //alert dialog
        binding.backButton.setOnClickListener() {
            MaterialAlertDialogBuilder(requireContext()).setTitle(R.string.returnHome)
                .setPositiveButton("yes") { _, _ ->
                    binding.root.findNavController().navigateUp()
                    binding.root.findNavController().navigateUp()

                }.setNegativeButton("no") { _, _ ->
                    binding.root.findNavController().navigateUp()
                }.show()

        }

//        setFragmentResultListener("REQUESTING_REPLY_KEY") { requestKey: String, bundle: Bundle ->
//            val replyText = bundle.getString("REPLY_KEY")
//            binding.welcomeName.text = replyText
//        }

        return rootView
    }
}