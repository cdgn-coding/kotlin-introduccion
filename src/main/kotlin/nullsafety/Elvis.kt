fun main() {
    var nombre: String? = null
    val caracteresDeNombre: Int = nombre?.length ?: 0
    println(caracteresDeNombre)
}