package easy

fun countVowels(input: String): Int {
    // TODO: Count the number of vowels (a, e, i, o, u) in the string
    // Consider both uppercase and lowercase vowels
    // Return the total count
    return input.count { it.isVowel() }
}

fun Char.isVowel(): Boolean {
    return when (this.lowercaseChar()) {
        'a', 'e', 'i', 'o', 'u' -> true
        else -> false
    }
}
