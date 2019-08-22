import kotlin.math.sqrt

fun main() {
    val (a,b,h) = readInputData()
    tabulation(a,b,h)
}

fun readInputData(): Triple<Double, Double, Double> {
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val h = readLine()!!.toDouble()
    return Triple(a,b,h)
}

fun tabulation(a: Double, b:Double, h:Double) {
    // TODO код табуляції впишіть сюди
}

fun f(x:Double):Double = TODO()