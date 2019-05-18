package app.beelabs.com.utilc

import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import java.util.*

internal class DateUtilTest {
    lateinit var cal: Calendar

    @Before
    fun init() {
        cal = Calendar.getInstance()
    }

    @Test
    fun `convert date to epoch`() {
        val date = cal.time
        val epoch = cal.timeInMillis
        val epochResult = DateUtil.convertToEpoch(date)
        val dateResult = DateUtil.convertToDate(epochResult)

        assertNotNull(epoch)
        assertNotNull(date)
        assertEquals(epoch, epochResult)
        assertEquals(dateResult, date)
    }

    @Test
    fun `date in specific format`() {
        cal.set(2019, 12 - 1, 10)

        val dateNow = cal.time
        val dateNowString = DateUtil.formatStringMonthBahasa(dateNow, "dd MMM yyyy")
        val dateNowSecondString = DateUtil.formatStringMonthBahasa(dateNow, "dd-MM-yyyy")

        assertEquals(dateNowString, "10 Dec 2019")
        assertEquals(dateNowSecondString, "10-12-2019")
    }

    @Test
    fun `person age result`() {
        cal.set(1942, 4, 29)
        val age = DateUtil.getPersonAge(cal.time)
        assertNotNull(age)
        assertEquals(age, 77)
    }
}