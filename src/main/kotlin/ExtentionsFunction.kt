// extention function adalah  kemampuan menambahkan function pada tipe data yang sudah ada

fun String.hello(): String = "Hellooo $this"

fun String.sayHello():Unit = println("hellooo $this")
fun main(){
    val name = "sheren"
    println(name.hello())

    "sherennn".sayHello()
}