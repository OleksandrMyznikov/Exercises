package org.example.datastructures

import java.util.ArrayList

class HashTable<K, V>(private val size: Int = 50) {
    val array: MutableList<Bucket<K,V>> = ArrayList(size)

    fun _hash(k: K): Int {
        return k.hashCode() % array.size
    }

    fun put(key: K, value: V) {
        val _hash = _hash(key)

        var bucket = array[_hash]
        if (bucket == null) {
            bucket = Bucket(key, mutableListOf())
            array[_hash] = bucket
        }
        bucket.list.add(Pair(key, value))
    }

    fun get(key: K): V? {
        val _hash = _hash(key)
        val bucket = array.get(_hash)
        bucket.list.forEach { item->
            if (item.first == key) {
                return item.second
            }
        }

        return null

    }

    class Bucket<K, V>(val key: K, val list: MutableList<Pair<K, V>>) {


    }
}