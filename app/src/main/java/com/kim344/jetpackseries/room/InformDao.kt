package com.kim344.jetpackseries.room

import androidx.room.*

@Dao
interface InformDao {

    @Insert
    fun insert(inform: Inform)

    @Update
    fun update(inform: Inform)

    @Delete
    fun delete(inform: Inform)

    @Query("SELECT * FROM informEntity")
    fun selectAll(): List<Inform>

}