package org.example.datastructures

import java.util.ArrayList

class StackArray<T> {
    val myStack = ArrayList<T>()
    var lenght = 0
        private set

    fun peek(): T {
        return myStack[lenght - 1]
    }

    fun push(t: T) {
        myStack.add(t)
        lenght++
    }

    fun pop(): T {
        val last = myStack.removeAt(lenght - 1)
        lenght--
        return last
    }
}