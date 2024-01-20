fun lulus(nama: String, mtk: Int, bing: Int, bind: Int, pkn: Int, ket:String) :String{
    return "Siswa bernama $nama dengan deskripsi nilai berikut: \nNilai Math \t:$mtk \nNilai B. Ing \t:$bing \nNilai B.Ind \t:$bind \nNilai PKN \t:$pkn \nDinyatakan \t$ket"
}

fun main() {
	val kelulusan = lulus("Udin", 80, 90, 100, 75, "LULUS")
    print(kelulusan)
}
