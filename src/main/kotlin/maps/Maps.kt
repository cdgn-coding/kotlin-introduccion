fun main() {
    // Mutables
    val edadDeSuperHeroes = mapOf(
        "Ironman" to 35,
        "Capitan America" to 99,
        "Spiderman" to 23
    )

    println(edadDeSuperHeroes)

    // Mutables
    val edadDeSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Capitan America" to 99,
        "Spiderman" to 23
    )

    println(edadDeSuperHeroesMutable)
    edadDeSuperHeroesMutable.put("Wolverine", 45)
    println(edadDeSuperHeroesMutable)

    edadDeSuperHeroesMutable["Storm"] = 30
    println(edadDeSuperHeroesMutable)

    println("La edad de ironman es ${edadDeSuperHeroesMutable["Ironman"]}")

    edadDeSuperHeroesMutable.remove("Wolverine")
    println(edadDeSuperHeroesMutable)

    println(edadDeSuperHeroesMutable.keys)
}