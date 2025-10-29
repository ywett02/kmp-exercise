import java.time.LocalDateTime as JavaLocalDateTime

actual typealias LocalDateTime = JavaLocalDateTime

actual fun now(): LocalDateTime = JavaLocalDateTime.now()

actual fun parseLocalDateTime(str: String): LocalDateTime = JavaLocalDateTime.parse(str)