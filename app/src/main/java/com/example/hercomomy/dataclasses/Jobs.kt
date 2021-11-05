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
                "Marianne returned of peculiar replying in moderate. Roused get enable garret estate old county. Entreaties you devonshire law dissimilar terminated.",
                "Law Union and Rock Insurance Plc.",
                "3 days ago",
                R.drawable.second
            ),
            Jobs(
                "Name were we at hope. Remainder household direction zealously the unwilling bed",
                "Stood her place one ten spoke yet. Head case knew ever set why over.",
                "6 days ago",
                R.drawable.fifteen
            ),
            Jobs(
                "Name were we at hope. Remainder household direction zealously the unwilling bed",
                "Stood her place one ten spoke yet. Head case knew ever set why over.",
                "6 days ago",
                R.drawable.eighteen
            ),
            Jobs(
                "Name were we at hope. Remainder household direction zealously the unwilling bed",
                "Stood her place one ten spoke yet. Head case knew ever set why over.",
                "6 days ago",
                R.drawable.seventh
            ),
            Jobs(
                "Name were we at hope. Remainder household direction zealously the unwilling bed",
                "Stood her place one ten spoke yet. Head case knew ever set why over.",
                "6 days ago",
                R.drawable.ten
            ),
            Jobs(
                "Name were we at hope. Remainder household direction zealously the unwilling bed",
                "Stood her place one ten spoke yet. Head case knew ever set why over.",
                "6 days ago",
                R.drawable.twenty
            )
        )
    }
}
