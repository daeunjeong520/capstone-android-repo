package com.daeun.capstone

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

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