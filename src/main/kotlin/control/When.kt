fun main(args: Array<String>) {
    print("Ingresar color ")
    val nombreColor = readln()
    when (nombreColor) {
        "Amarillo" -> println("El color de la alegria")
        "Rojo" -> println("Simboliza el calor")
    }

    val resultado = when (nombreColor) {
        "Amarillo" -> "El color de la alegria"
        "Rojo" -> "Simboliza el calor"
        else -> "Cualquier otra cosa"
    }

    println("asigne variable usando when $resultado")


    // Pattern matching de enteros
    val code = 200
    when (code) {
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        300,302 -> println("Redirect")
        else -> "Codigo desconocido"
    }
}