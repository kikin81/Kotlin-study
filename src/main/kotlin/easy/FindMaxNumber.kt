package easy

fun findMaxNumber(numbers: List<Int>): Int? {
    // TODO: Find the maximum number in the list
    // Return null if the list is empty
    // Don't use built-in max() function
    if (numbers.isEmpty()) {
        return null
    }

    var max = -999
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }

    return max
}