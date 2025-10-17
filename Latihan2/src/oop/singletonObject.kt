package oop

object DatabaseConnection{
    fun connect(){
        println("Connecting to database")
    }
    fun disconnect(){
        println("Disconnecting from databse")
    }
    fun main(){
        DatabaseConnection.connect()
        DatabaseConnection.disconnect()
    }
}