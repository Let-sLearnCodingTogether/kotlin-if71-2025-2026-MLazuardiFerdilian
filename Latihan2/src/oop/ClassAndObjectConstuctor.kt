package oop

class MahasiswaConstructorDefaultValue(
    val npm : String,
    val nama : String,
    var ipk: Float =0.0f
){
    init {
        println("Ini block init")
    }
}
fun main() {


    val mahasiswaPertama = MahasiswaConstructorDefaultValue(
        npm ="2226250031" ,
        "M Lazuardi Ferdilian"

    )
    val mahasiswaKedua = MahasiswaConstructorDefaultValue(
        npm = "2226250033",
        nama = "Zuuu",
        ipk= 1.0f
    )
    println(mahasiswaPertama)
    println(mahasiswaKedua)

}
