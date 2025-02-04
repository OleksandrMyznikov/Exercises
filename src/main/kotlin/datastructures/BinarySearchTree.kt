package org.example.datastructures

import java.util.LinkedList
import java.util.Queue

class BinarySearchTree<T> where T : Comparable<in T>{

    data class Node<T>(val value: T, var right: Node<T>? = null, var left: Node<T>? = null)

    var root: Node<T>? = null

    fun insert(value: T): BinarySearchTree<T> {
        val newNode = Node<T>(value)
        if (root == null) {
            root = newNode
            return this
        } else {
            var currentNode = root
            while (true) {
                if (value < currentNode!!.value) {
                    //Left
                    if (currentNode.left == null) {
                        currentNode.left = newNode
                        return this
                    }
                    currentNode = currentNode.left
                } else if (value > currentNode!!.value) {
                    if (currentNode.right == null) {
                        currentNode.right = newNode
                        return this
                    }
                    currentNode = currentNode.right
                } else {
                    return this
                }
            }
        }
    }

    fun lookup(value: T): Boolean {
        if (root == null) {
            return false
        }
        var currentNode = root
        while (currentNode != null) {
            if (value < currentNode.value) {
                currentNode = currentNode.left
            } else if (value > currentNode.value) {
                currentNode = currentNode.right
            } else if (currentNode.value == value){
                return true
            }
        }

        return false
    }

    fun remove(value: T) {

    }

    fun breadthFirstSearch() : List<T> {
        val result = mutableListOf<T>()
        val queue: Queue<Node<T>> = LinkedList()
        queue.add(root)
        while (queue.size > 0) {
            val node = queue.poll()
            result.add(node.value)

            if (node.left != null) {
                queue.add(node.left)
            }
            if (node.right != null) {
                queue.add(node.right)
            }
        }

        return result
    }

    fun breadthFirstSearchR(queue: Queue<Node<T>> = LinkedList(), list: MutableList<T> = mutableListOf()) {
        if (queue.isEmpty()) {
            return
        }
    }

}

fun main() {
    val tree = BinarySearchTree<Int>().apply {
        insert(9)
        insert(4)
        insert(6)
        insert(20)
        insert(170)
        insert(15)
        insert(1)
    }

    println(tree.breadthFirstSearch())

}