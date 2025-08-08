package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GroupAnagramsTest {
    
    @Test
    fun testBasicAnagrams() {
        val input = listOf("eat", "tea", "tan", "ate", "nat", "bat")
        val result = groupAnagrams(input)
        val expected = listOf(
            listOf("eat", "tea", "ate"),
            listOf("tan", "nat"),
            listOf("bat")
        )
        assertEquals(3, result.size)
        // Check that each group has the correct size
        assertEquals(setOf(3, 2, 1), result.map { it.size }.toSet())
    }

    @Test
    fun testEmptyList() {
        assertEquals(emptyList<List<String>>(), groupAnagrams(emptyList()))
    }

    @Test
    fun testSingleWord() {
        val result = groupAnagrams(listOf("hello"))
        assertEquals(1, result.size)
        assertEquals(listOf("hello"), result[0])
    }

    @Test
    fun testNoAnagrams() {
        val input = listOf("abc", "def", "ghi")
        val result = groupAnagrams(input)
        assertEquals(3, result.size)
        // Each group should have only one word
        result.forEach { group ->
            assertEquals(1, group.size)
        }
    }

    @Test
    fun testAllAnagrams() {
        val input = listOf("abc", "bca", "cab")
        val result = groupAnagrams(input)
        assertEquals(1, result.size)
        assertEquals(3, result[0].size)
    }

    @Test
    fun testCaseSensitive() {
        val input = listOf("Eat", "Tea", "eat", "tea")
        val result = groupAnagrams(input)
        assertEquals(2, result.size)
        // Should group case-sensitive matches
        assertEquals(setOf(2, 2), result.map { it.size }.toSet())
    }

    @Test
    fun testWithSpaces() {
        val input = listOf("a b", "b a", "ab", "ba")
        val result = groupAnagrams(input)
        assertEquals(2, result.size)
    }
}