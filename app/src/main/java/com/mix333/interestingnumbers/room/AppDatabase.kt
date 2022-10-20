package com.mix333.interestingnumbers.room

import android.app.Application

class AppDatabase() : Application() {
    private val database = NumbersDatabase.getDatabase(this)
    fun getDatabase() = database
}