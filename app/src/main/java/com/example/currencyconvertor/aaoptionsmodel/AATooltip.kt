
package com.example.currencyconvertor.aaoptionsmodel

import com.example.currencyconvertor.aatools.AAJSStringPurer

class AATooltip {
    var backgroundColor: Any? = null
    var borderColor: String? = null
    var borderRadius: Number? = null
    var borderWidth: Number? = null
    var style: AAStyle? = null
    var shape: String? = null
    var enabled: Boolean? = null
    var useHTML: Boolean? = null
    var formatter: String? = null
    var headerFormat: String? = null
    var pointFormat: String? = null
    var footerFormat: String? = null
    var valueDecimals: Int? = null
    var shared: Boolean? = null
    var valueSuffix: String? = null
    var followTouchMove: Boolean? = null //https://api.highcharts.com.cn/highcharts#chart.panning
    var shadow: Boolean? = null
    var padding: Number? = null
    var pointFormatter: String? = null
    var positioner: String? = null
    var dateTimeLabelFormats: AADateTimeLabelFormats? = null

    fun backgroundColor(prop: Any): AATooltip {
        backgroundColor = prop
        return this
    }

    fun borderColor(prop: String): AATooltip {
        borderColor = prop
        return this
    }

    fun borderRadius(prop: Number?): AATooltip {
        borderRadius = prop
        return this
    }

    fun borderWidth(prop: Number?): AATooltip {
        borderWidth = prop
        return this
    }

    fun style(prop: AAStyle): AATooltip {
        style = prop
        return this
    }

    fun shape(prop: String): AATooltip {
        shape = prop
        return this
    }

    fun enabled(prop: Boolean?): AATooltip {
        enabled = prop
        return this
    }

    fun useHTML(prop: Boolean?): AATooltip {
        useHTML = prop
        return this
    }

    fun formatter(prop: String): AATooltip {
        formatter = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun headerFormat(prop: String): AATooltip {
        headerFormat = prop
        return this
    }

    fun pointFormat(prop: String): AATooltip {
        pointFormat = prop
        return this
    }

    fun footerFormat(prop: String): AATooltip {
        footerFormat = prop
        return this
    }

    fun valueDecimals(prop: Int?): AATooltip {
        valueDecimals = prop
        return this
    }

    fun shared(prop: Boolean?): AATooltip {
        shared = prop
        return this
    }

    fun valueSuffix(prop: String?): AATooltip {
        valueSuffix = prop
        return this
    }

    fun followTouchMove(prop: Boolean): AATooltip {
        followTouchMove = prop
        return this
    }

    fun shadow(prop: Boolean): AATooltip {
        shadow = prop
        return this
    }

    fun padding(prop: Number): AATooltip {
        padding = prop
        return this
    }

    fun pointFormatter(prop: String): AATooltip {
        pointFormatter = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun positioner(prop: String): AATooltip {
        positioner = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun dateTimeLabelFormats(prop: AADateTimeLabelFormats): AATooltip {
        dateTimeLabelFormats = prop
        return this
    }

    init {
        shared = true
        enabled = true
        shadow = true
    }

}



