// დავალება #1

fun main()   {
    var point = Point()
    point.x = 0 // ჩაწერე რიცხვი შესამოწმებლად
    point.y = 0  // ჩაწერე რიცხვი შესამოწმებლად
    point.toString()
    point.equals()   }

class Point()   {
    var x: Int = 0
    var y: Int = 0
    fun equals()   {
        var equals = (x == y)
        if (x < y)
            println("x ნაკლებია y-ზე")
        if (x > y)
            println("x მეტია y-ზე")
        if (x == y)
            println("x ტოლია y-ის")   }

fun toString()   {
    println("კოორდინატებია (x, y) -> ($x, $y)")   }

}

// That's it... მეტი ვერაფერი დავწერე... :(

