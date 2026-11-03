import kotlin.math.pow
import kotlin.math.sqrt


fun main () {
    val base: Double
    val altura: Double
    val perimetro: Double
    val area: Double
    val diagonal: Double

    print("Digite base: ")
    base = readln().toDouble()

    print("Digite altura: ")
    altura = readln().toDouble()

    perimetro = 2 * (base + altura)
    area = base * altura
    diagonal = sqrt(base.pow(2) + altura.pow(2))

    println("\nperimetro = $perimetro")
    println("area = $area")
    println("diagonal = $diagonal")

}






