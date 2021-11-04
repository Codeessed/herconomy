package com.example.hercomomy.dataclasses

import com.example.hercomomy.R

data class Investment(
    var title:String,
    var body:String,
    var date:String,
    var image:Int
){
    companion object{
        var investment = listOf(
            Investment(
                "fnnvnvnvnvnvnvnvnvnv",
                "kkkfkfkfkfkfkfkfkfk",
                "3 days ago",
                R.drawable.first
            ),
            Investment(
                "fnnvnvnvnvnvnvnvnvnv",
                "kkkfkfkfkfkfkfkfkfk",
                "3 days ago",
                R.drawable.first
            )
        )
    }
}
