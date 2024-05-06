package com.daeun.capstone

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.daeun.capstone.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jobGroupSpinner.adapter= ArrayAdapter.createFromResource(
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

        /*binding.watchResultButton.setOnClickListener {
            인텐트 처리
        }*/

    }
}