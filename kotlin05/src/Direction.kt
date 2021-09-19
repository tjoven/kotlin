/**
 * 枚举 可以定义函数 ，构造函数
 */
enum class Direction(val x:Int,val y:Int) {
    EAST(1,0),
    WEST(2,0),
    SOUTH(3,0),
    NORTH(4,0);

    fun update(updateX:Int,updateY: Int) = Coordinate(updateX+this.x,updateY+this.y)
}

fun main() {
    println(Direction.EAST.update(10,10))
}