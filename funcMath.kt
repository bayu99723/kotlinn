fun jumlah(nilaia: Int, nilaib: Int) :Int {
    return nilaia + nilaib
}
fun kurang(nilaia: Int, nilaib: Int) :Int {
    return nilaia - nilaib
}
fun kali(nilaia: Int, nilaib: Int) :Int {
    return nilaia * nilaib
}
fun bagi(nilaia: Int, nilaib: Int) :Int {
    return nilaia / nilaib
}
fun segitiga(nilaia: Int, nilaib: Int) :Double {
    return 0.5* nilaia * nilaib
}
fun persegi(nilaia: Int, nilaib: Int, nilaic: Int) :Int {
    return nilaia * nilaib * nilaic
}

fun main() {
    val newJumlah = jumlah(10,23)
    println("Ini adalah hasil penjumlahan $newJumlah")
    val newKurang = kurang(10,23)
    println("Ini adalah hasil pengurangan $newKurang")
    val newKali = kali(10,23)
    println("Ini adalah hasil penjumlahan $newKali")
    val newBagi = bagi(10,23)
    println("Ini adalah hasil penjumlahan $newBagi")
    val lSegitiga = segitiga(10,5)
    println("Ini adalah hasil Luas Segitiga $lSegitiga")
    val lPersegi = persegi(10,5,3)
    println("Ini adalah hasil Luas Persegi $lPersegi")
}
