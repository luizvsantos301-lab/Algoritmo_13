fun main() {
    print("Digite o nome: ")
    val nome = readlnOrNull()?.trim() ?: ""

    // Pega a primeira palavra (o prenome)
    val prenome = nome.split(" ").firstOrNull()

    if (prenome == "JOSÉ") {
        println(nome)
    }
}