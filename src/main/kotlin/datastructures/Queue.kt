package org.example.datastructures

class Queue<T> {

    var first: Node<T>? = null
    var last: Node<T>? = null
    var length = 0


    data class Node<T>(val t: T, var next: Node<T>? = null)

    fun peek(): T? {
        return first?.t
    }

    fun enqueue(value : T): Queue<T> {
        val newNode = Node(value)
        if (this.length == 0) {
            this.first = newNode
            this.last = newNode
        } else {
            this.last?.next = newNode
            this.last = newNode
        }

        length++
        return this
    }

    fun dequeue(): Queue<T>? {
        if (this.first == null) {
            return null
        }
        if (this.first == this.last) {
            this.last = null
        }
        this.first = this.first?.next
        this.length--
        return this
    }

}