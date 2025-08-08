package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountVowelsTest {
    
    @Test
    fun testSimpleWord() {
        assertEquals(2, countVowels("hello"))
    }

    @Test
    fun testAllVowels() {
        assertEquals(5, countVowels("aeiou"))
    }

    @Test
    fun testNoVowels() {
        assertEquals(0, countVowels("bcdfg"))
    }

    @Test
    fun testEmptyString() {
        assertEquals(0, countVowels(""))
    }

    @Test
    fun testMixedCase() {
        assertEquals(3, countVowels("HeLLo WoRLd"))
    }

    @Test
    fun testOnlyVowelsUppercase() {
        assertEquals(5, countVowels("AEIOU"))
    }

    @Test
    fun testRepeatedVowels() {
        assertEquals(6, countVowels("aaaaaa"))
    }

    @Test
    fun testSentenceWithPunctuation() {
        assertEquals(3, countVowels("Hello, World!"))
    }

    @Test
    fun testNumbers() {
        assertEquals(2, countVowels("a1b2e3"))
    }
}