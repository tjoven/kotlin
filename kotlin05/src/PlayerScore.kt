/**
 * 解构声明
 */
class PlayerScore(private val x:Int, private val y:Int){

    operator fun component1(): Any {
        return x
    }

    operator fun component2(): Any {
        return y
    }

}

fun main() {
    val(score1,score2) = PlayerScore(11,22)
    println("score1:$score1,score2:$score2")
}