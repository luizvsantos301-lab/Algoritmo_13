fun main() {
    println("Qual é a capital do Brasil")
    val resp = readln().toString()
    if (resp == "brasília" || resp == "BRASÍLIA" || resp == "Brazília" || resp == "brazília")
        println("Certo! Mas atenção para grafia: Brasília ou BRASÍLIA")
    else
        println("Errado! Estude Mais")
}