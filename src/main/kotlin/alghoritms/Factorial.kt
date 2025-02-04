package org.example.alghoritms


fun findFactorialRecursive(number: Int): Int {
    if (number == 1) {
        return number
    }
    return number * findFactorialRecursive(number - 1)
}

fun findFactorialIterative(number: Int): Int {
    var factorial = 1
    for (i in number downTo 2) {
        factorial *= i
    }

    return factorial

}
