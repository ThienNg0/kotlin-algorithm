package search

fun interpolationSearch(arr: IntArray, target: Int): Int {
    var low = 0
    var high = arr.size - 1

    while (low <= high && target >= arr[low] && target <= arr[high]) {
        // Tránh chia cho 0
        if (arr[low] == arr[high]) {
            if (arr[low] == target) return low
            return -1
        }

        // Tính vị trí dự đoán
        val pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low])

        // Kiểm tra vị trí dự đoán
        when {
            arr[pos] == target -> return pos
            arr[pos] < target -> low = pos + 1
            else -> high = pos - 1
        }
    }
    return -1 // Không tìm thấy
}

fun main() {
    val arr = intArrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90) // Mảng đã sắp xếp
    val target = 40
    val result = interpolationSearch(arr, target)

    if (result != -1) {
        println("Tìm thấy $target tại vị trí $result")
    } else {
        println("$target không tồn tại trong mảng")
    }
}
