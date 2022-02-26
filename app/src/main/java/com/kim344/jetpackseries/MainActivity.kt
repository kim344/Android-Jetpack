package com.kim344.jetpackseries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim344.jetpackseries.databinding.ActivityMainBinding
import com.kim344.jetpackseries.room.RoomActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Room Sample 화면으로 이동
        binding.btnRoom.setOnClickListener {
            startActivity(Intent(this, RoomActivity::class.java))
        }

    }
}