import kotlin.math.sqrt

fun main (){
    println("Entre com a Base")
    val a = readln().toDouble()
    println("Entre com a Altura")
    val b = readln().toDouble()
    println("Entre com a Profundidade")
    val c = readln().toDouble()
    val diagonal = sqrt((2 * a * a) + (2 * b * b) + (2 * c * c ))
    println("Diagonal: $diagonal")
}


