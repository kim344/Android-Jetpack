package com.kim344.jetpackseries.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Inform::class], version = 1)
abstract class InformDatabase: RoomDatabase() {
    abstract fun informDao(): InformDao

    companion object {
        private var instance: InformDatabase? = null

        @Synchronized
        fun getInstance(context: Context): InformDatabase? {
            if (instance == null) {
                synchronized(InformDatabase::class){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        InformDatabase::class.java,
                        "inform-db"
                    ).allowMainThreadQueries().build()
                }
            }
            return instance
        }
    }

}