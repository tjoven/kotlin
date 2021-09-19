/**
 * 数据类
 * copy
 */
data class Coordinate(var x: Int, var y:Int){


}

fun main() {
    println(Coordinate(20,30))
    val coordinate = Coordinate(2,3)
    val p = coordinate.copy(100)
    println(p)
}