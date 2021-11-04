package com.example.hercomomy.recyclerviewadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hercomomy.R
import com.example.hercomomy.dataclasses.Jobs

class JobRecyclerviewAdapter(var job:List<Jobs>): RecyclerView.Adapter<JobRecyclerviewAdapter.JobViewHolder>() {
    private lateinit var title: TextView
    private lateinit var recruiter: TextView
    private lateinit var date: TextView
    private lateinit var image: ImageView

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        init {
            title = itemView.findViewById(R.id.fragment_jobs_title_tv)
            recruiter = itemView.findViewById(R.id.fragment_jobs_recruiter_tv)
            date = itemView.findViewById(R.id.fragment_jobs_date_tv)
            image = itemView.findViewById(R.id.fragment_jobs_imageItem_iv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.job_items, parent, false)
        return JobViewHolder(view)
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        holder.itemView.apply {
            title.text = job[position].title
            recruiter.text = job[position].recruiter
            date.text = job[position].date
            image.setImageResource(job[position].image)
        }
    }

    override fun getItemCount(): Int {
        return job.size
    }
}