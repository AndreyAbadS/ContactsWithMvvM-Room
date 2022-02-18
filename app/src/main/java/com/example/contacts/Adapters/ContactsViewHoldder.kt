package com.example.contacts.Adapters

import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.databinding.ContactItemBinding
import com.example.contacts.databinding.FragmentContactsBinding

class ContactsViewHoldder(view:View):RecyclerView.ViewHolder(view) {
    private val binding = ContactItemBinding.bind(view)
      fun bind(){

    }
}