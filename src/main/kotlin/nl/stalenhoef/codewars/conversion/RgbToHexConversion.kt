package nl.stalenhoef.codewars.conversion

fun rgb(r: Int, g: Int, b: Int) = "${r.asHex()}${g.asHex()}${b.asHex()}"

fun Int.asHex() = "%02X".format(this.coerceIn(0, 255))
