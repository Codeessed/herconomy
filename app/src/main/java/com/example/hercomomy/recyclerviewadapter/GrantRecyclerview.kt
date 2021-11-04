package com.example.hercomomy.recyclerviewadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hercomomy.R
import com.example.hercomomy.dataclasses.Grant

class GrantRecyclerview(var grant:List<Grant>):RecyclerView.Adapter<GrantRecyclerview.GrantViewHolder>(){
    private lateinit var title:TextView
    private lateinit var body:TextView
    private lateinit var date:TextView
    private lateinit var image:ImageView
    inner class GrantViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        init {
            title = itemView.findViewById(R.id.fragment_grants_title_tv)
            body = itemView.findViewById(R.id.fragment_grants_content_tv)
            date = itemView.findViewById(R.id.fragment_grants_date_tv)
            image= itemView.findViewById(R.id.fragment_grants_imageItem_iv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GrantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grant_items, parent, false)
        return GrantViewHolder(view)
    }

    override fun onBindViewHolder(holder: GrantViewHolder, position: Int) {
        holder.itemView.apply {
           title.text = grant[position].title
           body.text = grant[position].body
           date.text = grant[position].date
            image.setImageResource(grant[position].image)
        }
    }

    override fun getItemCount(): Int {
        return grant.size
    }
}