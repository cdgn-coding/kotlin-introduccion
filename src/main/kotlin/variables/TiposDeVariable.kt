fun main() {
    val booleano = true
    val numeroLargo: Long = 3L
    val double = 2.7182
    val float = 1.1f
    val primerValor = 20
    val segundoValor = 10
    // En Kotlin todos son objetos, incluso los primitivos
    val resultado = primerValor.minus(segundoValor)
    println(resultado)

    val nombre = "john doe"
    val apellido = "Doe"
    // String template o interpolacion
    println("$nombre $apellido")
}