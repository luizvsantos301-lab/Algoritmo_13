fun main() {
    // 1 - Escolher a palavra
    val palavras = listOf("KOTLIN", "DESENVOLVEDOR", "PROGRAMACAO", "ALGORITMO", "FORCA")
    val palavraSecreta = palavras.random().uppercase()

    // 2 - Montar o diagrama do jogo (lacunas vazias)
    val letrasAcertadas = CharArray(palavraSecreta.length) { '_' }
    var erros = 0
    val maxErros = 6 // Representa as partes do corpo: cabeça, tronco, 2 braços, 2 pernas

    println("=== BEM-VINDO AO JOGO DA FORCA ===")

    // 3 - Enquanto ((houver lacunas vazias) e (corpo incompleto)) faça
    while (letrasAcertadas.contains('_') && erros < maxErros) {
        println("\nPalavra: ${letrasAcertadas.joinToString(" ")}")
        println("Erros cometidos: $erros / $maxErros")
        print("Digite uma letra: ")

        val entrada = readlnOrNull()?.uppercase() ?: ""

        if (entrada.isEmpty() || entrada.length > 1) {
            println("Por favor, digite apenas uma letra válida.")
            continue
        }

        val letraTentada = entrada[0]

        // Verificar se a letra existe na palavra secreta
        if (palavraSecreta.contains(letraTentada)) {
            // Se acertar uma letra, escrever na lacuna correspondente
            println("Boa! A letra '$letraTentada' está na palavra.")
            for (i in palavraSecreta.indices) {
                if (palavraSecreta[i] == letraTentada) {
                    letrasAcertadas[i] = letraTentada
                }
            }
        } else {
            // Senão, desenhar uma parte do corpo na forca (aumentar contador de erros)
            erros++
            println("Errou! A letra '$letraTentada' não está na palavra. Uma parte do corpo foi desenhada.")
        }
    }

    // Fim do jogo - Verificação do resultado
    println("\n==================================")
    if (!letrasAcertadas.contains('_')) {
        println("PARABÉNS! Você venceu! A palavra era: $palavraSecreta")
    } else {
        println("GAME OVER! O corpo está completo na forca. A palavra era: $palavraSecreta")
    }
    println("==================================")
}