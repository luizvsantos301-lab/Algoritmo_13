fun main (){
    println("Entre com um numero com ponto: ")
    val entrada = readln()
    val numero = entrada.toDoubleOrNull() ?: 0.0
    val tercaparte = numero / 3.0
    println("A terça parte e: $tercaparte")
}