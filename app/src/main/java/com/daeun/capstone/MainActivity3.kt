package com.daeun.capstone

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.project_apply)

        val btnApplyReal : Button = findViewById(R.id.real_apply_btn)

        btnApplyReal.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity4::class.java)

            startActivity(intent)
        }
    }
}