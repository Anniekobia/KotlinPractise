package random

import kotlin.system.measureTimeMillis

fun main(){
         val timeTaken = measureTimeMillis {
             println(getMyMovies())
             println(getMyIpAddress())
         }
    print(timeTaken)
     }
     fun getMyMovies(): String{
        return java.net.URL("http://cf0385d2.ngrok.io/movies").readText()
    }
     fun getMyIpAddress(): String{
         return java.net.URL("https://api.ipify.org").readText()
     }




