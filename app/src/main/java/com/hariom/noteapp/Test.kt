package com.hariom.noteapp


fun main() {
    val list = mutableListOf(6, 2, 3, 8) // 6, 2, 3, 8 - 2,3,4,5,6,7,8 = 3

    println(solution(list))  // 3,6
}

fun solution(statues: MutableList<Int>): Int {
    statues.sort()
    var count = 0
    for (index in statues.indices){
        var nextVal = statues[index] + 1
        if (index+1 < statues.size){
            var loopLimit = statues[index+1]
            for (next in nextVal until loopLimit){
                println("$next")
                count++
            }

        }
    }


    return count
}