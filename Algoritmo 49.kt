fun main() {
    print("entre com nome: ")
    val nome = readln()

    val n = nome.length - 2

    println("todo nome: $nome")
    println("primeiro caractere: ${nome.firstOrNull() ?: ""}")
    println("ultimo caractere: ${nome.lastOrNull() ?: ""}")
    println("primeiro ao terceiro caractere: ${nome.take(3)}")
    println("quarto caractere: ${nome.getOrNull(3) ?: ""}")
    println("todos menos o primeiro: ${nome.drop(1)}")
    println("os dois ultimes: ${nome.takeLast(if (n > 0) n else 0)}")
}