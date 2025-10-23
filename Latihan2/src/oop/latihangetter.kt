package oop

class PersegiPanjang(val panjang: Double, val lebar: Double) {
    val luas: Double
        get() = panjang * lebar
}

class Mhs {
    var ipk: Double = 0.0
        set(value) {
            field = when {
                value < 0.0 -> 0.0
                value > 4.0 -> 4.0
                else -> value
            }
        }
}

fun main() {
    val panjang = PersegiPanjang(6.0, 5.0)
    println("Luas persegi panjang: ${panjang.luas}")

    val mhs = Mhs()
    mhs.ipk = 5.0
    println("IPK mahasiswa: ${mhs.ipk}")

    mhs.ipk = -2.0
    println("IPK mahasiswa: ${mhs.ipk}")

    mhs.ipk = 3.2
    println("IPK mahasiswa: ${mhs.ipk}")
}