package oop


class Player(val name: String) {
    var health: Int = 100
    var level: Int = 1


    fun takeDamage(damage: Int) {
        health -= damage
        if (health < 0) {
            health = 0
        }
        println("$name terkena serangan sebesar $damage poin!")
    }


    fun levelUp() {
        level += 1
        health = 100
        println("$name naik level! Sekarang levelnya adalah $level.")
    }


    fun showStatus() {
        println("Nama: $name | Level: $level | Health: $health")
    }
}


fun main() {
    val player = Player("Lazuardi")

    player.showStatus()
    player.takeDamage(300)
    player.showStatus()
    player.levelUp()
    player.showStatus()
}
