fun manufacture(gifts: List<String>, materials: String): List<String> {
    return gifts.filter { gift ->
        gift.toSet().all{materials.contains(it) }
    }
}
  
fun main() {
    val gifts = listOf("tren", "oso", "pelota")
    val materials = "tronesa"
  
    println(manufacture(gifts, materials))
}