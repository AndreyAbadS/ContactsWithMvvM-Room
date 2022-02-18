package com.example.contacts.Data.Local

import com.example.contacts.Data.Contacts

class ContactsDataSource(private val contactsDao: ContactsDao) {
    suspend fun getContacts(): List<Contacts> {
        return contactsDao.getAllContacts()
    }
}