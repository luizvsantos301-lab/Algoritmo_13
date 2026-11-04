enum class Margem {
    ESQUERDA,
    DIREITA
}

data class Estado(
    val homem: Margem,
    val leao: Margem,
    val cabra: Margem,
    val grama: Margem
) {
  fun eValido(): Boolean {
  if (leao == cabra && homem != leao) return false
  if (cabra == grama && homem != cabra) return false
  return true
  }
}

class TravessiaRioKotlin {
    fun resolver() {
      val passos = listOf(
      "1. Levar a cabra para a margem direita",
      "2. Voltar sozinho para a margem esquerda",
      "3. Levar o leão para a margem direita",
      "4. Voltar trazendo para a margem esquerda",
      "5. Deixar a cabra, pegar a grama e levar para a margem direita",
      "6. Voltar sozinho para a margem esquerda",
      "7. Levar a cabra para a margem direita"

      )

        println("=== Algoritmo de Travessia (Leão, Cabra e Grama) ===")
        passos.forEach { passo ->
            println(passo)
        }
    }
}

fun main() {
    val jogo = TravessiaRioKotlin()
    jogo.resolver()
}