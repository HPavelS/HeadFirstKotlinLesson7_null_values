fun main(args: Array<String>) {
    val test: String = "No"
    val test2: String = "Yes"

    try {
        println("Start try1")
        riskyCode(test)
        println("End try1")
    } catch (e: BadException) {
        println("Bad Exception")
    } finally {
        println("Finally1")
    }
    println("End of main1")
    println("----------------------------")
    try {
        println("Start try2")
        riskyCode(test2)
        println("End try2")
    } catch (e: BadException) {
        println("Bad Exception2")
    } finally {
        println("Finally2")
    }
    println("End of main2")
}
class BadException : Exception()
private fun riskyCode(test: String) {
    println("Start risky code12")
    if (test == "Yes") {
        throw BadException()
    }
    println("End risky code12")
}