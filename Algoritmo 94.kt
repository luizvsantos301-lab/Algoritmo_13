fun main(){
    println("Digite um numero")
    val numero = readln().toDouble()

    if (numero % 3 == 0.0) {
        println("Multiplo de 3")
    }else{
        println("Não é multiplo de 3")
        println()
    }
}