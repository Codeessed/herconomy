package com.example.hercomomy.dataclasses

import com.example.hercomomy.R

data class Grant(
    var title:String,
    var body:String,
    var date:String,
    var image:Int
){
        companion object{
            var grant = listOf(
                Grant(
                    "fnnvnvnvnvnvnvnvnvnv",
                    "kkkfkfkfkfkfkfkfkfk",
                    "3 days ago",
                    R.drawable.first
                ),
                Grant(
                    "fnnvnvnvnvnvnvnvnvnv",
                    "kkkfkfkfkfkfkfkfkfk",
                    "3 days ago",
                    R.drawable.first
                )
            )
        }
}
