package org.example.datastructures

class Graph {
    var numberOfNodes = 0
    var adjacentList = mutableMapOf<Char, MutableSet<Char>>()

    fun addVertex(node: Char) {
        adjacentList[node] = mutableSetOf()
        numberOfNodes++
    }

    fun addEdge(node1: Char, node2: Char) {
        if (adjacentList[node1] == null || adjacentList[node2] == null) {
            throw IllegalArgumentException("There is no $node1 and/or $node2 vertexes")
        }
        adjacentList[node1]!!.add(node2)
        adjacentList[node2]!!.add(node1)
    }

    fun showConnections() : String {
        val builder = StringBuilder();
        adjacentList.forEach { vertex, connections ->
            builder.append("$vertex --> ")
            connections.forEach { builder.append(" $it") }
            builder.append("\n")
        }

        return builder.toString()
    }

}