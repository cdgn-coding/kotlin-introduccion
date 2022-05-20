fun main() {
    val numerosDeLoteria = listOf(100, 11, 22, 43, 56, 78, 66)
    val numerosOrdenados = numerosDeLoteria.sorted()
    println(numerosDeLoteria)
    println(numerosOrdenados)
    val numerosOrdenadosDec = numerosDeLoteria.sortedDescending()
    println(numerosOrdenadosDec)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    // se tiene map y filter
    val mensajesDeNumeros = numerosDeLoteria.map{ n -> "Tu numero es $n"}
    println(mensajesDeNumeros)

    val numerosPares = numerosDeLoteria.filter { n -> n % 2 == 0}
    println(numerosPares)
}