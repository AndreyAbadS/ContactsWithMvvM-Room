package com.example.contacts.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts_table")
data class Contacts(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val firstName:String ="",
    val lastNAme:String="",
    val number:Int= -1,

)