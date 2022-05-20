fun main() {
    val vocalesRepetidas = setOf("a", "e", "i", "a", "o", "u", "e")
    println(vocalesRepetidas)
    val numerosFavoritos = mutableSetOf("1", "2","3","4")
    println(numerosFavoritos)
    numerosFavoritos.add("5")
    numerosFavoritos.add("5")
    println(numerosFavoritos)
    numerosFavoritos.remove("2")
    println(numerosFavoritos)

    // Encuentra el primer elemento dada una condicion, por defecto la condicion es True
    println(numerosFavoritos.first())
    println(numerosFavoritos.first {n -> n.toInt() > 2})
}