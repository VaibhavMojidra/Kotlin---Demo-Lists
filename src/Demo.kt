fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Iteration with for loop
    for (num in numbers) {
        println(num)
    }

    // Iteration with forEach method
    numbers.forEach {
        println(it)
    }

    // Filter method to get even numbers
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")

    // Map method to double all numbers
    val doubledNumbers = numbers.map { it * 2 }
    println("Doubled numbers: $doubledNumbers")

    // Fold method to calculate sum of all numbers
    val sum = numbers.fold(0) { acc, num -> acc + num }
    println("Sum: $sum")

    // Reduce method to get maximum number
    val maxNumber = numbers.reduce { acc, num -> if (acc > num) acc else num }
    println("Maximum number: $maxNumber")

    // Check if all numbers are less than 20
    val allLessThan20 = numbers.all { it < 20 }
    println("All less than 20: $allLessThan20")

    // Check if any number is greater than 10
    val anyGreaterThan10 = numbers.any { it > 10 }
    println("Any greater than 10: $anyGreaterThan10")

    // Count method to get number of elements
    val count = numbers.count()
    println("Number of elements: $count")

    // First method to get first element
    val firstElement = numbers.first()
    println("First element: $firstElement")
}
