import kotlin.random.Random

// Representação de uma Questão de prova
data class Questao(val numero: Int, var respondida: Boolean = false)

fun main() {
    // 1 - Ler a prova (criando uma lista de 5 questões)
    val prova = mutableListOf(
        Questao(1), Questao(2), Questao(3), Questao(4), Questao(5)
    )
    println("1 - Prova lida. Total de questões: ${prova.size}")

    // 2 - Pegar a caneta
    val temCaneta = true
    println("2 - Caneta na mão: $temCaneta")

    var tempoRestante = 10 // Simulação de minutos ou iterações de tempo

    println("3 - Iniciando a resolução da prova...")

    // 3 - Enquanto houver questão em branco E o tempo não terminou
    while (prova.any { !it.respondida } && tempoRestante > 0) {

        // Busca a primeira questão que ainda está em branco
        val questaoAtual = prova.first { !it.respondida }

        // Simulação: se o aluno sabe a questão (50% de chance de saber nesta rodada)
        val souberQuestao = Random.nextBoolean()

        if (souberQuestao) {
            // Se souber a questão, resolvê-la
            questaoAtual.respondida = true
            println("[Tempo: $tempoRestante] Sabia a Questão ${questaoAtual.numero} e resolvi!")
        } else {
            // Senão, pular para outra (apenas avisa e deixa para depois)
            println("[Tempo: $tempoRestante] Não sabia a Questão ${questaoAtual.numero}... Pulei!")
        }

        // O tempo vai correndo a cada iteração
        tempoRestante--
    }

    // 4 - Entregar a prova
    println("4 - Tempo esgotado ou prova concluída. Entregando a prova!")

    // Resumo final do resultado
    val respondidas = prova.count { it.respondida }
    println("Resultado final: Você respondeu $respondidas de ${prova.size} questões.")
}