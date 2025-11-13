package nexOOP

interface SpaceVehicle{
    fun accelerate()

    fun stop(){
        println("Stop")

    }
}
class LightSpace : SpaceVehicle{
    override fun accelerate() {

    }

    override fun stop() {
        println("Accelerate")
    }
}
fun main (){
    val LightSpaceOne = LightSpace()

    LightSpaceOne.stop()
}