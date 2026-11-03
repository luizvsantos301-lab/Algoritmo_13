fun main(pi: Any) {
    println("Digite raio:")
    val raio = readln()

    val perimetro = 2 * pi * raio
    val area = pi * (raio * raio)

    println("Perimetro: $perimetro")
    println("Area: $area")

}

operator fun Any.times(unit: Any) {
    TODO("Not yet implemented")
}
