package org.example.alghoritms

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
// the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 → 2+3

    fun findFibonacciIterative(n: Int): Int {
        var prev = 0
        var current = 1
        var result = 0
        for (i in 2..n) {
            result = prev + current
            prev = current
            current = result
        }

        return current
    }

fun findFibonacciRecursive(n: Int): Int {
    if (n < 2) {
        return n
    }

    return findFibonacciIterative(n-1) + findFibonacciIterative(n-2)
}

