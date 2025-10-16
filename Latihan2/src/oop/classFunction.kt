package oop

class MhsFunction(val nama : String){
    fun sayHello (){
        println("Selamat Malam $nama")
    }


  fun main(){
      val mhsPertama = MhsFunction(nama="Testing")

      mhsPertama.sayHello()

  }
}