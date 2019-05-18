package app.beelabs.com.utilc

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertNotNull

internal class CryptoUtilTest {

    @Test
    fun `test encryption hash`() {
        val hash = CryptoUtil.encryptedKey64()
        assertNotNull(hash)
    }
}