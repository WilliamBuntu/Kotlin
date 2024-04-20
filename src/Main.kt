//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }
//
    println("Hello World")
    println(3 + 3)

    val name1: String
    name1 = "John"
    println(name1)

    val myText: String = "Hello World"
    println(myText)

    val x: Int = 5
    val y: Long = x.toLong()
    println(y)

    var g = 10
    g += 5
    val firstName = "James"
    val secondName = "John"
    println("My first name is $firstName $secondName")

    val time = 8
    val greeting = if (time < 18) 56 else 65
    println(greeting)

    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    fun myFunction(x: Int, y: Int): Int {
        return (x + y)
    }


        val result1 = myFunction(3, 5)
        println(result1)

}


