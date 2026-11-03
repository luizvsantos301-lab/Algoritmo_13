import scanner
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("digite 1 numero: ")
    val a = scanner.nextDouble()

    println("digite 2 numero: ")
    val b = scanner.nextDouble()

    println("digite 3 numero: ")
    val c = scanner.nextDouble() // Corrigido de 'e' para 'c' conforme a lógica padrão

    val max: Double

    if (a > b) {
        if (a > c) {
            max = a
        } else {
            max = c
        }
    } else {
        if (b > c) {
            max = b
        } else {
            max = c
        }
    }

    println("\n$max")
    println()
}