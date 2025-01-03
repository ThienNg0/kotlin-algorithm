package `2025`

fun main() {
    val message = "🎉 Chúc Mừng Năm Mới 2025 🎆\nChúc bạn một năm tràn đầy hạnh phúc và thành công! 🌟"
    printWithDelay(message, 100) // Hiển thị từng ký tự với độ trễ 100ms
}

fun printWithDelay(text: String, delayMillis: Long) {
    for (char in text) {
        print(char) // In từng ký tự
        Thread.sleep(delayMillis) // Tạm dừng trong khoảng thời gian delayMillis
    }
    println() // Xuống dòng sau khi in xong
}
