/**
 * 匿名函数
 */
fun main() {
    /**
     * 定义一个变量是 匿名函数
     * 入参 String  返回 String（隐式 返回 不需要return）
     */
    val function :(String)->String
    function = { arg->
        val s:String = "Hello"
        "$s world $arg"

    }

    print(function("wen"))
}