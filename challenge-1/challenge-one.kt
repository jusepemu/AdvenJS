fun findFirstRepeated(gifts: List<Int>): Int {
    val uniqueGifts = mutableSetOf<Int>()
    
    gifts.forEach {
        if(uniqueGifts.contains(it)) return it
        
        uniqueGifts.add(it)
    }
    
    return -1
}

fun main() {
    val gifts = listOf(2, 1, 3, 5, 3, 2)

	println(findFirstRepeated(gifts))
}