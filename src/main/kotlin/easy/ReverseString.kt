package easy

fun reverseString(input: String): String {
    if (input.length <= 1) return input
    val chars = input.toCharArray()
    val builder = StringBuilder()
    for (i in chars.indices.reversed()) {
        builder.append(chars[i])
    }
    return builder.toString()
}
