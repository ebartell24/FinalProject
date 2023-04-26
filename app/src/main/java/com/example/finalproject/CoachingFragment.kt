package com.example.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentCoachingBinding
import com.example.finalproject.databinding.FragmentRosterBinding


class CoachingFragment : Fragment() {
    private var _binding: FragmentCoachingBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCoachingBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val args = CoachingFragmentArgs.fromBundle(requireArguments())
        binding.welcome.text = "Welcome ${args.nameArg}"

        binding.link.setOnClickListener{
            openWebPage(R.string.website.toString())
        }

        binding.call.setOnClickListener{
            dialPhoneNumber(R.string.phoneNumber.toString())
        }

        return rootView
    }

    fun openWebPage(url:String){
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if (activity?.let { intent.resolveActivity(it.packageManager) } != null) {
            startActivity(intent)
        }
    }

    fun dialPhoneNumber(phoneNumber: String){
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        }
        if (activity?.let { intent.resolveActivity(it.packageManager) } != null) {
            startActivity(intent)
        }
    }

}


