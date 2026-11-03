fun main() {
    // Digite palavra 1 (c)
    print("digite palavra 1: ")
    val c = readln()

    // Digite palavra 2 (cl)
    print("digite palavra 2: ")
    val cl = readln()

    // Tamanho da string c: strtam(c)
    println(c.length)

    // Concatenando: strconcat(c, cl)
    println("concatenando: " + (c + cl))

    // C <- strcopia(c) [Em Kotlin, atribuição de string é direta]
    val d = c
    println("E O CONTEUDO DE D: $d")

    // dl <- strconcat(c, cl)
    val dl = c + cl
    println("concatenacao: $dl")

    // Primeiro caractere: strprim(c)
    println("primeiro caractere: ${c.firstOrNull() ?: ""}")

    // Último caractere: strult(c)
    println("ultimo caractere: ${c.lastOrNull() ?: ""}")

    // Todos menos o primeiro: strresto(c)
    println("todos menos o primeiro: ${if (c.length > 1) c.drop(1) else ""}")

    // O terceiro elemento (índice 2, que corresponde ao 3º caractere): strelem(c, 3)
    println("o terceiro elemento: ${c.getOrNull(2) ?: ""}")

    // Os três primeiros elementos: strnprim(c, 3)
    println("os tres primeiros elementos: ${c.take(3)}")

    // Os três últimos elementos: strnresto(c, 3)
    println("os tres ultimos elementos: ${c.takeLast(3)}")
}