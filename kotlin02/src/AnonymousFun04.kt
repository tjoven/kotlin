/**
 * 函数 作为返回值
 */
fun main() {
    val temp = test()
    print(
        temp("wen")
    )
}


private fun test():(String) -> String{
    return {
        val s:String = "Hello"
        "$s world $it"
    }
}