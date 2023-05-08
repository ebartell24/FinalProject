package com.example.finalproject

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.finalproject.databinding.FragmentGamesBinding
import com.example.finalproject.databinding.FragmentRosterBinding


class GamesFragment : Fragment() {
    private var _binding: FragmentGamesBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGamesBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val args = GamesFragmentArgs.fromBundle(requireArguments())
        binding.welcome2.text = "Welcome ${args.nameArg}"

        val games = listOf(
            Games("Abington vs Delaware Valley", "08/26/22 at 4:15PM", "4-0", "WIN!"),
            Games("Abington vs Berwick", "09/06/22 at 4:15PM", "9-0", "WIN!"),
            Games("Abington vs Honesdale", "09/09/22 at 4:15PM", "0-1", "LOSS :("),
            Games("Abington vs Pittston Area", "09/15/22 at 4:15PM", "2-1", "WIN!"),
            Games("Abington vs Wallenpaupack", "09/22/22 at 4:15PM", "3-0", "WIN!"),
            Games ("Abington vs Lackawanna Trail", "09/23/22 at 4:15PM", "1-4", "LOSS :("),
            Games ("Abington vs Nanticoke", "09/27/22 at 5:15PM", "6-0", "WIN!"),
            Games ("Abington vs Holy Redeemer", "10/06/22 at 4:15PM", "3-0", "WIN!"),
            Games ("Abington vs Tunkhannock", "10/14/22 at 4:00PM", "4-0", "WIN!"),
            Games ("Abington vs Selinsgrove", "10/27/22 at 7:00PM", "1-2", "LOSS :(")
        )

        val mAdaptor = gamesAdapter(games)
        binding.recyclerView2.adapter = mAdaptor
        return rootView
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        return NavigationUI.onNavDestinationSelected(item,requireView().findNavController()) || super.onOptionsItemSelected(item)
    }

}