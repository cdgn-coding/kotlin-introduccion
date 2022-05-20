fun main() {
    var contador = 10
    while (contador > 0) {
        println(contador)
        contador--
    }

    do {
        println("Generando numero aleatorio...")
        val rng = (0..100).random()
        println("Numero generado $rng")
    } while (rng > 50)
}