package org.example.datastructures

class DoubleLinkedList<T> {

    var head: Node<T>? = null
    var tail: Node<T>? = null
    var lenght = 0
        private set


    fun append(t: T) {
        val newNode = Node(t, null, null)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            newNode.previous = tail
            tail?.next = newNode
            tail = newNode
        }
        lenght++
    }

    fun prepend(t: T) {
        val newNode = Node(t, null, null)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            newNode.next = head
            head?.previous = newNode
            head = newNode
        }
        lenght++
    }


    data class Node<T>(
        val value: T,
        var next: Node<T>? = null,
        var previous: Node<T>? = null
    )
}