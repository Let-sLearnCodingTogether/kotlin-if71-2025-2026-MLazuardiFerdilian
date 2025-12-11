package LinkedList

data class Node<T : Any>(
    var value: T, var next: Node<T>?=null){
    override fun toString(): String {
        return  if (next == null){
            "$value"
        } else{
            "$value -> ${next.toString()}"
        }
    }
}

class LinkedListIterator<T : Any>(private val list: ListIterator<T>) : Iterator<T>{
    private var index = 0
    private var lastNode : Node<T>?=null
    override fun next(): T {
        TODO("Not yet implemented")
    }

    override fun hasNext(): Boolean {
        TODO("Not yet implemented")
    }
}

class LinkedList<T : Any> {
    private var head:Node<T>?= null
    private var tail: Node<T>?=null

    fun push(value :T) : LinkedList<T>=apply{
        head
    }
}

fun main() {
    println("Test Node data class")
    val node1 = Node(12)
    val node2 = Node(1)
    val node3 = Node(3)

    node1.next = node2
    node2.next = node3

    print(node1)
    println("---------------")
}