package random

import java.lang.Math.random

fun main(args: Array<String>) {
//    print("Mood today?")
//    val mood = readLine() ?: "sad"
//    whatIShouldDoToday(mood = mood)
    sorting()
    trial()
}
fun trial(){
    var r = random()
    val t ={random()}
    println(r)
    println(t)
    println(r)
    println(t)
}
fun whatIShouldDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24) {
    return when {
        isGoodWeather(mood, weather, temperature) -> print("go for a walk")
        notSoGoodWeather(mood, weather, temperature) -> print("stay in bed")
        ishotWeather(mood, temperature) -> print("go swimming")
        else -> print("Stay home and read.")
    }
}
fun sorting() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })
    println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') })
    println(spices.filter {it.startsWith('c') && it.endsWith('e')} )
    println(spices.take(3).filter { it.startsWith('c')})
}
fun isGoodWeather(mood: String, weather: String, temperature: Int) = weather == "Sunny" && temperature > 33
fun notSoGoodWeather(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun ishotWeather(mood: String, temperature: Int) = temperature > 35