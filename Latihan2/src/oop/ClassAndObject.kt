package oop

class MahasiswaConstructor(
    val npm :String,
    val nama: String,
    var ipk : Float
)
fun main(){
    val mahasiswaPertama = MahasiswaConstructor(
        npm ="2226250031",
        nama ="M Lazuardi Ferdilian",
        ipk = 2.6f
    )
    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk=2.6f
    println(mahasiswaPertama.ipk)
}