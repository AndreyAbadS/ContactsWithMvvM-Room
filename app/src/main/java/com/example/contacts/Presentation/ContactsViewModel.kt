package com.example.contacts.Presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.contacts.Data.Contacts
import com.example.contacts.Repository.ContactsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException

class ContactsViewModel(private val contactsRepository: ContactsRepository):ViewModel() {
    suspend fun getContacts(): List<Contacts> {
        return contactsRepository.getContacts()
    }

    fun insertContact(contacts: Contacts) = viewModelScope.launch(Dispatchers.IO) {
        contactsRepository.insert(contacts)
    }

    fun updateContacts(contacts: Contacts) = viewModelScope.launch(Dispatchers.IO) {
        contactsRepository.update(contacts)
    }

    fun deleteContacts(contacts: Contacts) = viewModelScope.launch(Dispatchers.IO) {
        contactsRepository.delete(contacts)
    }
}

class ContactsViewModelFactory(private val repo:ContactsRepository):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactsViewModel::class.java)){
            return ContactsViewModel(repo) as T
        }
        throw IllegalArgumentException("Failed Viewmodel")
    }

}
