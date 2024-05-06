package com.daeun.capstone

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.daeun.capstone.databinding.ActivityFreelanceMainBinding
import com.daeun.capstone.databinding.ActivityFreelanceProfileBinding

class FreelanceMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFreelanceMainBinding // 바인딩 변수 선언
    private lateinit var projectAdapter: ProjectAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 바인딩 초기화
        binding = ActivityFreelanceMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dummyList = mutableListOf<Project>(
            Project("B2B SaaS 출판계 플랫-프론트엔드", "개발-웹 개발/프론트엔드 개발자", "원격/상주", "예상금액:650만~1000만원", "예정일:2024-04-08"),
            Project("B2B SaaS 출판계 플랫-프론트엔드", "개발-웹 개발/프론트엔드 개발자", "원격/상주", "예상금액:650만~1000만원", "예정일:2024-04-08"),
            Project("B2B SaaS 출판계 플랫-프론트엔드", "개발-웹 개발/프론트엔드 개발자", "원격/상주", "예상금액:650만~1000만원", "예정일:2024-04-08")
        )

        projectAdapter = ProjectAdapter(dummyList)
        binding.projectRecyclerView.apply {
            adapter = projectAdapter
            layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        }

        binding.filterButton.setOnClickListener {
            val goFreeMain=Intent(this,SearchActivity::class.java)
            startActivity(goFreeMain)
        }
    }
}