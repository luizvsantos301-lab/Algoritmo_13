

fun main() {
    print("Digite a sigla do estado: ")
    val sigla = scanner.nextLine().trim().uppercase()


    when (sigla) {
        "RJ" -> println("carioca")
        "SP" -> println("paulista")
        "MG" -> println("mineiro")
        else -> println("outros estados")
    }
}