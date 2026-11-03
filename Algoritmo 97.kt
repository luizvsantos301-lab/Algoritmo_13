fun main(){
    println("Digite um numero")
    val numero = readln().toDouble()

    if (numero % 10 == 0.0) {
        println("Multiplo de 10")
    }else{
        if (numero % 2 == 0.0)
            println("Multiplo de 2")
        else
        if (numero % 5 == 0.0)
        println("Multiplo de 5")
        else
        println("Não é multiplo de 2 nem de 5")
    }
}