package org.example.alghoritms.dynamicprogramming

private fun dynamicProgrammingClosure(): (Int) -> Int {
    val map = mutableMapOf<Int, Int>()

    return fun(n: Int): Int {
        if (map.contains(n)) {
            return map[n]!!
        }
        else {
            println("long work")
            map[n] = n+80
            return map[n]!!
        }
    }

}

fun main() {
    val function = dynamicProgrammingClosure()
    println("5: ${function.invoke(5)}")
    println("5: ${function.invoke(5)}")
    println("6: ${function.invoke(6)}")
}