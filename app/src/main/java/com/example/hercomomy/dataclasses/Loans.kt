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
                "Objection estimable discourse procuring he he remaining on distrusts.",
                "Simplicity affronting inquietude for now sympathize age.",
                "14 days ago",
                R.drawable.fourteen
            ),
            Loans(
                "Offices parties lasting outward nothing age few resolve. Impression to discretion understood to we interested he excellence.",
                "Him remarkably use projection collecting. Going about eat forty world has round miles.",
                "8 days ago",
                R.drawable.fifteen
            ),
            Loans(
                "Attention affection at my preferred offending shameless me if agreeable. Life lain held calm and true neat she.",
                "Much feet each so went no from. Truth began maids linen an mr to after.",
                "9 days ago",
                R.drawable.seventeen
            )
        )
    }
}