package easy.arrays.slidingwindow

import kotlin.math.max

/**
 * find the longest subarray with a sum less than or equal to k
 * inputs: nums [1, 1, 1, 3]
 * target k
 * Goal: use the sliding window to find the longest *subarray*
 */
fun longestSubArray(nums: Array<Int>, k: Int): Int {
    /**
     * a sliding window works by keeping track of a left and right index
     * they both start at 0
     */
    var left = 0
    var windowSum = 0 // constraint metric: sum of the window
    var answer = 0
    for (right in nums.indices) {
        windowSum += nums[right]
        while (windowSum > k) {
            windowSum -= nums[left]
            left++
        }
        answer = max(answer, right - left + 1)
    }
    return answer
}

// common reusable structure

fun slidingWindowTechnique(nums: Array<Int>, k: Int) {
    var left = 0
    //    Replace windowSum with whatever metric you need (chars, distinct counts, product, etc).
    var windowSum = 0
    var answer = 0

    for (right in nums.indices) {
        windowSum += nums[right]

        // needs to enforce the problem's constraint
        while (windowSum > k) {
            windowSum -= nums[left]
            left++
        }

        // answer is updated inside the outer loop
        answer = max(answer, right -left + 1)
    }
}