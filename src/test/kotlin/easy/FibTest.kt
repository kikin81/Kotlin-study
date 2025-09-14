package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FibTest {

    @Test
    fun testFibOf3() {
        assertEquals(2, fibonacci(3))
    }

    @Test
    fun testFibOf4() {
        assertEquals(3, fibonacci(4))
    }

    @Test
    fun testFibOf5() {
        assertEquals(5, fibonacci(5))
    }

    @Test
    fun testFibOf6() {
        assertEquals(8, fibonacci(6))
    }
}
