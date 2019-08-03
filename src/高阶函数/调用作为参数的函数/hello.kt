package 高阶函数.调用作为参数的函数

fun main() {

    twoAndThree { x, y -> x + y }

    val hello = "hello 123 world"
    val result = hello.myFilter { c: Char -> c in 'a'..'z' }
    println("result=$result")


}

// 调用作为参数的函数和调用普通函数是一样的:
// 把括号放在函数名后,把参数放在括号内
fun twoAndThree(myOperate: (Int, Int) -> Int) {
    val result = myOperate(2, 3)
    println("result=$result")

}

fun myTwoAndThree(x: Int, y: Int): Int {
    return x + y;
}

// 实现 String 的myFilter函数

/*
fun String.myFilter():String{

    return ""
}
*/

// myFilter 参数为一个函数

fun String.myFilter(myPredicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until this.length) {
        val char = this.get(index)
        if (myPredicate(char)) {
            sb.append(char)
        }
    }
    return sb.toString();
}

// 函数类型的参数的默认值和 null 值

fun <T> Collection<T>.myJoinToString(
    separator: String = ",",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() }
): String {
    val sb = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            sb.append(separator)
        }
        sb.append(transform(element))
    }
    sb.append(postfix)
    return sb.toString()

}
