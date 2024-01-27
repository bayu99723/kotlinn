//fungsi dengan return
fun barang(item : String):Int{
    return when (item){
    	"Gamis" -> 150000
        "Kaos" -> 50000
        "Kemeja" -> 700000
        "Celana" -> 120000
        "Kaos Dalam" -> 20000
        
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
    val namaBarang = "Gamis"
    val diskon = 0.05
    val harga = barang(namaBarang)
    val hargaDiskon= if (harga>100000) diskon(harga,diskon) else 0
    val hargaTotal = total(harga, hargaDiskon)
    println("Baju yang anda beli: \nNama barang\t: $namaBarang \nHarga Barang\t: Rp. $harga")
    println("Diskon \t\t: Rp. $hargaDiskon")
    println("Total Bayar \t: Rp. $hargaTotal")
    
}

