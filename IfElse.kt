/* Latihan IF ELSE menggunakan FUNCTION
 * fungsi if
 * if (kondisi){
 * statement
 * } else if (kondisi) {
 * statement
 * } else {
 * statement
 * }
 * 
 * 
 * fungsi keterangan lulus/ tidak lulus, nilai >= 80 lulus, kurang dari itu maka tidak lulus
 * fungsi predikat cukup/ baik / sangat baik, * cukup >=60 * baik >=75 * sangat baik >=85
 * 
*/

fun ket(nilai: Int){
    if (nilai >= 80 && nilai <=100){
        println("Keterangan LULUS")
    } else if (nilai >=0 && nilai <80) {
        println("Keterangan TIDAK LULUS")
    } else {
        println("Error")
    }
}

fun predikat(nilai: Int){
    if (nilai >= 85 && nilai <=100){
        println("Predikat Sangat Baik (A)")
    } else if (nilai >= 75 && nilai <85) {
        println("Predikat Baik (B)")  
    } else if (nilai >= 60 && nilai <75) {
        println("Predikat CUKUP (C)") 
    } else {
        println("Error")
    }
}
fun main(){
    ket(75)
    predikat(75)
 //   println("Udin mendapatkan keterangan dan Predikat")
}
