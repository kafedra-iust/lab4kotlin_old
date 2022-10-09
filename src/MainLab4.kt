import kotlin.math.sqrt

fun main() {
    val (a,b,h) = readInputData()
    tabulation(a,b,h)
}

fun readInputData(): Triple<Double, Double, Double> {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val h = readln().toDouble()
    return Triple(a,b,h)
}

fun tabulation(a: Double, b:Double, h:Double) {
    // TODO код табуляції впишіть сюди
}

fun f(x:Double):Double = TODO()