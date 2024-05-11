package com.daeun.capstone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SearchResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_result)

        val searchResults = listOf(
            SearchResult("웹앱 자바 개발자 - Java, Spring Framework", "개발 - 소프트웨어 엔지니어, 서버 개발자", "예상 금액: 월 400만원 ~ 500만원", "예정일: 2024-04-05"),
            SearchResult("사내 업무관리 도구 개발 - Java, Spring Framework", "개발 - 소프트웨어 엔지니어, 서버 개발자", "예상 금액: 월 500만원 ~ 700만원", "예정일: 2024-04-06"),
            SearchResult("상점 플랫폼 - Java, XML", "개발 - 소프트웨어 엔지니어, 서버 개발자", "예상 금액: 월 200만원 ~ 300만원", "예정일: 2024-04-08"),
        )

        val recyclerView: RecyclerView = findViewById(R.id.search_results)
        val adapter = SearchResultsAdapter(searchResults) // 검색 결과를 받아오는 메서드를 호출하여 어댑터에 전달

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }

    data class SearchResult(val title: String, val job: String, val salary: String, val date: String)

}