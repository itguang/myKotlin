package 运算符重载及其他约定


data class Rectangele(val left: Point, val right: Point) {
}

operator fun Rectangele.contains(p: Point): Boolean {
    return p.x in left.x until right.x && p.y in left.y until right.y
}

fun main() {
    val rectangele = Rectangele(Point(0, 0), Point(10, 10))

    println(Point(5, 5) in rectangele)
    println(Point(10,11) in rectangele)

}