
package com.example.currencyconvertor.aaoptionsmodel

import com.example.currencyconvertor.aachartcreator.AAChartAlignType
import com.example.currencyconvertor.aachartcreator.AAChartVerticalAlignType


class AATitle {
    private var text: String? = null
    private var style: AAStyle? = null
    private var align: String? = null
    private var verticalAlign: String? = null
    private var x: Number? = null
    private var y: Number? = null
    private var userHTML: Boolean? = null

    fun text(prop: String?): AATitle {
        text = prop
        return this
    }

    fun style(prop: AAStyle?): AATitle {
        style = prop
        return this
    }

    fun align(prop: AAChartAlignType): AATitle {
        align = prop.toString()
        return this
    }

    fun verticalAlign(prop: AAChartVerticalAlignType): AATitle {
        verticalAlign = prop.toString()
        return this
    }

    fun x(prop: Number?): AATitle {
        x = prop
        return this
    }

    fun y(prop: Number?): AATitle {
        y = prop
        return this
    }

    fun userHTML(prop: Boolean?): AATitle {
        userHTML = prop
        return this
    }
}
