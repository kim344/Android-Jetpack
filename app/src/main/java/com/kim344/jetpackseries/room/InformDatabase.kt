package com.kim344.jetpackseries.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Inform::class], version = 1)
abstract class InformDatabase: RoomDatabase() {
    abstract fun informDao(): InformDao
}