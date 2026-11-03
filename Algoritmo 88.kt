fun main() {
    println("\n\t\t\t\t*************")
    println("\t\t\t\t*CALCULADORA*")
    println("\t\t\t\t*************")
    println("\n\t\t\t\t+ para somar")
    println("\n\t\t\t\t- para subtrair")
    println("\n\t\t\t\t* para multiplicar")
    println("\n\t\t\t\t/ para dividir")
    print("\n\t\t\t\tDigite opcao: ")

    val resp = readln().trim()

    if (resp == "+") {
        print("Digite 1 numero com ponto: ")
        val a = readln().toDoubleOrNull() ?: 0.0
        print("Digite 2 numero com ponto: ")
        val b = readln().toDoubleOrNull() ?: 0.0
        println("SOMA: ${a + b}")
    } else if (resp == "-") {
        print("Digite 1 numero com ponto: ")
        val a = readln().toDoubleOrNull() ?: 0.0
        print("Digite 2 numero com ponto: ")
        val b = readln().toDoubleOrNull() ?: 0.0
        println("SUBTRACAO: ${a - b}")
    } else if (resp == "*") {
        print("Digite 1 numero com ponto: ")
        val a = readln().toDoubleOrNull() ?: 0.0
        print("Digite 2 numero com ponto: ")
        val b = readln().toDoubleOrNull() ?: 0.0
        println("MULTIPLICACAO: ${a * b}")
    } else if (resp == "/") {
        print("Digite 1 numero com ponto: ")
        val a = readln().toDoubleOrNull() ?: 0.0
        print("Digite 2 numero com ponto: ")
        val b = readln().toDoubleOrNull() ?: 0.0
        if (b != 0.0) {
            println("DIVISAO: ${a / b}")
        } else {
            println("Erro: Divisão por zero!")
        }
    } else {
        println("\nOPCAO NAO DISPONIVEL!")
    }
}