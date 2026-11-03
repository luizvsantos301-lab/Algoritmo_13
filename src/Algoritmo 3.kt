fun trocarLampada(
    lampadaForaDoAlcance: Boolean,
    lampadaQuente: Boolean
) {
    // 1 - se (lâmpada estiver fora de alcance) pegar a escada
    if (lampadaForaDoAlcance) {
        println("1. Pegar a escada e posicionar no local")
    }

    // 2 - pegar a lâmpada (nova)
    println("2. Pegar a lâmpada nova")

    // 3 - se (lâmpada estiver quente) pegar pano
    if (lampadaQuente) {
        println("3. Pegar um pano para não queimar as mãos")
    }

    // 4 - Tirar lâmpada queimada
    println("4. Tirar lâmpada queimada")

    // 5 - Colocar lâmpada boa
    println("5. Colocar lâmpada boa")
}

fun main() {
    // Exemplo de uso da função
    val precisaEscada = true
    val estaQuente = true

    trocarLampada(
        lampadaForaDoAlcance = precisaEscada,
        lampadaQuente = estaQuente
    )
}








