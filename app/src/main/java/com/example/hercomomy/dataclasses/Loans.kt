package com.example.hercomomy.dataclasses

import com.example.hercomomy.R

data class Loans(
    var title:String,
    var body:String,
    var date:String,
    var image:Int
){
    companion object{
        var loan = listOf(
            Loans(
                "fnnvnvnvnvnvnvnvnvnv",
                "kkkfkfkfkfkfkfkfkfk",
                "3 days ago",
                R.drawable.first
            ),
            Loans(
                "fnnvnvnvnvnvnvnvnvnv",
                "kkkfkfkfkfkfkfkfkfk",
                "3 days ago",
                R.drawable.first
            )
        )
    }
}