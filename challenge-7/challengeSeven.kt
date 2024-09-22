fun drawGift(size: Int, symbol: String): String {
    if(size <= 1) return "#"
    
    val topLayer = mutableListOf<String>()
    val middleSymbols = symbol.repeat(size-2)
    
    for (i in 1 until size) {
       val blankSpaces = " ".repeat(size-i)    
       if(i == 1) topLayer.add(blankSpaces + "#".repeat(size))
       else {
           val extraSide = "${middleSymbols.take(i - 2)}#"
           val cover = "#${middleSymbols}#${extraSide}"
           
           topLayer.add(blankSpaces + cover)
       }
    }
    
    val middleLayer = "#".repeat(size) + middleSymbols + "#"
    val bottomLayer = topLayer.asReversed().map{ it.trim() }
    
    return (topLayer + middleLayer + bottomLayer).joinToString(separator="\n")
}

fun main() {
    println(drawGift(5, "*"))
}