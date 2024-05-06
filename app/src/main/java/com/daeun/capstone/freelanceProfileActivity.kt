package com.daeun.capstone

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.daeun.capstone.databinding.ActivityFreelanceProfileBinding

class freelanceProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFreelanceProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFreelanceProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jobGroupSpinner.adapter=ArrayAdapter.createFromResource(
            this,
            R.array.job_group,
            android.R.layout.simple_list_item_1
        )

        binding.jobSpinner.adapter=ArrayAdapter.createFromResource(
            this,
            R.array.job,
            android.R.layout.simple_list_item_1
        )

        binding.workStyleSpinner.adapter=ArrayAdapter.createFromResource(
            this,
            R.array.work_style,
            android.R.layout.simple_list_item_1
        )

        binding.profileCreateButton.setOnClickListener {
            val goFreeMain=Intent(this,FreelanceMainActivity::class.java)
            startActivity(goFreeMain)
            Toast.makeText(this,"프로필 생성 완료",Toast.LENGTH_SHORT).show()
        }
    }
}