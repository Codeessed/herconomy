package com.example.hercomomy.dataclasses

import com.example.hercomomy.R

data class Jobs(
    var title:String,
    var recruiter:String,
    var date:String,
    var image:Int
){
    companion object{
        var job = listOf(
            Jobs(
                "fnnvnvnvnvnvnvnvnvnv",
                "kkkfkfkfkfkfkfkfkfk",
                "3 days ago",
                R.drawable.first
            ),
            Jobs(
                "fnnvnvnvnvnvnvnvnvnv",
                "kkkfkfkfkfkfkfkfkfk",
                "3 days ago",
                R.drawable.first
            )
        )
    }
}
