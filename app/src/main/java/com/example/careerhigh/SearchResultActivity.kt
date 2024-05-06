package com.example.careerhigh

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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


class SearchResultsAdapter(private val dataSet: List<SearchResultActivity.SearchResult>) :
    RecyclerView.Adapter<SearchResultsAdapter.ViewHolder>() {

    // ViewHolder 클래스 정의
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView1: TextView = view.findViewById(R.id.textView1)
        val textView2: TextView = view.findViewById(R.id.textView2)
        val textView3: TextView = view.findViewById(R.id.textView3)
        val textView4: TextView = view.findViewById(R.id.textView4)

        init {
            view.setOnClickListener {
                //val item = dataSet[adapterPosition]
                val intent = Intent(view.context, MainActivity2::class.java)
                view.context.startActivity(intent)
            }
        }

    }

    // onCreateViewHolder 메서드 구현
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_search_result, parent, false)
        return ViewHolder(view)
    }

    // onBindViewHolder 메서드 구현
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView1.text = item.title
        holder.textView2.text = item.job
        holder.textView3.text = item.salary
        holder.textView4.text = item.date
    }

    // getItemCount 메서드 구현
    override fun getItemCount(): Int {
        return dataSet.size
    }
}



