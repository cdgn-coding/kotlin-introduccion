
val respuestasPosibles = listOf(
    "Si",
    "Por supuesto",
    "Claro que si",
    "Lo dudo",
    "No lo creo",
    "No",
    "Definitivamente no"
)

fun main() {
    println("Hola soy tu bola 8 magica hecha en kotlin")
    println("1. Realizar una pregunta")
    println("2. Revisar todas las respuestas")
    println("3. Salir")

    val opt = readLine()

    when (opt) {
        "1" -> realizarPregunta()
        "2" -> mostrarRespuestas()
        "3" -> salir()
        else -> mostrarError()
    }
}
fun realizarPregunta() {
    println("Que pregunta deseas realizar?")
    readLine()
    println("Asi que esa era tu pregunta... La respuesta es")
    println(respuestasPosibles.random())
}

fun mostrarRespuestas() {
    respuestasPosibles.forEach { println(it)}
}

fun salir() {
    println("Hasta luego")
}

fun mostrarError() {
    println("No entendi, chau")
}