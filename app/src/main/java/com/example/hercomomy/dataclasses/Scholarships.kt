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
                "In to am attended desirous raptures declared diverted confined at. Collected instantly remaining up certainly to necessary as.",
                "Sight happy do burst fruit to woody begin at. Assurance perpetual he",
                "1 day ago",
                R.drawable.eighteen
            ),
            Scholarships(
                "The year paid met him does eyes same. Own marianne improved sociable not out.",
                "Thing do sight blush mr an. Celebrated am announcing",
                "3 days ago",
                R.drawable.ninteen
            ),
            Scholarships(
                "Design use say piqued any gay supply. Front sex match vexed her those great.",
                "Examine she brother prudent add day ham. Just to add to it i",
                "3 days ago",
                R.drawable.twenty
            ),
            Scholarships(
                "Far stairs now coming bed oppose hunted become his. You zealously departure had procuring suspicion.",
                "kBooks whose front would purse if be do decay.",
                "8 days ago",
                R.drawable.sixth
            ),
            Scholarships(
                "Name were we at hope. Remainder household direction zealously the unwilling bed sex. Lose and gay ham sake met that.",
                "Stood her place one ten spoke yet. Head case knew ever set why over.",
                "3 days ago",
                R.drawable.third
            )
        )
    }
}
