fun hitungTotal(name:String, vararg angka:Int): String {
    var total = 0

    for(value in angka){
        total += value
    }

    // hasil outputnya tetep pake ini yaa
    return ("Helloo $name your result is" + " " +total)
}

fun main(){
    // ini sebagai media untuk memasukkan data ke dalam parameternya
    println(hitungTotal("Auraaa", 20,20,20))
}