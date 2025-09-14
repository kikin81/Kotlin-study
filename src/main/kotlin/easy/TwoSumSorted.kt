package easy

fun checkForSum(arr: Array<Int>, target: Int): Boolean {
    var i = 0
    var j = arr.size -1

    while(i < j) {
        var sum = arr[i] + arr[j]
        if (sum > target) {
            // we need to use a smaller j, decrease j
            j--
        } else if (sum < target) {
            // we need a bigger i
            i++
        } else if (sum == target) {
            return true
        }
    }
    return false
}
