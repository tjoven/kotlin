/**
 * 匿名函数 简化
 *
 * 匿名函数作为参数传入
 */
fun main() {

    val function :(String)->String
    function = { arg->
        val s:String = "Hello"
        "$s world $arg"

    }

//    print(testAnonymous("你好",function))

    //匿名函数座位最后一个参数，可以不加（）
    print(
        testAnonymous("你好"){
        val s:String = "Hello"
        "$s world $it"
        }
    )
}

fun testAnonymous(string:String,anonymou:(String)->String):String{
    return anonymou(string)
}