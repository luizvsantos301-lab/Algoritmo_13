fun main(){
    println("Entre Numero 1:")
    val numero1 = readln() ?: ""

    println("Entre Numero 2:")
    val numero2 = readln() ?: ""

    val produto = numero1 * numero2

    println(produto)
}

private operator fun String.times(numero2: String) {}
