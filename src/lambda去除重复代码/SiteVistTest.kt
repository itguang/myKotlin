package lambda去除重复代码

fun main() {
    val siteVisits = listOf<SiteVisit>(
        SiteVisit("/login", 0.12, OS.ANDROID),
        SiteVisit("/login", 0.12, OS.WINDOWS),
        SiteVisit("/logout", 0.23, OS.IOS),
        SiteVisit("/index", 0.01, OS.LINUX),
        SiteVisit("/index", 0.01, OS.MAC),
        SiteVisit("/index", 0.01, OS.WINDOWS),
        SiteVisit("/admin", 0.02, OS.MAC)
    )

    averageWINDOWSDuration(siteVisits)
    val MAC = siteVisits.averageDurationFor(OS.MAC)
    println("计算来自MAC 用户的访问平均时间:$MAC")

    val averageDurationFor = siteVisits.averageDurationFor { siteVisit ->
        siteVisit.os == OS.MAC
                && siteVisit.path == "/admin"
    }
    println("使用高阶函数去除重复代码:$averageDurationFor")


}

// 显示 windows 机器的平均访问时间
fun averageWINDOWSDuration(siteVisits: List<SiteVisit>) {
    val average = siteVisits.filter { it.os == OS.WINDOWS }
        .map { siteVisit -> siteVisit.duration }
        .average()
    println("显示 windows 机器的平均访问时间 average=$average")
}

// 计算来自MAC 用户的访问平均时间,为避免重复,使用 lambda 抽取重复代码
fun List<SiteVisit>.averageDurationFor(os: OS) =
    this.filter { it.os == os }
        .map(SiteVisit::duration)
        .average()

// 使用高阶函数去除重复代码
fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
    this.filter(predicate).map(SiteVisit::duration).average()
