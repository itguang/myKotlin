package 运算符重载及其他约定

data class Point(var x: Int, var y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}