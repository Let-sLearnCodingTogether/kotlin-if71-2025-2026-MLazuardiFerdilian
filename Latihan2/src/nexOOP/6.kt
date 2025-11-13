package nexOOP

interface PaymentMethod{
    fun pay()
}

interface RefundMethod : PaymentMethod{
    fun refund()
}
class Bank : RefundMethod{
    override fun refund() {
        println("Refund")
    }

    override fun pay() {
         println("pay")
    }

}
fun main(){
    val bankA = Bank()
    bankA.pay()
    bankA.refund()
}