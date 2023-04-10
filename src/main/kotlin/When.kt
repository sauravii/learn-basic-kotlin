fun main(){
    // kondisi pertama
    val nilai = 'A'
    when(nilai){
        'A' -> println("Amazing")
        'B' -> println("Cool")
        'C' -> println("Not Bad")
        else -> println("Try Again")
    }

    // multiple condition
    when(nilai){
        'A', 'B', 'C' -> println("Selamat anda lulus")
        else -> println("Try Again")
    }

    // when in (ini lebih simple, pake array)
    val finalExam = 'E'
    val passExam = arrayOf('A', 'B', 'C')
    when(finalExam){
        in passExam -> println("Anda dinyatakan lulus")
        !in passExam -> println("Coba lagi")
    }

    // when is (untuk mengecek tipe data)
    val nama = "Sheren"
    when(nama){
        is String -> println("Ini adalah String")
        !is String -> println("Ini bukan String")
    }

    // when dengan tidak berpacu pada 1 variable
    val examValue = 90
    when {
        examValue > 90 -> println("Good Job")
        examValue == 90 -> println("Nice")
        else -> println("Try Again")
    }
}