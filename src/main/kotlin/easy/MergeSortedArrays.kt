package easy

/**
 *
 */
fun mergeSortedArrays(
    arrA: Array<Int>,
    arrB: Array<Int>
): Array<Int> {
    var i = 0
    var j = 0
    var m = 0
    var solution = IntArray(arrA.size + arrB.size)

    while(i < arrA.size && j < arrB.size) {

        // check if arrA[i] < than arrB[j]
        if (arrA[i] < arrB[j]) {
            // add arrA[i] into solution[m]
            solution[m] = arrA[i]
            // increase i and m
            i++
            m++
        } else {
            // this means arrB[j] is larger
            solution[m] = arrB[j]
            j++
            m++
        }
    }
    while (i < arrA.size) {
        solution[m] = arrA[i]
        i++
        m++
    }
    while (j < arrB.size) {
        solution[m] = arrB[j]
        j++
        m++
    }
    return solution.toTypedArray()
}
