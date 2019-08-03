package 运算符重载及其他约定

fun main() {
    // 使用扩展函数重载运算符
    val person = Person("itguang", 1)
    val xr = Person("xingren", 2)

    val two = person + xr
    println(two.toString())

    println(xr - person)
}

operator fun Person.plus(other: Person): Person {
    return Person(this.name + "," + other.name, this.age + other.age)
}

operator fun Person.minus(other: Person): Int {
    return this.age - other.age
}

fun sum(a:Int,b:Int):Int{
    return a+b;
}