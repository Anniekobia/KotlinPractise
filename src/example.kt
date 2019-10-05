var mySecondLambda: ()->Unit = { println("Am a lambda invoked from a variable")}
var myFirstLambda: (Int,Int)->Int = {x,y-> x+y}
var list = listOf(1,2,3,4,5)

fun addTwoNumbers(a: Int, b: Int, myLambda: (Int,Int)->Int){
    println(myLambda(a,b))
}

fun main(){
    addTwoNumbers(4,6,myFirstLambda)
    addTwoNumbers(4,6,{x,y -> x+y})
    addTwoNumbers(4,6){x,y-> x+y}
    mySecondLambda()
    mySecondLambda.invoke()

    println(list.filter { it > 3 })

    print(1 to ("Apple"))
    print(1.to("Apple"))
}