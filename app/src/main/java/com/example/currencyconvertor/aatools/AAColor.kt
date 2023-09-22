
package com.example.currencyconvertor.aatools

 fun AARgba(red: Int,
            green: Int,
            blue: Int,
            alpha: Float = 1f): String {
     return "rgba($red,$green,$blue,$alpha)"
 }

fun AARgb(red: Int,
          green: Int,
          blue: Int,
          alpha: Float = 1f): String {
    return AARgba(red, green, blue, 1f)
}

object AAColor {
    val Black = blackColor()
    val DarkGray = darkGrayColor()
    val LightGray = lightGrayColor()
    val White = whiteColor()
    val Gray = grayColor()
    val Red = redColor()
    val Green = greenColor()
    val Blue = blueColor()
    val Cyan = cyanColor()
    val Yellow = yellowColor()
    val Magenta = magentaColor()
    val Orange = orangeColor()
    val Purple = purpleColor()
    val Brown = brownColor()
    val Clear = clearColor()

    fun rgbaColor(
            red: Int,
            green: Int,
            blue: Int,
            alpha: Float = 1f
    ): String {
        return "rgba($red,$green,$blue,$alpha)"
    }

    private fun blackColor(): String {
        return "black"
    }

    private fun darkGrayColor(): String {
        return "darkGray"
    }

    private fun lightGrayColor(): String {
        return "lightGray"
    }

    private fun whiteColor(): String {
        return "white"
    }

    private fun grayColor(): String {
        return "gray"
    }

    private fun redColor(): String {
        return "red"
    }

    private fun greenColor(): String {
        return "green"
    }

    private fun blueColor(): String {
        return "blue"
    }

    private fun cyanColor(): String {
        return "cyan"
    }

    private fun yellowColor(): String {
        return "yellow"
    }

    private fun magentaColor(): String {
        return "magenta"
    }

    private fun orangeColor(): String {
        return "orange"
    }

    private fun purpleColor(): String {
        return "purple"
    }

    private fun brownColor(): String {
        return "brown"
    }

    private fun clearColor(): String {
        return "clear"
    }
}
