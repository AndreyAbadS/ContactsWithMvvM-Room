package com.example.contacts.Data.Local
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.contacts.Data.Contacts

@Database(entities = [Contacts::class], version = 1)
abstract class AppDataBase : RoomDatabase(){
    abstract fun ContactsDao():ContactsDao

    companion object{
        @Volatile
        private var INSTANCE: AppDataBase? = null
        fun getDatabase(context: Context):AppDataBase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                "contacts_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}