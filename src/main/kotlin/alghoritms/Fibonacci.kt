package org.example.alghoritms

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
// the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 → 2+3
class Fibonacci {
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

    var recursionCalculations = 0
    fun findFibonacciRecursive(n: Int): Int {
        recursionCalculations++
        if (n < 2) {
            return n
        }

        return findFibonacciRecursive(n - 1) + findFibonacciRecursive(n - 2)
    }

    val cache = mutableMapOf<Int, Int>()
    var dynamicCalculations = 0
    fun findFibonacciRecursiveDynamic(n: Int): Int {
        dynamicCalculations++
        if (cache.contains(n)) return cache[n]!!
        if (n < 2) {
            return n
        }

        cache[n] = findFibonacciRecursiveDynamic(n - 1) + findFibonacciRecursiveDynamic(n - 2)
        return cache[n]!!
    }
}


fun main() {
    val fibonacci = Fibonacci()
    val n = 30
    val recursive = fibonacci.findFibonacciRecursive(n)
    println("$recursive recursive calculations: ${fibonacci.recursionCalculations} ")
    val dynamic = fibonacci.findFibonacciRecursiveDynamic(n)
    println("$dynamic dynamic calculations: ${fibonacci.dynamicCalculations} ")
}

