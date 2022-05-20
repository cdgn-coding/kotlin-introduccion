fun main() {
    var nombre: String? = null
    nombre?.let { println("$it no es nulo") }
    nombre = "Carlos"
    nombre?.let { println("$it no es nulo") }

    val colores = listOf("azul", "amarillo", "rojo")
    with(colores) {
        println("nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores $size")
    }

    // object configuration and computing result returns last
    val moviles : MutableList<String>? = mutableListOf("google pixel 2xl", "xiomi", "google pixel 4a", "redmi", "sony")
    moviles?.run { removeIf {it.contains("google")} }
    println(moviles)

    // object configuration returns context
    val coloresNulables: MutableList<String>? = mutableListOf("google pixel 2xl", "xiomi", "google pixel 4a", "redmi", "sony")
    println(coloresNulables?.apply {
        println("nuestros telefonos son $this")
        println("Esta lista tiene una cantidad de telefonos $size")
        coloresNulables.remove("xiomi")
    })
    println(coloresNulables)

    // ejecuta la funcion y devuelve tal y como quedo el objeto
    println(moviles.also { println(it) })
}