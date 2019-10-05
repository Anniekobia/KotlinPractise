class Person{
    var name: String=""
    var age: Int =2

    fun greet(){
        println("Howdy")
    }
}

var myLambdaWithReceiver: Person.() -> Unit = { var a = Person()
println(this.name +"\t"+this.age)}

fun main(){
    var person = Person()
    person.name = "Tom"
    person.age = 23
    println(person.name)
    println(person.age)


    var personTwo = Person()
    personTwo.apply {
        name = "Jerry"
        age = 45
    }.greet()
    println(personTwo.name)
    println(personTwo.age)

    with(personTwo){
        name = "Another"
        age = 65
    }
    println(personTwo.name)
    println(personTwo.age)

    myLambdaWithReceiver(personTwo)
}