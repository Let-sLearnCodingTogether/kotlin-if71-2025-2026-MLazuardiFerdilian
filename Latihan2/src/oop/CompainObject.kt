package oop

class Kalkulator{
    companion object{
        fun tambah(a : Int,b:Int) : Int{
            return a+b
        }
    }
}
fun main(){
    println(Kalkulator.tambah(a=5,b=2))
}