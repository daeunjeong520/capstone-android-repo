package com.example.careerhigh

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.project_detail)

        val btnApply : Button = findViewById(R.id.apply_button)

        btnApply.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)

            startActivity(intent)
        }
    }
}