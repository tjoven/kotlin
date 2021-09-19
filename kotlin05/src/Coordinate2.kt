/**
 * 运算符重载，这里之演示  +号
 */
data class Coordinate2(var x: Int, var y:Int){
    operator fun plus(other: Coordinate2): Any? {
        return Coordinate2(x+other.x,y+other.y)
    }
}

fun main() {

    val coordinate = Coordinate2(2,3)
    val coordinate2 = Coordinate2(20,30)
    println(coordinate+coordinate2)
}