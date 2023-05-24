package com.example.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog.Calls.SUBJECT
import android.provider.Telephony.BaseMmsColumns.SUBJECT
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

        binding.map.setOnClickListener{
            showMap()
        }

        return rootView
    }
//implicent intents
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

    fun showMap() {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("geo:41.492974642267725, -75.72510594638094")
        }
        if (activity?.let { intent.resolveActivity(it.packageManager) } != null) {
            startActivity(intent)
        }
    }



}


