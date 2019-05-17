package app.beelabs.com.utilc

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

internal class MoneyUtilTest {

    @Test
    fun `convert decimal into IDR currency format`() {
        assertEquals(MoneyUtil.convertIDRCurrencyFormat(50000.0, 0), "Rp 50.000")
        assertNotEquals(MoneyUtil.convertIDRCurrencyFormat(50000.0, 1), "Rp 50.000")
    }
}