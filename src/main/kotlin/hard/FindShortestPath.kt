package hard

data class Graph(val adjacencyList: Map<Int, List<Pair<Int, Int>>>) {
    // Graph represented as adjacency list
    // Key: node, Value: list of (neighbor, weight) pairs
}

fun findShortestPath(graph: Graph, start: Int, end: Int): List<Int>? {
    // TODO: Implement Dijkstra's algorithm to find shortest path
    // Return the shortest path from start to end as a list of nodes
    // Return null if no path exists
    // Graph edges have positive weights
    
    // Hints:
    // 1. Use a priority queue (or find min distance repeatedly)
    // 2. Keep track of distances and previous nodes
    // 3. Reconstruct path from end to start using previous nodes
    
    return null
}

fun findShortestPathBFS(graph: Map<Int, List<Int>>, start: Int, end: Int): List<Int>? {
    // TODO: Implement BFS for unweighted shortest path
    // This is for unweighted graphs (simpler version)
    // Graph is represented as adjacency list: node -> list of neighbors
    // Return the shortest path as a list of nodes, null if no path
    
    return null
}