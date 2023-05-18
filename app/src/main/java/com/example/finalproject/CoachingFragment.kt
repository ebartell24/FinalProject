package com.example.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import com.example.finalproject.databinding.FragmentCoachingBinding


class CoachingFragment : Fragment() {
    private var _binding: FragmentCoachingBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCoachingBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val args = CoachingFragmentArgs.fromBundle(requireArguments())
        binding.welcome.text = "Welcome ${args.nameArg}"

        binding.link.setOnClickListener{
            openWebPage()
        }

        binding.call.setOnClickListener{
            dialPhoneNumber()
        }

        binding.email.setOnClickListener{
            composeEmail()
        }

        return rootView
    }

    fun openWebPage(){
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://ahsdathletics.org/main/teamschedule/id/3807358/seasonid/4751470"))
        startActivity(browserIntent)

    }

    fun dialPhoneNumber(){
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:5705855330")
        }
        if (activity?.let { intent.resolveActivity(it.packageManager) } != null) {
            startActivity(intent)
        }
    }

    fun composeEmail() {
        val emailIntent = Intent(
            Intent.ACTION_SENDTO, Uri.fromParts("mailto", "Carrg@ahsd.org", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "AHFH Field Hockey");

        if (activity?.let { emailIntent.resolveActivity(it.packageManager) } != null) {
            startActivity(emailIntent)
        }
    }



}


