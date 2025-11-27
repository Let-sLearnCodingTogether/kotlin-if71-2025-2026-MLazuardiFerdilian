package FunctionalProgramming


fun operatorOnNumber(a : Int, b : Int, operation: (Int, Int)-> Unit){
    return operation(1,b)
}

fun main(){
    operatorOnNumber(1,3) {x,y ->println(x + y)}
    val result1 =  operatorOnNumber(1,3) {x ,y -> x * y}
    operatorOnNumber(1,3) {x ,y -> x * y}
}