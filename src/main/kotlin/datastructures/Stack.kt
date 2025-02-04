package org.example.datastructures

class Stack<T> {

    private var top: Node<T>? = null
    private var bottom: Node<T>? = null
    private var length = 0

    fun peek(): T? {
        return top?.value
    }

    fun push(value: T) {
        val newNode = Node(value)
        if (this.length == 0) {
            top = newNode
            bottom = newNode
            length = 1
        } else {
            newNode.next = top
            top = newNode
        }

        length++
    }

    fun pop() : T? {
        val node = top
        if (node != null) {
            top = node.next
        }
        length--
        if (this.top == this.bottom) {
            bottom = null
        }

        return node?.value
    }

    fun isEmpty(): Boolean {
        return length == 0
    }


    data class Node<T>(var value: T, var next: Node<T>? = null)
}