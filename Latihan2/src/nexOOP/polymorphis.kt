package nexOOP


open class Kendaraan()
{
    open fun klakson()
    {
        println("Suara Klakson")
    }
}
class Mobil(): Kendaraan()
{
    override fun klakson() {
        super.klakson()
        println("Klakson Mobil")
    }
}
class Motor(): Kendaraan()
{
    override fun klakson() {
        super.klakson()
        println("Klakson Motor")
    }
}

fun main() {
    Motor().klakson()
    Mobil().klakson()
}