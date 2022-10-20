package com.mix333.interestingnumbers.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NumbersDao {

    @Insert
    suspend fun insert(number: Number)

    @Delete
    suspend fun delete(number: Number)

    @Query("SELECT * FROM numbers_table WHERE number=:number")
    fun getNumber(number: Int)

    @Query("SELECT * FROM numbers_table ORDER BY createdTime DESC")
    fun getAllNumbers()


}