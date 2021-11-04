package com.example.hercomomy.recyclerviewadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hercomomy.R
import com.example.hercomomy.dataclasses.Loans

class LoanRecyclerviewAdapter (var loan:List<Loans>): RecyclerView.Adapter<LoanRecyclerviewAdapter.LoanViewHolder>() {
    private lateinit var title: TextView
    private lateinit var body: TextView
    private lateinit var date: TextView
    private lateinit var image: ImageView

    inner class LoanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        init {
            title = itemView.findViewById(R.id.fragment_grants_title_tv)
            body = itemView.findViewById(R.id.fragment_grants_content_tv)
            date = itemView.findViewById(R.id.fragment_grants_date_tv)
            image = itemView.findViewById(R.id.fragment_grants_imageItem_iv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LoanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grant_items, parent, false)
        return LoanViewHolder(view)
    }

    override fun onBindViewHolder(holder: LoanViewHolder, position: Int) {
        holder.itemView.apply {
            title.text = loan[position].title
            body.text = loan[position].body
            date.text = loan[position].date
            image.setImageResource(loan[position].image)
        }
    }

    override fun getItemCount(): Int {
        return loan.size
    }
}