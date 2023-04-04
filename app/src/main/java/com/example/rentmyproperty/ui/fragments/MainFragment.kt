package com.example.rentmyproperty.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rentmyproperty.R

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val btnTenants = view.findViewById<Button>(R.id.btnTenants)
        btnTenants.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_tenantsFragment)
        }

        val btnLandlords = view.findViewById<Button>(R.id.btnLandlords)
        btnLandlords.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_OwnersFragment)
        }

        return view
    }
}
