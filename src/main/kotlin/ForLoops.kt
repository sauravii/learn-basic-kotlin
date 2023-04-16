/*
perulangan untuk data iterator
 */

fun main(){
    val names = arrayOf("Sheren", "Aura", "Vi")
    for(name in names){
        println("your name is $name") // manggilnya pke nama variabel for nya
    }

    var total = 0
    for(i in 100.downTo(0) step 5){
        println(i)
        total++
    }
    println("total perulangan = $total")

    var array = arrayOf("Sheren", "Aura", "VI")
    val ukuranArray = array.size - 1
    for(i in 0..ukuranArray){
        println("index $i = ${array.get(i)}")
    }
}