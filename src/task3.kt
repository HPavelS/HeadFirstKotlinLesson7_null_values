

class BadException2:Exception()

fun main(){

    val test = "Yes"

    print("t")
    print("h")
    try {
        riskyCode(test)
    }
    catch (e:BadException2){
        print("a")
    }
    finally {
        print("w")
        print("s")
    }
}

private fun riskyCode(test:String) {
    if (test == "Yes"){
        throw BadException2()
    }
    print("ro")
}