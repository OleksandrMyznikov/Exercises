package org.example.exercises

import java.util.*


fun removeStars(s: String): String {
    val stack = Stack<Char>()
    for (i in 0 until s.length) {
        if (s.get(i) == '*') {
            stack.pop()
        } else {
            stack.push(s.get(i))
        }
    }

    return String(stack.toCharArray())
}