package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseStringTest {
    
    @Test
    fun testSimpleWord() {
        assertEquals("cba", reverseString("abc"))
    }

    @Test
    fun testEmptyString() {
        assertEquals("", reverseString(""))
    }

    @Test
    fun testSingleCharacter() {
        assertEquals("a", reverseString("a"))
    }

    @Test
    fun testPalindrome() {
        assertEquals("madam", reverseString("madam"))
    }

    @Test
    fun testWithSpaces() {
        assertEquals("dlrow olleh", reverseString("hello world"))
    }

    @Test
    fun testWithNumbers() {
        assertEquals("54321", reverseString("12345"))
    }

    @Test
    fun testWithSpecialCharacters() {
        assertEquals("!@#$%", reverseString("%$#@!"))
    }
}