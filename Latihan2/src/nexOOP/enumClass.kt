package nexOOP

enum class DayOfTheWeek {
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu,
    Minggu
}

fun main(){
    val days = DayOfTheWeek.values()

    days.forEach {
        println("${it.ordinal}.${it.name}")
    }
    println(DayOfTheWeek.valueOf("Senin"))
   // println(DayOfTheWeek.valueOf("senin"))

    val today = DayOfTheWeek.valueOf("Senin")

    when(today){
        DayOfTheWeek.Senin -> println("Yah, Senin Lagi")
        DayOfTheWeek.Selasa -> println("Hari selasa")
        DayOfTheWeek.Sabtu, DayOfTheWeek.Minggu -> println("Hari Libur")
        else -> println("Hari lain")
    }
}