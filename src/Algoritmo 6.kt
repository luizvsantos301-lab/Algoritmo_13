fun main(){
val faca = "Faca de cozinha"
val bacia = mutableListOf<String>()
val batatas = mutableListOf("Batata 1", "Batata 2", "Batata 3", "Batata 4")

    println("Pegou a $faca, a bacia e as batatas")
    bacia.add("Água")
    println("Colocou água na bacia.")

    println("\nIniciando o processo:")
    while (batatas.isNotEmpty()) {
        val batataAtual = batatas.removeAt(0)
        println("Descascando a $batataAtual e colocando na bacia com água...")
    }

    println("\nPronto! Todas as batatas foram descascadas")











}