enum class crayons{
    RED,BLUE,PINK, YELLOW,BLACK
}

data class Crays(
    val color: String,
    var label: String? = null
)
val boxOfCrays = listOf(Crays("Red"), Crays("Green"), Crays("Blue"),
                Crays("White"), Crays("Black"))

val fireSetColors = setOf(Crays("Red"),
    Crays("Blue"),
    Crays("yellow"))

fun main(){
    val newBox = boxOfCrays
         .asSequence()
         .filter { fireSetColors.contains(it) }
        .map { it.label = "Firecrayon ${it.color}" }
        .take(2)
    print(newBox.toList())

}