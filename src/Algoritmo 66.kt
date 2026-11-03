fun main (){
    println("Digite o tempo gasto")
    val tempo =  readln().toDouble()
    println("Digite a velocidade media")
    val velocidade =  readln().toDouble()

    val distancia = tempo * velocidade
    val litros = distancia / 12

    println("Velocidade: $velocidade")
    println("Distancia: $distancia")
    println("Litros: $litros")
    println("Distancia: $distancia")
}