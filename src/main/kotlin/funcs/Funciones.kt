
fun main() {
    val frase = "Frase aleatoria"
    println(randomCase(frase))
    println(randomCase(frase))
    println(randomCase(frase))
    printRandomCase(frase)
    println(frase.extensionFunctionRandomCase())
    imprimirNombre(nombre = "John", apellido = "Doe")
    // Lambdas
    val miLambda: (String) -> Int = { it.length }
    println(miLambda("cinco"))
    println(listOf("cinco", "hola mundo").map(miLambda))
}

fun imprimirNombre(nombre: String, segundoNombre: String = "", apellido: String) {
    println("$nombre $segundoNombre $apellido")
}

fun String.extensionFunctionRandomCase(): String {
    return randomCase(this)
}

fun printRandomCase(frase: String) {
    println(randomCase(frase))
}

fun randomCase(frase: String): String {
    val rng = (0..9).random()
    if (rng.rem(2) == 0) {
        return frase.uppercase()
    }

    return frase.lowercase()
}