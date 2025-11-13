package nexOOP

interface moveA {
    fun move(){
        println("Move A")
    }
}
interface moveB{
    fun move(){
        println("Move B")
    }
}

class Human : moveA, moveB{
    override fun move() {
        super<nexOOP.moveA>.move()
        super<nexOOP.moveB>.move()
    }

}

fun main (){
    val human = Human()
    human.move()
}