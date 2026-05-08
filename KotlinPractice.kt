fun main() {

    // 1. Variables & Types
    val name = "Lucas"
    var age = 21
    println("My name is $name and I am $age years old.")

    // 2. Function — Area
    println("Area: ${area(3.0, 4.0)}")

    // 3. Grade Calculator
    println("Grade: ${grade(75)}")

    // 4. FizzBuzz
    fizzBuzz()

    // 5. List Operations
    val nums = listOf(1, 2, 3, 4, 5, 6)
    println("Sum: ${nums.sum()}")
    println("Even: ${nums.filter { it % 2 == 0 }}")
    println("Doubled: ${nums.map { it * 2 }}")

    // 6. Classes
    val courses = listOf(
        Course("MAD101", "Mobile App Dev", 3),
        Course("OOP102", "Object Oriented Programming", 4),
        Course("DB103", "Databases", 3)
    )

    courses.forEach { println(it) }

    // 7. Null Safety
    val input: String? = readLine()

    println(input?.length ?: 0)
}


/* 2. Area Function */
fun area(width: Double, height: Double): Double {
    return width * height
}


/* 3. Grade Function */
fun grade(score: Int): String {
    return when {
        score >= 80 -> "A"
        score >= 70 -> "B"
        score >= 60 -> "C"
        score >= 50 -> "D"
        else -> "F"
    }
}


/* 4. FizzBuzz */
fun fizzBuzz() {
    for (i in 1..30) {
        when {
            i % 15 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}


/* 6. Class */
class Course(
    val code: String,
    val title: String,
    val credits: Int
) {
    override fun toString(): String {
        return "[$code] $title ($credits)"
    }
}

