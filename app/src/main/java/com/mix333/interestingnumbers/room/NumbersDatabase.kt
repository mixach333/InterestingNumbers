package com.mix333.interestingnumbers.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Number::class], version = 1, exportSchema = false)
abstract class NumbersDatabase : RoomDatabase() {
    abstract fun dao(): NumbersDao


    companion object {
        @Volatile
        private var INSTANCE: NumbersDatabase? = null

        fun getDatabase(context: Context): NumbersDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                context,
                NumbersDatabase::class.java,
                "numbers_table").build()
                INSTANCE = instance
                instance
            }
        }
    }
}