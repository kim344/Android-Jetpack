package com.kim344.jetpackseries.room

import androidx.room.ColumnInfo
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

/*
@Entity(tableName = "InformTable")
data class Inform(
    @ColumnInfo(name = "inform_name")
    var name: String,

    @ColumnInfo(name = "inform_gender")
    var gender: String,

    @ColumnInfo(name = "inform_number")
    var phoneNumber: String
){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "inform_id")
    var id = 0
}
 */

