package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeTwoArrSortedTest {

    @Test
    fun testMergeTwoArr() {
        var arrA = arrayOf(1,4,7,20)
        var arrB = arrayOf(3,5,6)

        assertArrayEquals(arrayOf(1,3,4,5,6,7,20), mergeSortedArrays(arrA, arrB))
    }
}