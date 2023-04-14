


fun main(){

    fun sayHello(name: String = ""): String{
        // return when
       return when (name){
           "" -> "Hello Bro"
           else -> "Hello $name"
       }

        // return if
        return if (name == ""){
            "Hello broooo"
        }else {
            "Hello mbak $name"
        }

        // Note : Ini tidak ada perintah printnya krn sudah pake return, jadi langsung eksekusi string
    }

    val result = sayHello("Sheren")
    println(result)

    when(result){
        is String -> println("Ini adalah String")
        !is String -> println("Ini bukan String")
    }



}