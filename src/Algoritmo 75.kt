fun main (){
    println("Entre com seu peso, só a parte inteira:")
    val peso = scanner.nextDouble()

    val pesogramas = peso * 1000
    val novoPeso = pesogramas * 1.12

    println("Peso em Gramas: $pesogramas")
    println("Novo Peso: $novoPeso")
}