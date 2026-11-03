import kotlin.math.*

fun main() {
    print("Digite um ângulo em graus: ")
    val entrada = readlnOrNull()?.toDoubleOrNull()

    if (entrada != null) {
        // Conversão de graus para radianos
        val rang = Math.toRadians(entrada)

        // Funções principais
        val seno = sin(rang)
        val cosseno = cos(rang)
        val tangente = tan(rang)

        // Funções recíprocas
        val cossecante = 1.0 / seno
        val secante = 1.0 / cosseno
        val cotangente = 1.0 / tangente

        println("\nSeno: $seno")
        println("Co-seno: $cosseno")
        println("Tangente: $tangente")
        println("Co-secante: $cossecante")
        println("Secante: $secante")
        println("Co-tangente: $cotangente")
    } else {
        println("Por favor, digite um número válido.")
    }
}