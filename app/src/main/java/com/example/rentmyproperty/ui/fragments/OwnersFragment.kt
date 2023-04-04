package com.example.rentmyproperty.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rentmyproperty.R

class OwnersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_owners, container, false)

        // TODO: Add logic for OwnersFragment
        val toolbar: Toolbar = view.findViewById(R.id.custom_toolbar)
        val backButton: ImageButton = view.findViewById(R.id.back_button)

        backButton.setOnClickListener {
            findNavController().navigateUp()
        }

        return view
    }
}