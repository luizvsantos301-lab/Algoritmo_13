fun main(){
    println("Digite 1 numero")
    val a = scanner.nextDouble()
    println("Digite 2 numero")
    val b = scanner.nextDouble()

    val d = (a - b) * (a - b)
    val q = (a * a) - (b * b)
    println("O Quadrado de Diferença: $d")
    println("O Diferenças dos Quadros: $q")
}