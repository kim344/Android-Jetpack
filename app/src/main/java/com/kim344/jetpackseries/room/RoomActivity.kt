package com.kim344.jetpackseries.room

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kim344.jetpackseries.databinding.ActivityRoomBinding

class RoomActivity : AppCompatActivity() {

    lateinit var binding: ActivityRoomBinding

    private var db: InformDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = InformDatabase.getInstance(this)
        selectInformData()

        binding.btnInsert.setOnClickListener {
            insertInformData()
            selectInformData()
        }

        binding.btnDelete.setOnClickListener {
            deleteAllInformData()
            selectInformData()
        }
    }

    private fun deleteAllInformData() {
        db?.informDao()?.deleteAll()
    }

    private fun selectInformData(){
        val informDataList = db?.informDao()?.selectAll()

        var informData = ""
        informDataList?.let {
            for (data in it){
                informData += "\n ${data.name} / ${data.gender} / ${data.phoneNumber}"
            }
        }

        binding.tvLoadData.text = informData
    }

    private fun insertInformData(){
        val inform = Inform(
            binding.etName.text.toString(),
            binding.etGender.text.toString(),
            binding.etPhoneNumber.text.toString()
        )

        db?.informDao()?.insert(inform)

        textClear()
    }

    private fun textClear(){
        binding.etName.text.clear()
        binding.etGender.text.clear()
        binding.etPhoneNumber.text.clear()
    }
}