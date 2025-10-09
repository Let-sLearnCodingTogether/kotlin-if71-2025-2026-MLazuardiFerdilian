fun main() {
    val daftarMahasiswa1 = listOf(
        Pair("Lazu",3.8),
        Pair("Dawi",3.9),
        Pair("liv",4.0)
    )
    for (a in daftarMahasiswa1)
    {
        if(a.second>3.5)
        {
            println("Nama: ${a.first}")
        }
       }
    val b=daftarMahasiswa1
        .filter{it.second>3.5}
        .map{it.first}
}