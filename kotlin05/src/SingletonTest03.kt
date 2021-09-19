/**
 * object 伴生对象.一个类只有一个伴生对象
 * 类似 java的静态方法、静态代码块
 */
class Player2{

    companion object{
        fun doSomething(){
            println("doSomething")
        }
    }

}

fun main() {
    Player2.doSomething()
}