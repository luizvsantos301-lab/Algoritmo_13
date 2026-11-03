import kotlin.math.sqrt

fun main(){
    println("Digite Numero")
    val numtext = readln()
    val num = numtext.toDouble()
    val quad = num * num
    val raizquad = sqrt(num)

    println("numero: $num")
    println("quad: $quad")
    println("raquad: $raizquad")
}