/*
merupakan pengulangan yang melakukan pengecekan kondisi (wajib ada kondisi)
selama true = blok kode looping akan terus dijalankan
apabila false = blok kode akan berhenti dijalankan
 */

fun main(){
    var awal = 0
    while(awal < 10){
        println("Ini perulangan ke $awal")
        awal++
    }
    println("total perulangan = $awal")
}