package 高阶函数.函数类型

fun main() {

    println(sum(1, 2))
    println()

}

// 定义一个函数: 两个Int类型参数,一个Int型返回值
val sum: (Int, Int) -> Int = { x, y -> x + y } // 显示声明一个函数类型
// 给变量起名字
val sum2: (one: Int, two: Int) -> Int = { one, two -> one + two }
val mysum = { x: Int, y: Int -> x + y } // 隐式声明一个函数类型

val canRuturnNull: () -> Int? = { null }

// 无参数无返回值的函数
val action: () -> Unit = { println("hello") }