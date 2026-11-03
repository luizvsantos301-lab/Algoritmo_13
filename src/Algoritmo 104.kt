fun main() {
    println("Digite o Nome")
    val nome = readln().toString()
    println("Digite o Sexo")
    val sexo = readln().toString()
    println("Digite a Idade")
    val idade = readln().toString()

    if ((sexo == "F" || sexo == "f") && idade < 25){
        println("Nome Aceito")
} else {
        println("Nome não aceito")
    }
}

private operator fun String.compareTo(i: Int): Int {
    TODO("Not yet implemented")
}
