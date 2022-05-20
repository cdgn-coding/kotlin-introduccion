fun main() {
    var posiblenull: String? = null
    try {
        println(posiblenull!!.length)
    } catch (ex: NullPointerException) {
        println("NPE catched!!")
    } finally {
        println("Always executed no matter if an exception was thrown")
    }
    posiblenull = readln()
    println(posiblenull)
    println(posiblenull?.length)
}