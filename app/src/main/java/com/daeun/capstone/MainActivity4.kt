package com.daeun.capstone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_project_applied)

        val appliedProjects = listOf(
            Project("사내 업무관리 도구 개발 - Java, Spring Framework", "개발 - 소프트웨어 엔지니어, 서버 개발자", "예상 금액: 월 500만원 ~ 700만원", "예정일: 2024-04-06")
            // 필요한 만큼 프로젝트를 추가할 수 있습니다.
        )

        val recyclerView: RecyclerView = findViewById(R.id.applied_list)
        val adapter = AppliedProjectsAdapter(appliedProjects)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    data class Project(val title: String, val job: String, val salary: String, val date: String)


}


class AppliedProjectsAdapter(private val dataSet: List<MainActivity4.Project>) :
    RecyclerView.Adapter<AppliedProjectsAdapter.ViewHolder>() {

    // ViewHolder 클래스 정의
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView1: TextView = view.findViewById(R.id.textView1)
        val textView2: TextView = view.findViewById(R.id.textView2)
        val textView3: TextView = view.findViewById(R.id.textView3)
        val textView4: TextView = view.findViewById(R.id.textView4)
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