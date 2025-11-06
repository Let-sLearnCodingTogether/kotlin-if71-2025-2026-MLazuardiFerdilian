package nexOOP

open class Pegawai(val nama: String,val Gaji_dasar: Double)
{
    open fun hitungGaji()
    {
        val gaji= Gaji_dasar*30
        println("Nama Anda adalah $nama")
        println("Gaji anda adalah $gaji")
    }
}
open class Manager(nama: String,Gaji_dasar: Double): Pegawai(nama,Gaji_dasar)
{
    override fun hitungGaji() {
        super.hitungGaji()
    }
}
open class Programmer(nama: String,Gaji_dasar: Double): Pegawai(nama,Gaji_dasar)
{
    override fun hitungGaji() {
        super.hitungGaji()
    }
}

fun main() {
    Programmer("Dawi",900000.00).hitungGaji()
    Manager("Zhu",1000000000.00).hitungGaji()
}