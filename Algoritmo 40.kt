

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Entre com o dividendo: ")
    val val1 = scanner.nextInt()

    print("Entre com o divisor: ")
    val val2 = scanner.nextInt()

    val quoc = val1 / val2
    val rest = val1 % val2

    println("\n\n")
    println("dividendo: $val1")
    println("divisor: $val2")
    println("quociente: $quoc")
    println("resto: $rest")
}