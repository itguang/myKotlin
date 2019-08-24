package 泛型.泛型函数和属性

import java.lang.IllegalArgumentException

fun main() {

    val list = listOf<Int>(1, 2, 3)
    val set = setOf<Int>(1, 2, 3)
//    printSum(set)

    myprintSum(list)

}


fun printSum(c: Collection<*>) {
    val list = c as? List<Int> ?: throw IllegalArgumentException(" List is excepted")
    println(list.sum())
}

fun myprintSum(c: Collection<Int>) {
    if (c is Collection<Int>){
        println(c.sum())
    }

}