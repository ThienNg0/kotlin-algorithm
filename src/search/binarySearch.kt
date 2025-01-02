package search

// tim kiem nhi phan
fun binarySearch(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
        val mid = (left + right) / 2
        when {
            arr[mid] == target -> return mid
            arr[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1
}

fun main() {
    val arr = intArrayOf(1, 3, 5, 7, 9)
    val result = binarySearch(arr, 5)
    if (result != -1) println("Tìm thấy ở vị trí: $result")
    else println("Không tìm thấy")
}
