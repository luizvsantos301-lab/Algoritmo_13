fun main(){
    println("Planetas que podem ser analisados")
    println("1 - Mércurio")
    println("2 - Venus")
    println("3 - Marte")
    println("4 - Jupiter")
    println("5 - Saturno")
    println("6 - Urano")
    println("Escolha o planeta a ser analisado")
    val op = readln().toIntOrNull() ?: 0
    println("Entre com um peso na terra")
    val pterra = readln().toDoubleOrNull() ?: 0.0

    val resultado = when (op) {
        1 -> (pterra / 10.0) * 0.37
        2 -> (pterra / 10.0) * 0.88
        3 -> (pterra / 10.0) * 0.38
        4 -> (pterra / 10.0) * 2.64
        5 -> (pterra / 10.0) * 1.15
        6 -> (pterra / 10.0) * 1.17
        else -> null
    }

    if (resultado != null) {
        println("Seu peso no planeta é: $resultado")
    } else {
        println("Este planeta não pode ser analisado")
    }


}