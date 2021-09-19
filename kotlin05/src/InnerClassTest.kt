/**
 * 嵌套类
 */
class Player3{
    public class Equipment(var name:String){
        fun show() = print("Equipment: $name")
    }

    fun battle(){

    }
}

fun main(){
    Player3.Equipment("tzw").show()
}
