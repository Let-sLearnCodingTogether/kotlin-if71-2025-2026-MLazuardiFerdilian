interface Kendaraan{
    fun accelerate()
    fun stop()
}
class Motor : Kendaraan{
    override fun accelerate() {
        println("accelerate")
    }

    override fun stop() {
        println("Stop")
    }

}

fun main() {
    val motor=Motor()
    motor.accelerate()
    motor.stop()
}