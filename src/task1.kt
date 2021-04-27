class Duck(val height:Int? = null){
    fun quack(){
        println("Quack! Quack!")
    }
}

class MyDucks(var myDucks: Array<Duck?>) {
    fun quack() {
        for (duck in myDucks) {
            println("1     $duck")
            duck?.let{
                it.quack()
            }
        }
    }
    fun totalDuckHeight(): Int {
        var h:Int = 0
            for (duck in myDucks) {
                h +=  duck?.height ?: 0
            }
        return h
    }
}

fun main() {
    val d1 = Duck(12)
    val d2 = Duck(5)
    val d3 = null
    val d = arrayOf<Duck?>(d1, d2, d3)
    println(MyDucks(d).totalDuckHeight())
    println("--------------------------")
    // or
    println(MyDucks(arrayOf(d1, d2, d3)).totalDuckHeight())
    println("--------------------------")
    println(MyDucks(arrayOf(d1, d2, d3)).quack())
}
