package com.example.hercomomy.lowerfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hercomomy.R
import com.example.hercomomy.dataclasses.Grant.Companion.grant
import com.example.hercomomy.recyclerviewadapter.GrantRecyclerview


class GrantsFragment : Fragment() {
    private lateinit var recyclerview: RecyclerView
    private lateinit var adapter:GrantRecyclerview

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_grants, container, false)
        recyclerview = view.findViewById(R.id.fragment_grants_recyclerview_rv)
        adapter = GrantRecyclerview(grant)
        recyclerview.adapter  = adapter
        recyclerview.layoutManager= LinearLayoutManager(requireActivity())
        adapter.notifyDataSetChanged()
        return view
    }


}