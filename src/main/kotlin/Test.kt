import java.util.Random

fun main() {
val interstingThings= arrayOf("Kotlin ","Java","C++")
interstingThings.forEach {interstingThings -> println(interstingThings) }
    feedTheFish()
}
fun feedTheFish(){
val day = randam_day()
val food="pellets"
    println("today is $day  and the fish eat is $food")
}
fun randam_day():String{
    val list = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","saturday","sunday")
    return list[Random().nextInt(7)]
}


