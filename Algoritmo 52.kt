import kotlin.math.sqrt


fun main (){
    println("Digite o lado do quadrado")
    val input = readln()
    val lado = input?.toDoubleOrNull() ?: 0.0
    val perimetro = 4 * lado
    val area = lado * lado
    val diagonal = lado * sqrt(2.0)

    println("Area: $area")
    println("Perimetro: $perimetro")
    println("Diagonal: $diagonal")

}

private operator fun Int.times(lado: Double?) {


}
