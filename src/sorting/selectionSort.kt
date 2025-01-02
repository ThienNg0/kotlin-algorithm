package sorting

fun selectionSort(arr: IntArray) {
    for (i in arr.indices) {
        var minIndex = i
        for (j in i + 1 until arr.size) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }
        // Hoán đổi
        val temp = arr[i]
        arr[i] = arr[minIndex]
        arr[minIndex] = temp
    }
}

fun main() {
    val arr = intArrayOf(64, 25, 12, 22, 11)
    selectionSort(arr)
    println("Mảng sau khi sắp xếp: ${arr.joinToString(", ")}") // 11, 12, 22, 25, 64
}
