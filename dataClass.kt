data class People(val age: Int, val name: String)

fun main(args: Array<String>) {

    var a : String = "abc"
    var b : String = "abc"
    var c : String = a

    if(a == b) {
        println("a == b")
    }

    if(a === b) {
        println("a === b")
    }

    if(a === c) {
        println("a === c")
    }

    val na = People(25, "Ahn")
    val nb = People(25, "Ahn")
    val nc = na
    val nd = People(22, "Yes")
    println(na == nb)
    println(na === nc)
    println(na == nd)
    println(na)
}
