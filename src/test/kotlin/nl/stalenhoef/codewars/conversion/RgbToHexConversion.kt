package nl.stalenhoef.codewars.conversion

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class RgbToHexConversion {
    @Test
    fun testFixed() {
        rgb(0, 0, 0) shouldBe "000000"
        rgb(0, 0, -20) shouldBe "000000"
        rgb(300,255,255) shouldBe "FFFFFF"
        rgb(173,255,47) shouldBe "ADFF2F"
        rgb(148, 0, 211) shouldBe "9400D3"
    }
}
