/*
blok kodenya dijalankan dulu, baru dicek kondisinya (kebalikan while loops)

yang membedakan dg while loops adalah dsni apabila kondisinya salah, maka blok kode akan dijalankan
at least hanya sekali. sedangkan di while loops apabila kondisinya salah maka blok kode tidak akan
dijalankan
 */

fun main(){
    var i = 1

    do{
        println("Ini adalah perulangan ke $i")
        i++
    }while (i < 10)

    
}