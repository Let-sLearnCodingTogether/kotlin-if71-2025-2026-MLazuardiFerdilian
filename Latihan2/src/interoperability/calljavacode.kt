package interoperability

fun main(){
    val user1 = userclass()

    user1.name="user1"

    println(user1.name)

    val counter1 = counterClass()
    counter1.increment()

    println(counter1.number)
    }
