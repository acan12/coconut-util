package app.beelabs.com.utilc

import java.util.*

class CryptoUtil {

    companion object {

        fun encryptedKey64(): ByteArray {
            var key = ByteArray(64)
            Random(42).nextBytes(key)
            return key
        }
    }
}