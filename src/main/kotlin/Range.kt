/*
OPERASI DALAM RANGE
- count() = mendapatkan total data di range
- contains(value) = mengecek apakah ada nilai tersebut
- first = mendapatkan nilai pertama
- last = mendapatkan nilai terakhir
- step = mendapatkan nilai tiap kenaikan

rangeTo = untuk range naik
downTo = untuk range turun

in = untuk memeriksa apakah ada di dalam cakupan range
!in = untuk memeriksa apakah tidak ada di dalam cakupan range
 */

fun main(){

    val OneToTen = 1.rangeTo(10)
    OneToTen.forEach {
        print("$it")
    }

    println(OneToTen.step)

    val range = 1.rangeTo(100)
    println(range.count())
    println(range.contains(250))
    println(range.contains(10))
    println(range.first)
    println(range.last)
    println(range.step)

    val downTo = 10.downTo(1)
    val default = 7
    if(default in downTo){
        println("Value $default is in range downTo")
    }else {
        println("Value $default isn't in range downTo")
    }
}