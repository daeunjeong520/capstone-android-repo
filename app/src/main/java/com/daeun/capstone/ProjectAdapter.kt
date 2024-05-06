package com.daeun.capstone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.daeun.capstone.databinding.ItemProjectBinding

class ProjectAdapter(private val list:MutableList<Project>):RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val inflater=parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val binding=ItemProjectBinding.inflate(inflater,parent,false)
        return ProjectViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        holder.binding.apply {
            val project=list[position]
            titleText.text=project.title
            wantedJobText.text=project.wantedJob
            wantedWorkStyleText.text=project.wantedWorkStyle
            priceText.text=project.price
            expectedStartDateText.text=project.expectedStartDate
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ProjectViewHolder(val binding: ItemProjectBinding) :RecyclerView.ViewHolder(binding.root){

    }
}