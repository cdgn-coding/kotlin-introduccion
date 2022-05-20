fun main() {
    // inmutable
    val listaDeNombres = listOf("Juan", "Enrique", "Camila")
    println(listaDeNombres)
    // lista mutable
    val listaMutable = mutableListOf<String>()
    listaMutable.add("Juan")
    listaMutable.add("Enrique")
    listaMutable.add("Camila")
    println(listaMutable)
    listaMutable[0] = "Carlos"
    println(listaMutable.firstOrNull())
    listaMutable.removeAt(0)
    println(listaMutable)
    listaMutable.add("Ana")
    println(listaMutable)
    listaMutable.removeIf { nombre -> nombre.length < 4 }
    println("Elimino nombres con menos de 3 letras")
    println(listaMutable)

    val arr = arrayListOf(1,2,3)
    println("Nuestro array es $arr")
    println("Array como lista ${arr.toList()}")
}