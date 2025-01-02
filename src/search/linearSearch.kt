package search

fun linearSearch(arr: IntArray, target: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == target) {
            return i
        }
    }
    return -1 // Không tìm thấy
}

fun main() {
    val arr = intArrayOf(4, 2, 5, 1, 3)
    val target = 5
    println("Vị trí của $target: ${linearSearch(arr, target)}") // Kết quả: 2
}
