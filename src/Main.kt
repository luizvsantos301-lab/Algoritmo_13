

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main (jointostring: MutableList<String>.() -> Unit) {
   val ingredientes = mutableListOf<String>("frigideira", "ovo","óleo","sal")
    println("Passo 1: Pegou ${ingredientes.jointostring()}.")

    fun fritarovo() {
        println("Passo 2: Colocando o óleo na frigideira")

        println("Passo 3: Acendendo o Fogo")

        var frigideiranofogo = true
        println("Passo 4: Frigideira colocado no fogo")

        var oleoQuente = false
        print("Passo 5: Esperando o óleo esquentar...")
        Thread.sleep(1500)
        oleoQuente = true
        println("Óleo pronto")
    }
}