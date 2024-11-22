fun manufacture(gifts: List<String>, materials: String): List<String> {
    val manufacturedGifts = mutableListOf<String>()
      
    for (gift in gifts) {
      val giftParts = gift.toList()
         val canManufactured = giftParts.all { materials.contains(it) }
      if(canManufactured) manufacturedGifts.add(gift)
    }
      
return manufacturedGifts
}
  
fun main() {
    val gifts = listOf("tren", "oso", "pelota")
    val materials = "tronesa"
  
    println(manufacture(gifts, materials))
}