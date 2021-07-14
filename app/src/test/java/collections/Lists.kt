package collections

class Lists {
}
fun main(){

    val numbers: List<Int> = listOf(1,2,3,4,5,6)
    println("List: ${numbers}")
    println("Sixe: $(numbers.size)")
    println("First element is : $(numbers[0])")
    println("First element is : $(numbers[3])")
    println("First element is : $(numbers[numbers.size-1])")
    println("Last index is: $(numbers.size-1)")

}