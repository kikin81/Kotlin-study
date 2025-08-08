package medium

import kotlinx.coroutines.delay

// TODO: Implement the following coroutine functions:

// 1. fetchUserData - simulates fetching user data with delay
suspend fun fetchUserData(userId: Int): String {
    // Simulate network delay of 1000ms
    // Return "User data for user $userId"
    return ""
}

// 2. processUserData - simulates processing user data with delay  
suspend fun processUserData(userData: String): String {
    // Simulate processing delay of 500ms
    // Return "Processed: $userData"
    return ""
}

// 3. fetchAndProcessUser - combines both operations sequentially
suspend fun fetchAndProcessUser(userId: Int): String {
    // TODO: Call fetchUserData, then processUserData
    // Return the processed result
    return ""
}