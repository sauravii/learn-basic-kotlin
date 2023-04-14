/*
OPERASI DALAM ARRAY
- size = untuk menentukan panjang array
- get(index) = mendapat data di posisi index / sama dengan function [index]
- set (index, value) = mengudah data di posisi index / sama dengan [index] = value

Array List = type data array yang datanya bisa kita inputkan dan hapus sendiri
 */


fun main() {

    // boleh null
    val names: Array<String?> = arrayOf("Sheren", "Azra", "Hilda")
    names.set(2, "Dewangga")
    names[0] = null
    println(names[2])
    println(names[0])

    // alternatif lain null
    val nilai: Array<Int?> = arrayOfNulls(3)
    // utk meng-set valuenya, jika dipanggil maka outputnya akan muncul valuenya
    nilai[0] = 10
    nilai[1] = 20
    nilai[2] = 30

    // apabila langsung ini tanpa di set valuenya, maka ouputnya null
    println(nilai[2])

    var nama: Array<String> = arrayOf("Jabriel", "Adit", "Mahesa")
    nama = arrayOf("Adit", "Mahesa")
    println(nama[0])


}