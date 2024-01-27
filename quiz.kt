//fungsi dengan return
fun barang(item : String):Int{
    return when (item){
    	"Meja" -> 2500000
        "Kursi" -> 1200000
        "IPAD Pro 2024" -> 19000000
        "Komputer" -> 38000000
        "Samsung Galaxy S24 Ultra" -> 25000000
        
        else -> 0
    } 
}

fun diskon(harga: Int, diskon: Double): Int{
    return (harga * diskon).toInt()
    
}
fun total(harga: Int, hargaDiskon: Int): Int{
    return (harga - hargaDiskon).toInt()
    
}

fun main() {
    val namaBarang = "Samsung Galaxy S24 Ultra"
    val diskon = 0.10
    val harga = barang(namaBarang)
    val hargaDiskon= if (harga>2000000) diskon(harga,diskon) else 0
    val hargaTotal = total(harga, hargaDiskon)
    println("|Barang yang anda beli adalah: \n------------------------------------------------------------- \n|Nama barang\t: $namaBarang \n|Harga Barang\t: Rp. $harga")
    println("|Diskon \t\t: Rp. $hargaDiskon")
    println("|Total Bayar \t: Rp. $hargaTotal")
    println("-------------------------------------------------------------")
    println("|Terima Kasih atas Pembelian Barang anda di Tempat Kami :)")
    
}
