package com.example.hercomomy.dataclasses

import com.example.hercomomy.R

data class Scholarships(
    var title:String,
    var body:String,
    var date:String,
    var image:Int
){
    companion object{
        var scholarship = listOf(
            Scholarships(
                "fnnvnvnvnvnvnvnvnvnv",
                "kkkfkfkfkfkfkfkfkfk",
                "3 days ago",
                R.drawable.first
            ),
            Scholarships(
                "fnnvnvnvnvnvnvnvnvnv",
                "kkkfkfkfkfkfkfkfkfk",
                "3 days ago",
                R.drawable.first
            )
        )
    }
}
