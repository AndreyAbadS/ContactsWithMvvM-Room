package com.example.contacts.Repository

import com.example.contacts.Data.Contacts
import com.example.contacts.Data.Local.ContactsDao

class ContactsRepository(private val contactsDao: ContactsDao) {
    suspend fun getContacts(): List<Contacts> {
        return contactsDao.getAllContacts()
    }

    suspend fun insert(contacts: Contacts){
        contactsDao.InsertContact(contacts)
    }

    suspend fun update(contacts: Contacts){
        contactsDao.UpdateContacts(contacts)
    }
    suspend fun delete(contacts: Contacts){
        contactsDao.deleteContacts(contacts)
    }
}