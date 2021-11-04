package com.example.hercomomy.topfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.hercomomy.R
import com.example.hercomomy.dataclasses.Investment.Companion.investment
import com.example.hercomomy.dataclasses.Loans
import com.example.hercomomy.recyclerviewadapter.InvestmentRecyclerviewAdapter
import com.example.hercomomy.recyclerviewadapter.LoanRecyclerviewAdapter
import com.google.android.material.tabs.TabLayout


class InvestmentFragment : Fragment() {
    private lateinit var recyclerview: RecyclerView
    private lateinit var adapter:InvestmentRecyclerviewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_investment, container, false)
        recyclerview = view.findViewById(R.id.fragment_investment_recyclerview_rv)
        adapter = InvestmentRecyclerviewAdapter(investment)
        recyclerview.adapter  = adapter
        recyclerview.layoutManager= LinearLayoutManager(requireActivity())
        adapter.notifyDataSetChanged()
        return view
    }


}