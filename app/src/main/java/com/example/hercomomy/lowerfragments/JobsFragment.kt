package com.example.hercomomy.lowerfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hercomomy.R
import com.example.hercomomy.dataclasses.Grant
import com.example.hercomomy.dataclasses.Jobs.Companion.job
import com.example.hercomomy.recyclerviewadapter.GrantRecyclerview
import com.example.hercomomy.recyclerviewadapter.JobRecyclerviewAdapter

class JobsFragment : Fragment() {
    private lateinit var recyclerview: RecyclerView
    private lateinit var adapter:JobRecyclerviewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_jobs, container, false)
        recyclerview = view.findViewById(R.id.fragment_jobs_recyclerview_rv)
        adapter = JobRecyclerviewAdapter(job)
        recyclerview.adapter  = adapter
        recyclerview.layoutManager= LinearLayoutManager(requireActivity())
        adapter.notifyDataSetChanged()
        return view
    }

}