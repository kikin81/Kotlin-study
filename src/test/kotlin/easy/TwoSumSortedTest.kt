package easy

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class TwoSumSortedTest {

    @Test
    fun testTwoSumA() {
        assertTrue(checkForSum(arrayOf(1, 2, 4, 6, 8, 9, 14, 15), 13))
    }
}