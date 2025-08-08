package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class FindShortestPathTest {
    
    @Test
    fun testSimpleWeightedPath() {
        // Graph: 0 -> 1 (weight 4), 0 -> 2 (weight 2), 1 -> 3 (weight 1), 2 -> 3 (weight 5)
        // Shortest path from 0 to 3: 0 -> 1 -> 3 (total weight 5)
        val graph = Graph(mapOf(
            0 to listOf(Pair(1, 4), Pair(2, 2)),
            1 to listOf(Pair(3, 1)),
            2 to listOf(Pair(3, 5)),
            3 to emptyList()
        ))
        
        val result = findShortestPath(graph, 0, 3)
        assertEquals(listOf(0, 1, 3), result)
    }

    @Test
    fun testDirectPath() {
        val graph = Graph(mapOf(
            0 to listOf(Pair(1, 1)),
            1 to emptyList()
        ))
        
        val result = findShortestPath(graph, 0, 1)
        assertEquals(listOf(0, 1), result)
    }

    @Test
    fun testNoPathExists() {
        val graph = Graph(mapOf(
            0 to listOf(Pair(1, 1)),
            1 to emptyList(),
            2 to listOf(Pair(3, 1)),
            3 to emptyList()
        ))
        
        val result = findShortestPath(graph, 0, 3)
        assertNull(result)
    }

    @Test
    fun testSameStartAndEnd() {
        val graph = Graph(mapOf(
            0 to listOf(Pair(1, 1)),
            1 to emptyList()
        ))
        
        val result = findShortestPath(graph, 0, 0)
        assertEquals(listOf(0), result)
    }

    @Test
    fun testBFSSimplePath() {
        // Unweighted graph for BFS
        val graph = mapOf(
            0 to listOf(1, 2),
            1 to listOf(3),
            2 to listOf(3),
            3 to emptyList<Int>()
        )
        
        val result = findShortestPathBFS(graph, 0, 3)
        // Should return one of the shortest paths: [0, 1, 3] or [0, 2, 3]
        assertEquals(3, result?.size)
        assertEquals(0, result?.first())
        assertEquals(3, result?.last())
    }

    @Test
    fun testBFSNoPath() {
        val graph = mapOf(
            0 to listOf(1),
            1 to emptyList<Int>(),
            2 to listOf(3),
            3 to emptyList<Int>()
        )
        
        val result = findShortestPathBFS(graph, 0, 3)
        assertNull(result)
    }

    @Test
    fun testBFSDirectConnection() {
        val graph = mapOf(
            0 to listOf(1, 2, 3),
            1 to emptyList<Int>(),
            2 to emptyList<Int>(),
            3 to emptyList<Int>()
        )
        
        val result = findShortestPathBFS(graph, 0, 2)
        assertEquals(listOf(0, 2), result)
    }

    @Test
    fun testComplexWeightedGraph() {
        // More complex graph to test Dijkstra's algorithm
        val graph = Graph(mapOf(
            0 to listOf(Pair(1, 10), Pair(2, 3)),
            1 to listOf(Pair(3, 2)),
            2 to listOf(Pair(1, 4), Pair(3, 8)),
            3 to emptyList()
        ))
        
        // Path 0 -> 2 -> 1 -> 3 (total weight 9) should be shorter than 0 -> 1 -> 3 (weight 12)
        val result = findShortestPath(graph, 0, 3)
        assertEquals(listOf(0, 2, 1, 3), result)
    }
}