import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals


class LocalDateTimeTest {
    @Test
    fun should_parse_date_time() {
        val localDateTime = parseLocalDateTime("2021-01-01T01:02:03")
        
        assertEquals(3, localDateTime.getSecond())
        assertEquals(2, localDateTime.getMinute())
        assertEquals(1, localDateTime.getHour())
    }
    
    @Test
    fun should_add_seconds() {
        val localDateTime = parseLocalDateTime("2021-01-01T01:02:03")
        assertEquals(3, localDateTime.getSecond())
        assertEquals(4, localDateTime.plusSeconds(1).getSecond())
        assertEquals(13, localDateTime.plusSeconds(10).getSecond())
    }
    
    @Test
    fun should_change_minutes_when_adding_seconds() {
        val localDateTime = parseLocalDateTime("2021-01-01T01:02:03")
        assertEquals(2, localDateTime.getMinute())
        assertEquals(3, localDateTime.getSecond())
        assertEquals(3, localDateTime.plusSeconds(60).getMinute())
        assertEquals(3, localDateTime.plusSeconds(60).getSecond())
        assertEquals(5, localDateTime.plusSeconds(3 * 60).getMinute())
        assertEquals(3, localDateTime.plusSeconds(3 * 60).getSecond())
    }
    
    @Test
    fun should_change_hour_when_adding_seconds() {
        val localDateTime = parseLocalDateTime("2021-01-01T01:02:03")
        assertEquals(1, localDateTime.getHour())
        assertEquals(3, localDateTime.getSecond())
        assertEquals(2, localDateTime.plusSeconds(60 * 60).getHour())
        assertEquals(3, localDateTime.plusSeconds(60 * 60).getSecond())
        assertEquals(4, localDateTime.plusSeconds(3 * 60 * 60).getHour())
        assertEquals(3, localDateTime.plusSeconds(3 * 60 * 60).getSecond())
    }
    
    @Test
    fun should_give_different_result_every_time_asking_for_now() {
        assertNotEquals(now(), now())
    }
}
