import java.util.Scanner
import kotlin.math.log2

fun main() {
    val scanner = Scanner(System.`in`)

    // Declaração das variáveis
    val xnum1: Double
    val xnum2: Double
    val xnum3: Double
    val x: Double

    // Entrada de dados
    print("\nEntrar com 1 valor: ")
    xnum1 = scanner.nextDouble()

    print("\nEntrar com 2 valor: ")
    xnum2 = scanner.nextDouble()

    print("\nEntrar com 3 valor: ")
    xnum3 = scanner.nextDouble()

    // Cálculo de X
    // Nota: log2(64.0) substitui a expressão log(64.)/log(2.) de forma mais direta e eficiente
    x = xnum1 + (xnum2 / (xnum3 + xnum1)) + (2 * (xnum1 - xnum2)) + log2(64.0)

    // Impressão do resultado
    println("\nX = $x")
    println()
}