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
                "Age lived smile six defer bed their few. Had admitting concluded too behaviour",
                "Cultivated who resolution connection motionless did occasional. Journey " +
                        "promise if it colonel. Can all mirth abode nor hills added. Them men does " +
                        "for body pure. r",
                "1 week ago",
                R.drawable.seventh
            ),
            Investment(
                "Must you with him from him her were more. In eldest be it result should remark",
                "Questions we additions is extremely incommode. Next half add call them eat " +
                        "face. Age lived smile six defer bed their few",
                "4 days ago",
                R.drawable.eighth
            ),
            Investment(
                "Them men does for body pure. Far end not horses remain sister. Mr parish is to he answer",
                "Far end not horses remain sister. Mr parish is to he answer",
                "2 days ago",
                R.drawable.nine
            ),
            Investment(
                "vanity square. Unpleasant especially assistance sufficient he comparison",
                "Had admitting concluded too behaviour him she. Of death to or to being other",
                "6 days ago",
                R.drawable.ten
            ),
            Investment(
                "Must you with him from him her were more. In eldest be it result should remark",
                "Questions we additions is extremely incommode. Next half add call them eat " +
                        "face. Age lived smile six defer bed their few",
                "4 days ago",
                R.drawable.eleven
            ),
            Investment(
                "vanity square. Unpleasant especially assistance sufficient he comparison",
                "Had admitting concluded too behaviour him she. Of death to or to being other",
                "6 days ago",
                R.drawable.twelve
            ),
            Investment(
                "Them men does for body pure. Far end not horses remain sister. Mr parish is to he answer",
                "Far end not horses remain sister. Mr parish is to he answer",
                "2 days ago",
                R.drawable.thirteen
            )
        )
    }
}
