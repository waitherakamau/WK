
fun main() {
    var college = "akirachix"
    var chaf = college[0]
    var chaj = college[2]
    var chak = college[3]
    println(chaf.toString() + chaj + chak)
    var over= param("effence", "25")
    println(over)
    var takeString = "waithera"
    println("the length of my name is " +takeString .length)
    var name="waithera"
    if(name=="Taby")
        println("thats me")
    else{
        print("thats not me")
    }

}

fun param(name:String,age:String):String{
    var take ="hi my name is $name $age"
    return take
}














