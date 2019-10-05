package random

import java.util.*


fun main(args: Array<String>) {
    dayOfWeek();
    var fortune: String
    var i: Int = 0
    while (i <= 10) {
        fortune = getFortuneCookie()
        println("$fortune")
        i++
        if (fortune.contains("Lies you tell!")) break;
    }
//    canAddFish(10.0, listOf(3,3,3))
//    canAddFish(8.0, listOf(2,2,2), hasDecorations = false)
//    canAddFish(9.0, listOf(1,1,3), 3)
//    canAddFish(10.0, listOf(), 7, true)
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    println((tankSize.times(if (hasDecorations) 0.8 else 1.0) >= fishSize + currentFish.sum()))
    return (tankSize.times(if (hasDecorations) 0.8 else 1.0) >= fishSize + currentFish.sum())
}

fun dayOfWeek() {
    println("What day is it today?");
    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
    println(
        when (day) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "No such day"
        }
    );
}

fun getFortuneCookie(): String {
    var fortuneMessage = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Lies you tell!"
    );
    print("\n Enter your birthday \t")
    return when (getBirthday()) {
        in 1..7 -> return fortuneMessage[0]
        in 8..14 -> return fortuneMessage[1]
        in 14..21 -> return fortuneMessage[2]
        in 22..28 -> return fortuneMessage[3]
        in 28..31 -> return fortuneMessage[4]
        else -> return fortuneMessage[5]
    }

}

fun getBirthday(): Int {
    return readLine()?.toIntOrNull() ?: 1;
}
