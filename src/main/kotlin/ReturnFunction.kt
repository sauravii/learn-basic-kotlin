// return function adalah function yang mengembalikan nilai. Kita harus memasukkan tipe data kembaliannya
fun sum(a: Int, b:Int): Int {
    val jumlah = a + b
    return jumlah
}

fun bagikan(a:Int, b:Int):Int{
    if(b == 0){
        return 0
    }else {
        val bagi = a / b
        return bagi
    }
}

fun fullName(firstName:String, lastName:String?):String {
    if(lastName == null){
        return ("Helloo bro $firstName")
    }else{
        val resultName = "Hello $firstName $lastName"
        return resultName
    }
}
// Note : baik di kondisi if/else, dua-duanya harus ada return


fun main() {
    // Note : return function harus memanggil functionnya di dalam sebuah parameter.
    println(sum(10,10))

    val result = sum(100,100)
    println(result)

    // apabila tidak dimasukkan dalam parameter, maka tidak akan muncul outputnya
    sum(5,5)

    println(bagikan(100,10))
    println(bagikan(100,0))

    println(fullName("Sheren", null))
    println(fullName("Sheren", "Vii"))

}