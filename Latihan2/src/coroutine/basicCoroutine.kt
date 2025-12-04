package coroutine
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main()= runBlocking{
    println("Aplikasi dimulai")

    login()

    println("Pindah halaman dari login, Ke Home")
}

suspend fun login(){
    println("Melakukan validasi email & Password")
    delay(2_000)
    println("Validasi sukses")

}