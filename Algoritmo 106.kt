fun main(){
    println("Digite o Nome")
    val nome = readln()

    if (nome.isNotEmpty() && (nome.first() == 'A' || nome.first() == 'a')) {
        println(nome)
    }
}


