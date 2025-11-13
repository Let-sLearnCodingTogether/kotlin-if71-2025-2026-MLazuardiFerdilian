package nextOOP

interface Electronic {
    val brand: String

    fun turnOn()
    fun turnOff()

    fun cleanDevice() =
        println("Membersihkan debu dari perangkat ($brand)")

}

class Fan(override val brand: String) : Electronic {
    override fun turnOn() {
        println("Kipas angin merk $brand berputar")
    }

    override fun turnOff() {
        println("Kipas angin merk $brand berhenti")
    }
}

class SmartLight(override val brand: String) : Electronic {
    override fun turnOn() {
        println("Kipas otomatis merk $brand berputar")
    }

    override fun turnOff() {
        println("Kipas otomatis merk $brand berhenti")
    }
}

fun main() {
    val fan = Fan("masspion")
    fan.turnOn()
    fan.turnOff()
    fan.cleanDevice()

    println()

    val smartLight = SmartLight("maspion")
    smartLight.turnOn()
    smartLight.turnOff()
    smartLight.cleanDevice()

}