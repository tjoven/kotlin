class MagicBox <T>(item:T){
    private val subject:T = item
    fun test(){
        println("name: "+ this.subject)
    }

}

class Boy(private val name:String){
    override fun toString(): String {
        return "name: "+ this.name
    }
}
class Girl(private val name:String){
    override fun toString(): String {
        return "name: "+ this.name
    }
}

fun main() {
    val box1 = MagicBox(Boy("tom"))
    val box2 = MagicBox(Girl("lucy"))

    box1.test()
    box2.test()
}