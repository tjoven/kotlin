/**
 * object 创建单例
 */
object ApplicationConfig{

    init {
        println("init")
    }
    fun doSomething(){
        println("doSomething")
    }
}

fun main() {
    ApplicationConfig.doSomething()
    println(ApplicationConfig)
    println(ApplicationConfig)
}