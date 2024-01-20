//fungsi tanpa parameter
fun hello(){
    println("Kita sedang belajar Kotlin mengenal Fungsi")
}

//fungsi dengan parameter
fun pesan(nama: String){
    println("$nama sedang Belajar Kotlin")
}

//fungsi dengan return
fun hitung(a : Int, b: Double, c: Int): Double{
    return a * b + c  
}

fun main() {
    hello()
    pesan("Andi")
    //println(hitung(12,10.5,2))
    val hasil = hitung(12,10.5,2)
    println("Hasil Total dari nilai diatas adalah $hasil")
}

/*
*Kita sedang belajar Kotlin mengenal Fungsi
*Andi sedang Belajar Kotlin
*Hasil Total dari nilai diatas adalah 128.0
*/
