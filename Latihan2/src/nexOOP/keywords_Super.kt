package nexOOP

open class HewanBaru{
    open fun suara(){
        println("Suara Hewan")
    }
}

class Bebek(): HewanBaru(){
    override fun suara() {
        super.suara()
        println("Suara Bebek : Kwek Kwek")
    }
}
fun main(){
    val bebek = Bebek()
    bebek.suara()
}