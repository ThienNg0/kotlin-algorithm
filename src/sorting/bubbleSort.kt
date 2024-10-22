package sorting

fun bubbleSort(arr: IntArray) {
    for (i in arr.indices) {
        for (j in 0 until arr.size - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}

fun main() {
    val arr = intArrayOf(5, 1, 4, 2, 8)
    bubbleSort(arr)
    println("Mảng sau khi sắp xếp: ${arr.joinToString(", ")}")
}
