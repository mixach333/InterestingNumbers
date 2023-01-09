package com.mix333.interestingnumbers.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "numbers_table")
data class Number(
    @PrimaryKey(autoGenerate = false)
    val number: Int,
    @ColumnInfo(name = "details")
    val details: String,
    @ColumnInfo(name = "createdTime")
    val createdTime : Long = Calendar.getInstance().timeInMillis
)