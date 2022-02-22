package com.kim344.jetpackseries.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Inform(
    var name: String,
    var gender: String,
    var phoneNumber: String
){
    @PrimaryKey(autoGenerate = true)
    var id = 0
}
