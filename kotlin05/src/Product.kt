import java.io.File

/**
 * 继承
 */

open class Product {
    fun description(name:String) = "description $name"
    open fun load() =   "nothing ..."
}

class ProductOne : Product() {
    override fun load(): String {
       return "has something"
    }

    fun special() =   "子类自己的方法 ..."
}

fun main() {
    val p:Product = ProductOne()
    println(p.load())

    /*类型检测*/
    println(p is Product)
    println(p is ProductOne)
    println(p is File)

    /*类型转换 智能类型转换 只需要转一次，以后可以直接用 不用再转*/
    if( p is ProductOne){
        println( (p as ProductOne).special() )
    }

    /*所有类的超类 Any*/
    println( "p is Any  "+(p is Any))
}