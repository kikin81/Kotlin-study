package easy

fun checkIfPalindrome(word: String): Boolean {
    var i = 0
    var j = word.length - 1
    while (i < j) {
        if (word[i] != word[j]) {
            return false
        }
        i++
        j--
    }
    return true
}
