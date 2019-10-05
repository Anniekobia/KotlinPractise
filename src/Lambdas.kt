import java.lang.Math.random
import javax.swing.JFrame
import kotlin.random.Random

fun main() {
    rollDice(0)
}

var rollDice: (Int) -> Unit =
    loop@{x: Int -> if (x==0)  return@loop print("0")
    else  print(Random.nextInt(0, 12)) }


