package org.example.datastructures

class LinkedList<T> {

    private var head: Node<T>? = null
    public var lenght: Int = 0
        private set

    fun prepend(t: T): LinkedList<T> {
        lenght++
        val newHead = Node(t, 0, next = head)
        head = newHead

        return this
    }

    fun append(t: T) {
        traverseTo(lenght - 1)?.next = Node(t, lenght - 1, null)
        lenght++
    }

    fun traverseTo(index: Int):Node<T>? {
        var currentIndex = 0
        var currentNode = head
        while (currentIndex != index) {
            currentIndex++
            currentNode = currentNode?.next
        }

        return currentNode
    }

    fun remove(index: Int) {
        if (index == 0) {
            head = head?.next
        }
        else {
            val traverseNode = traverseTo(index - 1)
            val removableNode = traverseNode?.next
            val nextNode = removableNode?.next
            traverseNode?.next = nextNode
        }
        lenght--

    }

    fun reverse() : LinkedList<T> {
        val list = LinkedList<T>()
        var currentNode = head
        while (currentNode != null) {
            list.prepend(currentNode.t)
            currentNode = currentNode.next
        }

        return list
    }

    fun printValues() {
        var next = head

        val stringBuilder = StringBuilder()
        stringBuilder.append("[")
        while (next != null) {
            stringBuilder.append(next.t)

            next = next.next
            if (next != null) {
                stringBuilder.append(", ")
            }
        }

        stringBuilder.append("]")
        println("newArray: ${stringBuilder.toString()}")
    }


    data class Node<T>(val t: T, var index: Int, var next: Node<T>?)

}