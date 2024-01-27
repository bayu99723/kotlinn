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

fun main() {
    val namaBarang = "Kaos"
    val harga = barang(namaBarang)
    println("Baju yang anda beli $namaBarang harganya adalah Rp. $harga")
    
}
