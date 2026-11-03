import kotlin.math.pow

fun main() {
    println("Testando Hieraquia")

    println("12 + 5 / 2 é igual a:" + (12 + 5 / 2.0))
    println("Diferente de (12 + 5) / 2 que é igual a:" + ((12 + 5) / 2.0))

    println("64.0.pow(1.0/4.0) é igual a: " + 64.0.pow(1.0/4.0))
    println("Diferente de 4.0.pow(1 / 4.0) que é igual a: " + 64.0.pow(1 / 4.0))

    println("3 * 7 / 5 é igual a:" + (3 * 7 % 5))
    println("Igual a (3 * 7) % 5 que é igual a:" + (3 * 7 % 5))

    println("3 * 7 / 5 é igual a: " + (3 * 7 / 5))
    println("IGUAL a (3 * 7) / 5 que é igual a: " + ((3 * 7) / 5))
}
