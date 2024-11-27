fun findNaughtyStep(original: String, modified: String): String {
    val isOriginalLonger = original.length > modified.length  
   
    // Zip, me devuelve los valores en pares ejemplo hola.zip(holo) -> [(h,h), ..., (a, o)]
    // indexOfFirst, me deuvelve el primer valor del indice que cumpla la condición
    val differentIndex = original.zip(modified).indexOfFirst {(o , m) -> o != m}

    if(differentIndex == -1) return if(isOriginalLonger) original.last().toString() else ""
    
    return if(isOriginalLonger) original[differentIndex].toString() 
           else modified[differentIndex].toString()
}
    
fun main() {
    val original = "stepfor"
    val modified = "stepfor"
   
    println(findNaughtyStep(original, modified))
}