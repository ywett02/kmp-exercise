expect class LocalDateTime {
    fun getSecond(): Int
    fun getMinute(): Int
    fun getHour(): Int
    fun plusSeconds(seconds: Long): LocalDateTime
}

expect fun now(): LocalDateTime

expect fun parseLocalDateTime(str: String): LocalDateTime
