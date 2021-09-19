/**
 * 函数 引用传递
 */
fun main() {

    print(
        test("你好",::getText)
    )
}

private fun getText(string:String):String{
    return string
}

private fun test(string:String,anonymou:(String)->String):String{
    return anonymou(string)
}