/**
 * 安全调用操作符
 * 空判断
 */

fun main() {
    var str: String? = null

//    str = str?.capitalize()
//    println(str)

     str = ""
    str = str?.let {
         if(it.isBlank()){
             "isBlank"
         }else{
             "isNotBlank"
         }
     }
    println(str)

//空合并操作符
    str = null
    str = str?.let {
        it.capitalize()
    }?:"jack"

    println(str)
}