package chapter1

fun main() {
    val r = multiplyByTwo(5)
    println(r)
}

fun multiplyByTwo(i: Int): Int {
    println("Inside multiplyByTwo")
    return i * 2
}
