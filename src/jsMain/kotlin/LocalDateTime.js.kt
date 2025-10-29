import kotlin.js.Date

actual class LocalDateTime(private val date: Date = Date()) {
    actual fun getSecond(): Int {
        return date.getSeconds()
    }

    actual fun getMinute(): Int {
       return date.getMinutes()
    }

    actual fun getHour(): Int {
       return date.getHours()
    }

    actual fun plusSeconds(seconds: Long): LocalDateTime {
       return LocalDateTime(Date(date.getTime() + seconds * 1000))
    }
}

actual fun now(): LocalDateTime = LocalDateTime()

actual fun parseLocalDateTime(str: String): LocalDateTime =
    LocalDateTime(Date(Date.parse(str)))
