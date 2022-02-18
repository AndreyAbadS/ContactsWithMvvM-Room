package com.example.contacts.Data.Local

import androidx.room.*
import com.example.contacts.Data.Contacts

interface ContactsDao {
    @Query("SELECT * FROM contacts_table order by id asc")
    suspend fun getAllContacts(): List<Contacts>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun InsertContact(contacts: Contacts)

    @Update
    suspend fun UpdateContacts(contacts: Contacts)

    @Delete
    suspend fun deleteContacts(contacts: Contacts)
}