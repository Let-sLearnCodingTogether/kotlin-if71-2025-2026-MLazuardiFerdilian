package oop

class MhsThisKeyword(val nama: String){
    fun sayGoodBye( nama : String){
        println("$nama : ${this.nama}")
    }
}
fun main(){
    val mhsPertama= MhsThisKeyword(
        nama = "Mahasiswa Pertama"
    )
    mhsPertama.sayGoodBye(nama ="Mahasiswa1")
}