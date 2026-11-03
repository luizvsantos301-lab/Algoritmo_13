fun main(){
    println("Digite Numero:")
    val num = readln().toDouble()

    if (num > 0)
        println ("Positivo")
    else
        if (num < 0)
            println ("Negativo")
    else
        println("Nulo")
}