class Point (var x: Int, var y: Int) {
    override fun toString(): String {
        return ("$x, $y")
    }

    fun equals(other: Any) {
        val pirveli = Point(x, y)
        val meore = Point(2, 4)
        if (pirveli == meore)
            println("ტოლია")
        else if (pirveli > meore)
            println("მეტია")
        else (pirveli < meore)
            println("ნაკლებია")

    }
}

