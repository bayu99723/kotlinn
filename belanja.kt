//fungsi dengan return
fun barang(item : String):Int{
    return when (item){
    	"Baju" -> 100000
        else -> 0
    } 
}

fun main() {
    
    val harga = barang("Baju")
    println(harga)
}
