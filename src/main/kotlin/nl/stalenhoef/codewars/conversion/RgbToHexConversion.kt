package nl.stalenhoef.codewars.conversion

fun rgb(r: Int, g: Int, b: Int) = "${r.asHex()}${g.asHex()}${b.asHex()}"

fun Int.asHex() = "%02X".format(this.roundInt())

fun Int.roundInt() = when {
    (this < 0) -> 0
    (this > 255) -> 255
    else -> this
}