package  three

val data1 : String= "hello" +
        "world"
val data2: String = """"
            hello
            world
            $data1
            """

fun main (args: Array<String>) {
    println(data2)
}
