package com.example.hercomomy.recyclerviewadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hercomomy.R
import com.example.hercomomy.dataclasses.Scholarships

class ScholarshipRecyclerviewAdapter(var scholarship:List<Scholarships>): RecyclerView.Adapter<ScholarshipRecyclerviewAdapter.ScholarshipsViewHolder>() {
    private lateinit var title: TextView
    private lateinit var body: TextView
    private lateinit var date: TextView
    private lateinit var image: ImageView

    inner class ScholarshipsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        init {
            title = itemView.findViewById(R.id.fragment_grants_title_tv)
            body = itemView.findViewById(R.id.fragment_grants_content_tv)
            date = itemView.findViewById(R.id.fragment_grants_date_tv)
            image = itemView.findViewById(R.id.fragment_grants_imageItem_iv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScholarshipsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grant_items, parent, false)
        return ScholarshipsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ScholarshipsViewHolder, position: Int) {
        holder.itemView.apply {
            title.text = scholarship[position].title
            body.text = scholarship[position].body
            date.text = scholarship[position].date
            image.setImageResource(scholarship[position].image)
        }
    }

    override fun getItemCount(): Int {
        return scholarship.size
    }
}