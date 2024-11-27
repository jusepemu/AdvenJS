fun findNaughtyStep(original: String, modified: String): String {
    val originalGrantToModified = original.length > modified.length  
    val originalSplitByLetter = original.toList()
    val modifiedSplitByLetter = modified.toList()
    
    val arr = modifiedSplitByLetter.mapIndexed { index, letter -> 
       try {
           letter == originalSplitByLetter[index]
       } catch(e: Exception) {
           false
       }
    }
    
    val differentLetterIndex = arr.indexOf(false)
    
    if(differentLetterIndex == -1) return if(originalGrantToModified) original.last().toString() else ""
    
    return if(original.length > modified.length) original[differentLetterIndex].toString() 
           else modifiedSplitByLetter[differentLetterIndex].toString()
}
   
fun main() {
    val original = "stepfor"
    val modified = "stepxor"
   
    println(findNaughtyStep(original, modified))
}