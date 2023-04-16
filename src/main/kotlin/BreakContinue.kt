/*
- bisa digunakan di semua perulangan kotlin
- break = untuk menghentikan sebuah perulangan
- continue = untuk menghentikan sebuah perulangan yg sdg berjalan, kemudian melanjutkan
ke perulangan selanjutnya
 */

fun main(){

    var i = 0
    while(true){
        println("break me ke $i")
        i++

        /* kalo misal langsung break dsni tanpa ada pengkondisian, maka kode hnya akan dieksekusi
        sebanyak 1x. jadi harus pake pengkondisian
         */

        if(i > 15){
            break // tidak akan mengeksekusi kode setelahnya
        }
    }


    for(value in 1..50){

        if(value % 2 != 0){
            continue // mengeksekusi kondisi sebaliknya
        }
        println(value)
    }
}