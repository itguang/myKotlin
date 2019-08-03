package 运算符重载及其他约定.解构声明和组件函数

data class NameComponents(val name: String, val extension: String)

fun main() {
    // 使用解构声明返回多个值
    val (name, extension) = splitFileName("hello.java")

    println("name=$name")
    println("extension=$extension")

    val map = mapOf<String, String>("Oracle" to "java", "JetBrains" to "kotlin")
    printMap(map)
}

fun splitFileName(fullName: String): NameComponents {
    val result = fullName.split(".", limit = 2)
    return NameComponents(result[0], result[1])
}

fun printMap(map: Map<String, String>) {
    for ((key, value) in map) {
        println("key=$key,value=$value")
    }
}