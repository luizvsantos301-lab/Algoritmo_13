fun main() {
    print("\ndigite nome: ")
    val nome = readln()

    // Equivalente a strnprim(nome, 5) - pega até os primeiros 5 caracteres (ou o tamanho da string se for menor)
    val prenome = nome.take(5)

    // Condição equivalente à lógica do algoritmo
    if (prenome.equals("JOSÉ", ignoreCase = true) ||
        prenome.equals("José", ignoreCase = true) ||
        prenome.equals("josé", ignoreCase = true) ||
        nome.equals("josé", ignoreCase = true) ||
        nome.equals("Josê", ignoreCase = true) ||
        nome.equals("JOSÉ", ignoreCase = true)
    ) {

        println("\n$nome")
    }

    println()
}