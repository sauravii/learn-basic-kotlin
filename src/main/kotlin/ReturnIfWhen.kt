fun main(){

    fun sayHello(name: String = ""): String{
        // return if
        return if (name == ""){
            "Hello bro"
        }else {
            "Hello $name"
        }
    }

    val result = sayHello("Dimas")
    println(result)

    when(result){
        is String -> println("Ini adalah String")
        !is String -> println("Ini bukan String")
    }

}