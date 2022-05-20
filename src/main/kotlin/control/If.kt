fun main() {
    val nombre = "Maria"
    if (nombre.isNotEmpty()) {
        println("El nombre no esta vacio")
    } else {
        println("El nombre esta vacio")
    }
    if (nombre.isNotEmpty()) println("Not empty string. One liner")
    val eslargo = if (nombre.length > 4) "Es largo!" else "No es!"
}