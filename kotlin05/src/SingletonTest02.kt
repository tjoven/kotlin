/**
 * object 对象声明
 * 相当于 java的匿名内部类
 */
open class Player{

    init {
        println("init")
    }
    open fun doSomething(){
        println("doSomething")
    }
}

fun main() {
    val p = object :Player(){
        override fun doSomething() {
            super.doSomething()
            println("doAnything")
        }
    }
    p.doSomething()
}