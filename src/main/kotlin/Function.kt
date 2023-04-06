// function without return, and get data from outside
fun setUser(firstName: String, lastName:String? ,age: Int?) {
    if(age == null || lastName == null){
        println("Helloww $firstName")
    }else {
        println("Hellow $firstName, your age is $age")
    }
}

// function default parameter
fun sayHello (nameUser:String, ageUser: Int = 20){
    if(ageUser != 20){
        println("Helloww $nameUser your age is $ageUser")
    }else {
        println("Helloww $nameUser your age is $ageUser")
    }
}

fun main(){
    setUser("sheren", null, null)
    sayHello("dewanggaa", 18)
    sayHello("dewangga zindagi")
}



