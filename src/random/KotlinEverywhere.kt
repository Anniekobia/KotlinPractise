package random

fun main(args: Array<String>) {
    //array()
    fibonacci()
}
//fun array(){
//    val first = arrayOf(1,2,3,4,9,5)
//    val second = arrayOf(2,3,4,5,6,1,7)
//    for (i in first){
//        if (!second.contains(i)) print("Is not a subset")
//        else print("Is a subset")
//    }
//}
fun fibonacci(){
    var list = listOf(0,1)
    val sequence = generateSequence(0){if(it<20){ it+2
    } else null}
    print(sequence.toList())
}


