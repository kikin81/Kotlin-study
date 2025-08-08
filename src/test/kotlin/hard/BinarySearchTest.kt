package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinarySearchTest {
    
    private val sortedArray = intArrayOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)

    @Test
    fun testFindExistingElement() {
        assertEquals(0, binarySearch(sortedArray, 1))
        assertEquals(4, binarySearch(sortedArray, 9))
        assertEquals(9, binarySearch(sortedArray, 19))
    }

    @Test
    fun testFindMiddleElement() {
        assertEquals(5, binarySearch(sortedArray, 11))
    }

    @Test
    fun testElementNotFound() {
        assertEquals(-1, binarySearch(sortedArray, 0))
        assertEquals(-1, binarySearch(sortedArray, 2))
        assertEquals(-1, binarySearch(sortedArray, 20))
        assertEquals(-1, binarySearch(sortedArray, 10))
    }

    @Test
    fun testSingleElementArray() {
        val singleElement = intArrayOf(42)
        assertEquals(0, binarySearch(singleElement, 42))
        assertEquals(-1, binarySearch(singleElement, 41))
    }

    @Test
    fun testEmptyArray() {
        val emptyArray = intArrayOf()
        assertEquals(-1, binarySearch(emptyArray, 1))
    }

    @Test
    fun testTwoElementArray() {
        val twoElements = intArrayOf(10, 20)
        assertEquals(0, binarySearch(twoElements, 10))
        assertEquals(1, binarySearch(twoElements, 20))
        assertEquals(-1, binarySearch(twoElements, 15))
    }

    @Test
    fun testRecursiveVersion() {
        assertEquals(0, binarySearchRecursive(sortedArray, 1))
        assertEquals(4, binarySearchRecursive(sortedArray, 9))
        assertEquals(9, binarySearchRecursive(sortedArray, 19))
        assertEquals(-1, binarySearchRecursive(sortedArray, 0))
        assertEquals(-1, binarySearchRecursive(sortedArray, 20))
    }

    @Test
    fun testNegativeNumbers() {
        val negativeArray = intArrayOf(-10, -5, -1, 0, 3, 8, 12)
        assertEquals(0, binarySearch(negativeArray, -10))
        assertEquals(2, binarySearch(negativeArray, -1))
        assertEquals(3, binarySearch(negativeArray, 0))
        assertEquals(6, binarySearch(negativeArray, 12))
        assertEquals(-1, binarySearch(negativeArray, -15))
    }
}