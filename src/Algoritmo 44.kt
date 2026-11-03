import java.util.Scanner
import kotlin.math.log10

fun main(){
    val scanner = Scanner(System.`in`)
    println("Entre com o logaritmo:")
    val num = scanner.nextDouble()

    println("Entre com a Base:")
    val base = scanner.nextDouble()

    val logaritmo = log10(num) / log10(base)
    println(logaritmo)

}