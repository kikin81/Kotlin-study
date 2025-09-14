package easy

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class PalindromeTest {

    @ParameterizedTest
    @ValueSource(strings = ["racecar", "abcdcba", "a", ""])
    fun testPalindromes(input: String) {
        assertTrue(checkIfPalindrome(input))
    }
}
