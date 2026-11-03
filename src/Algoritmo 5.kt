fun main (){
    val roupaBranca = true
    val tiverBatedaria = false

    fazerBoloSimples(roupaBranca, tiverBatedaria)
}

fun fazerBoloSimples(roupaBranca: Boolean, tiverBatedaria: Boolean) {
    println("1. Pegando os ingredientes")
    if (roupaBranca) {
       println("2 - Colocar avental (protegendo a roupa branca);")
    } else{
        println("2 - Não é necessário avental;")
    }
if (tiverBatedaria) {
   println("3 - Bater os ingredientes na batedeira;")
} else {
    println("3 - Bater os Ingredientes á mão;")
}

    println("4 - Colocar a massa na forma;")

    println("5 - Colocar a forma no forno;")

    println("6 - Aguadar o tempo necessário;")

    println("7 - Retirar o Bolo")


}
