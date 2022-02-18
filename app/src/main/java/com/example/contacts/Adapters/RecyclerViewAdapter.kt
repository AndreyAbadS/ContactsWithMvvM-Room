package com.example.contacts.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.Data.Contacts
import com.example.contacts.databinding.ContactItemBinding

class RecyclerViewAdapter():RecyclerView.Adapter<ContactsViewHoldder>() {
    private var contacList = emptyList<Contacts>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHoldder {
        val binding = ContactItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHoldder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHoldder, position: Int) {
        val currentItem:Contacts = contacList[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int = contacList.size

    fun setAllContacts(contacts: List<Contacts>){
        this.contacList = contacts
        notifyDataSetChanged()
    }


}