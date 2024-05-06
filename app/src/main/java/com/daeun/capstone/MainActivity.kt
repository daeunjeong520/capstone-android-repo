package com.daeun.capstone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daeun.capstone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.freelancerButton.setOnClickListener{
            val intent= Intent(this,freelanceProfileActivity::class.java)
            startActivity(intent)
        }

        //클라이언트 버튼 리스너 추가 예정
    }
}