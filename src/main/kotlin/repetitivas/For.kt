fun main() {
    val listaDeFrutas = listOf("Manzana", "Frambuesa", "Durazno")
    for (fruta in listaDeFrutas) {
        println("Me como la fruta... $fruta")
    }
    listaDeFrutas.forEach { fruta -> println("Me como la fruta... $fruta... desde el foreach") }

    listaDeFrutas.map { fruta -> fruta.length}.forEach { c -> println("Cantidad de caracteres: $c") }
    listaDeFrutas.filter { fruta -> fruta.length > 4 }.forEach { fruta -> println("$fruta es de nombre largo") }
}