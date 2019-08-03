import 运算符重载及其他约定.Point

fun main() {

    val point = Point(1, 1)
    val point1 = Point(1, 1)

    val result = point + point1

    println(result.toString())

    val list = listOf<Int>(1, 2, 3)

    list.filter { it > 2 }
        .map { println() }
}