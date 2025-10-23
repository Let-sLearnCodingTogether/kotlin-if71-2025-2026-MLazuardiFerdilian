package oop

class TraskipNilai {
    val list : List<Char> by lazy {
        println("List di akses ")
        listOf()
    }
}