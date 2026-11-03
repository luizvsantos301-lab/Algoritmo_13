import kotlin.math.sqrt

fun main (){
    println("Entar com 1 cateto")
    val b = scanner.nextDouble()
    println("Entar com 2 cateto")
    val c = scanner.nextDouble()

    val a =  sqrt(b * b * 2 + c * c * 2)
    println(a)
}