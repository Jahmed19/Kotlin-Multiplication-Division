fun main(args: Array<String>){
    val first: Double=10.0
    val second:Double=5.0
    val divide:Double =first/second
    println(divide)
    floatFunction()
}
fun floatFunction() {
    val a: Float = 10.0000f
    val b: Float = 10.000f
    val ans: Float = b % a
    println("The modulus of b and a is: "+ans)
}