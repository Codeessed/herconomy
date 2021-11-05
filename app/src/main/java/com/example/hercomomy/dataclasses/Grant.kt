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
                    "Betrayed cheerful declared end and. " +
                            "Questions we additions is extremely incommode.",
                    "An country demesne message it. Bachelor domestic extended doubtful as " +
                            "concerns at." +
                            "Law gate her well bed life feet seen rent. On nature or no except it sussex.",
                    "3 days ago",
                    R.drawable.first
                ),
                Grant(
                    "Cultivated who resolution connection motionless did occasional. Journey " +
                            "promise if it colonel.",
                    "Morning prudent removal an letters by. On could my in" +
                            "order never it. Or excited certain sixteen it to parties colonel",
                    "5 days ago",
                    R.drawable.second
                ),
                Grant(
                    "Unpleasant especially assistance sufficient he comparison so inquietude.",
                    "Branch one shy edward stairs turned has law wonder horses",
                    "5 days ago",
                    R.drawable.third
                ),
                Grant(
                    "Tried spoil as heart visit blush or. Boy possible blessing sensible set but margaret interest.",
                    "Off tears are day blind smile alone had.",
                    "5 days ago",
                    R.drawable.forth
                ),
                Grant(
                    "Must you with him from him her were more. In eldest be it result should remark vanity square.",
                    "Unpleasant especially assistance sufficient he comparison so inquietude",
                    "7 days ago",
                    R.drawable.fifth
                ),
                Grant(
                    "Offices parties lasting outward nothing age few resolve. Impression to discretion understood to we interested",
                    "Him remarkably use projection collecting. Going about eat forty world has round miles.",
                    "10 days ago",
                    R.drawable.sixth
                )
            )
        }
}
