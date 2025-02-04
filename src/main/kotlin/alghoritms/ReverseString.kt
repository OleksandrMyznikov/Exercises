package org.example.alghoritms
//0,1,2,3,4,5
//y o d a a a
fun reverseString(input: String):String {
    val output = input.toCharArray()
    for (i in 0 ..<input.length / 2) {
        val swap = output[i]
        output[i] = output[input.length -1 - i]
        output[input.length - 1 - i] = swap
    }
    return String(output)
}

//0,1,2,3,4,5
//y o d a a a
fun reverseStringRecursive(input: String) : String {

    val charArray = input.toCharArray()
    splitCharacters(charArray)
    return String(charArray)
}

fun reverseStringRecursive1(input: String): String {
    if (input == "") return ""
    return reverseStringRecursive(input.substring(1)) + input.get(0)
}

fun splitCharacters(input: CharArray, index: Int = 0) {
    if (index > input.size / 2) return
    val swap = input[index]
    val endIndex = input.size - 1 - index
    input[index] = input[endIndex]
    input[endIndex] = swap
    splitCharacters(input, index + 1)
}