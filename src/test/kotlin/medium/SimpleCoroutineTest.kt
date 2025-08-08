package medium

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis

class SimpleCoroutineTest {
    
    @Test
    fun testFetchUserData() = runBlocking {
        val startTime = System.currentTimeMillis()
        val result = fetchUserData(123)
        val endTime = System.currentTimeMillis()
        
        assertEquals("User data for user 123", result)
        // Should take at least 1000ms
        val duration = endTime - startTime
        // Allow some tolerance for test execution
        assert(duration >= 900) { "Expected delay of ~1000ms, but took ${duration}ms" }
    }

    @Test
    fun testProcessUserData() = runBlocking {
        val startTime = System.currentTimeMillis()
        val testData = "Sample user data"
        val result = processUserData(testData)
        val endTime = System.currentTimeMillis()
        
        assertEquals("Processed: Sample user data", result)
        // Should take at least 500ms
        val duration = endTime - startTime
        assert(duration >= 400) { "Expected delay of ~500ms, but took ${duration}ms" }
    }

    @Test
    fun testFetchAndProcessUser() = runBlocking {
        val startTime = System.currentTimeMillis()
        val result = fetchAndProcessUser(456)
        val endTime = System.currentTimeMillis()
        
        assertEquals("Processed: User data for user 456", result)
        // Should take at least 1500ms (1000 + 500)
        val duration = endTime - startTime
        assert(duration >= 1400) { "Expected delay of ~1500ms, but took ${duration}ms" }
    }

    @Test
    fun testDifferentUserIds() = runBlocking {
        val result1 = fetchAndProcessUser(1)
        val result2 = fetchAndProcessUser(999)
        
        assertEquals("Processed: User data for user 1", result1)
        assertEquals("Processed: User data for user 999", result2)
    }
}