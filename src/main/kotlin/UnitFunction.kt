// function without return, and get data from outside (Unit)
fun setUser(firstName: String, lastName:String? ,age: Int?) {
    if(age == null || lastName == null){
        println("Helloww $firstName")
    }else {
        println("Hellow $firstName, your age is $age")
    }
}

/*
    FUNCTION DEFAULT PARAMETER adalah
    function yang mempunyai parameter default. Maka dari itu, kita tidak wajib
    untuk memasukkan data ke dalam parameter yang mempunyai nilai default.
    Sebaliknya, apabila kita memasukkan data maka data tersebut yang akan ditampilkan di output
*/
fun sayHello (nameUser:String, ageUser: Int = 20){
    if(ageUser != 20){
        println("Helloww $nameUser your age is $ageUser")
    }else {
        println("Helloww $nameUser your age is $ageUser")
    }
}
/*
    FUNCTION NAMED ARGUMENT adalah
    function yang kita tidak perlu memasukkan data secara urut. Ini merupakan
    fitur dimana kita bisa menyebutkan nama parameter saat memanggil function,
    dengan demikian kita tidak wajib tahu posisi tiap parameter
*/
fun fullName (first: String,
              middle:String,
              last:String){
    println("Helloowww your name is $first $middle $last")
}


fun main(){
    setUser("sheren", null, null)

    //  default parameter
    sayHello("dewanggaa", 18)
    sayHello("dewangga zindagi")

    // named argument
    fullName(middle="Aura",
        first = "sheren",
        last="vi")
}



