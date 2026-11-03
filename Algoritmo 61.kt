import java.util.Scanner
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)
    
    print("Entre com o 7º termo da P.G.: ")
    val termo7 = scanner.nextDouble()

    print("Entre com a razão da P.G.: ")
    val razao = scanner.nextDouble()

    val quintoTermo = termo7 / razao.pow(2)

    println("\nO 5º termo desta P.G. é: $quintoTermo")
}