import java.util.Scanner

// Representação do Tabuleiro: 3x3 posições de 1 a 9
// ' ' = Livre, 'X' = Jogador/Adversário, 'O' = Robô (Algoritmo)
val tabuleiro = CharArray(9) { ' ' }
val scanner = Scanner(System.`in`)

fun main() {
    println("--- JOGO DA VELHA (KOTLIN) ---")
    println("Você é o 'X' e o Computador é o 'O'")
    exibirTabuleiro()
    jogarJogoDaVelha()
}

fun jogarJogoDaVelha() {
    // enquanto ((existir um quadrado livre) e (ninguém perdeu(ganhou) o jogo))
    while (existeQuadradoLivre() && !alguemGanhou()) {

        // espere a jogada do adversário
        jogadaDoAdversario()
        exibirTabuleiro()

        // se o adversário ganhou com essa jogada ou o tabuleiro encheu, encerra
        if (alguemGanhou() || !existeQuadradoLivre()) break

        // continue depois se (existir um quadrado livre)
        if (existeQuadradoLivre()) {
            println("\n> Turno do Computador:")

            // se (centro livre) jogue no centro
            if (tabuleiro[4] == ' ') {
                tabuleiro[4] = 'O'
            }
            // senão se (adversário tem 2 quadrados em linha com o terceiro desocupado) jogue neste quadrado desocupado
            else if (verificarBloqueioAdversario() != -1) {
                val posicaoBloqueio = verificarBloqueioAdversario()
                tabuleiro[posicaoBloqueio] = 'O'
            }
            // senão se (há algum canto livre) jogue neste canto
            else if (obterCantoLivre() != -1) {
                val posicaoCanto = obterCantoLivre()
                tabuleiro[posicaoCanto] = 'O'
            }
            // senão joga em qualquer espaço restante (caso de contingência)
            else {
                jogarQualquerLivre()
            }

            exibirTabuleiro()
        }
    }

    // Fim de jogo
    val vencedor = obterVencedor()
    when {
        vencedor == 'X' -> println("\n Parabéns! Você ganhou!")
        vencedor == 'O' -> println("\n O Computador ganhou!")
        else -> println("\n🤝 O jogo terminou em Empate!")
    }
}

// --- FUNÇÕES AUXILIARES DA LÓGICA ---

fun existeQuadradoLivre(): Boolean {
    return tabuleiro.contains(' ')
}

fun jogadaDoAdversario() {
    var jogadaValida = false
    while (!jogadaValida) {
        print("\nSua vez (escolha uma posição de 1-9 livre): ")
        val entrada = scanner.next().toIntOrNull()
        if (entrada != null && entrada in 1..9 && tabuleiro[entrada - 1] == ' ') {
            tabuleiro[entrada - 1] = 'X'
            jogadaValida = true
        } else {
            println("Posição inválida ou já ocupada. Tente novamente.")
        }
    }
}

// Verifica se o adversário ('X') tem 2 em linha com o 3º vazio e retorna o índice vazio
fun verificarBloqueioAdversario(): Int {
    val linhasVitoria = arrayOf(
        intArrayOf(0, 1, 2), intArrayOf(3, 4, 5), intArrayOf(6, 7, 8), // Horizontais
        intArrayOf(0, 3, 6), intArrayOf(1, 4, 7), intArrayOf(2, 5, 8), // Verticais
        intArrayOf(0, 4, 8), intArrayOf(2, 4, 6)                      // Diagonais
    )

    for (linha in linhasVitoria) {
        val contX = linha.count { tabuleiro[it] == 'X' }
        val contVazio = linha.count { tabuleiro[it] == ' ' }

        // Se tem dois 'X' e um espaço em branco, retorna o índice do espaço em branco
        if (contX == 2 && contVazio == 1) {
            return linha.first { tabuleiro[it] == ' ' }
        }
    }
    return -1
}

// Retorna o índice do primeiro canto livre encontrado (cantos: 0, 2, 6, 8)
fun obterCantoLivre(): Int {
    val cantos = intArrayOf(0, 2, 6, 8)
    for (canto in cantos) {
        if (tabuleiro[canto] == ' ') return canto
    }
    return -1
}

fun jogarQualquerLivre() {
    val indice = tabuleiro.indexOf(' ')
    if (indice != -1) tabuleiro[indice] = 'O'
}

fun alguemGanhou(): Boolean {
    return obterVencedor() != ' '
}

fun obterVencedor(): Char {
    val linhasVitoria = arrayOf(
        intArrayOf(0, 1, 2), intArrayOf(3, 4, 5), intArrayOf(6, 7, 8),
        intArrayOf(0, 3, 6), intArrayOf(1, 4, 7), intArrayOf(2, 5, 8),
        intArrayOf(0, 4, 8), intArrayOf(2, 4, 6)
    )
    for (l in linhasVitoria) {
        if (tabuleiro[l[0]] != ' ' && tabuleiro[l[0]] == tabuleiro[l[1]] && tabuleiro[l[1]] == tabuleiro[l[2]]) {
            return tabuleiro[l[0]]
        }
    }
    return ' '
}

fun exibirTabuleiro() {
    println("\n Tabuleiro Atual:")
    println(" ${render(0)} | ${render(1)} | ${render(2)} ")
    println("-----------")
    println(" ${render(3)} | ${render(4)} | ${render(5)} ")
    println("-----------")
    println(" ${render(6)} | ${render(7)} | ${render(8)} ")
}

fun render(i: Int): String {
    return if (tabuleiro[i] == ' ') (i + 1).toString() else tabuleiro[i].toString()
}