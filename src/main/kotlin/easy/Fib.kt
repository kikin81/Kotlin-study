package easy

fun fibonacci(i: Int): Int {

    if (i <= 1) {
        return i
    }

    val oneBack = fibonacci(i - 1)
    val twoBack = fibonacci(i - 2)
    return oneBack + twoBack
}
