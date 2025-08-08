package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class FindMaxNumberTest {
    
    @Test
    fun testPositiveNumbers() {
        assertEquals(5, findMaxNumber(listOf(1, 3, 5, 2, 4)))
    }

    @Test
    fun testNegativeNumbers() {
        assertEquals(-1, findMaxNumber(listOf(-5, -3, -1, -4, -2)))
    }

    @Test
    fun testMixedNumbers() {
        assertEquals(10, findMaxNumber(listOf(-5, 0, 10, -2, 3)))
    }

    @Test
    fun testSingleElement() {
        assertEquals(42, findMaxNumber(listOf(42)))
    }

    @Test
    fun testEmptyList() {
        assertNull(findMaxNumber(emptyList()))
    }

    @Test
    fun testDuplicateMaxValues() {
        assertEquals(7, findMaxNumber(listOf(7, 3, 7, 1, 7)))
    }

    @Test
    fun testZeroInList() {
        assertEquals(5, findMaxNumber(listOf(0, -1, 5, -3)))
    }
}