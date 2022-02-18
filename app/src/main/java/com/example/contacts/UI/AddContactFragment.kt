package com.example.contacts.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.contacts.R
import com.example.contacts.databinding.FragmentAddContactBinding


class AddContactFragment : Fragment(R.layout.fragment_add_contact) {
    private lateinit var binding: FragmentAddContactBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddContactBinding.bind(view)
    }
}