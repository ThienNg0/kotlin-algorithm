package recursion

fun factorial(n: Int): Int {
    return if (n == 0) 1 else n * factorial(n - 1)
}

fun main() {
    println("5! = ${factorial(5)}")
}