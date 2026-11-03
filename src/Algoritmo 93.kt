import kotlin.math.sqrt

fun main(){
    println("Digite um numero: ")
    val numero = readln().toDouble()

    if (numero > 0) {
        val raiz = sqrt(numero)
        println("Raiz: $raiz")
    } else if(numero < 0) {
        val quadrado = numero * numero
        println("Quadrado: $quadrado")
    }else{
            println("O numero é zero")
    }

}