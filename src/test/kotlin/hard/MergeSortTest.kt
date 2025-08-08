package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MergeSortTest {
    
    @Test
    fun testSortRandomArray() {
        val input = intArrayOf(64, 34, 25, 12, 22, 11, 90)
        val expected = intArrayOf(11, 12, 22, 25, 34, 64, 90)
        val result = mergeSort(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testSortAlreadySorted() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val expected = intArrayOf(1, 2, 3, 4, 5)
        val result = mergeSort(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testSortReverseSorted() {
        val input = intArrayOf(5, 4, 3, 2, 1)
        val expected = intArrayOf(1, 2, 3, 4, 5)
        val result = mergeSort(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testSortSingleElement() {
        val input = intArrayOf(42)
        val expected = intArrayOf(42)
        val result = mergeSort(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testSortEmptyArray() {
        val input = intArrayOf()
        val expected = intArrayOf()
        val result = mergeSort(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testSortDuplicates() {
        val input = intArrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5)
        val expected = intArrayOf(1, 1, 2, 3, 4, 5, 5, 6, 9)
        val result = mergeSort(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testSortNegativeNumbers() {
        val input = intArrayOf(-3, -1, -4, 0, 2, -5)
        val expected = intArrayOf(-5, -4, -3, -1, 0, 2)
        val result = mergeSort(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testOriginalArrayUnmodified() {
        val input = intArrayOf(3, 1, 4, 1, 5)
        val originalCopy = input.copyOf()
        mergeSort(input)
        assertArrayEquals(originalCopy, input, "Original array should not be modified")
    }
}