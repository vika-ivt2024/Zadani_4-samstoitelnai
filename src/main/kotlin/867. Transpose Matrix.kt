package org.example

fun main(args: Array<String>) {
    var matrix = arrayOf( arrayOf(2,4,-1),arrayOf(-10,5,11),arrayOf(18,-7,6) )

    val nuw = Array(matrix[0].size) { Array(matrix[0].size) { 0 } }

    println("Оргинал:")
    for (row in matrix) {
        println(row.contentToString())
    }

    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[0].size) {
            nuw[j][i] = matrix[i][j]
        }
    }

    println("Трансформированый:")
    for (row in nuw) {
        println(row.contentToString())
    }
}