
package com.example.currencyconvertor.aaoptionsmodel

class AAPlotBandsElement {
    private var from: Number? = null
    private var to: Number? = null
    private var color: Any? = null
    private var borderColor: String? = null
    private var borderWidth: Number? = null
    private var className: String? = null
    private var label: AALabel? = null
    private var index: Int? = null

    fun from(prop: Number?): AAPlotBandsElement {
        from = prop
        return this
    }

    fun to(prop: Number?): AAPlotBandsElement {
        to = prop
        return this
    }


    fun color(prop: Any): AAPlotBandsElement {
        color = prop
        return this
    }

    fun borderColor(prop: String): AAPlotBandsElement {
        borderColor = prop
        return this
    }

    fun borderWidth(prop: Number?): AAPlotBandsElement {
        borderWidth = prop
        return this
    }

    fun className(prop: String): AAPlotBandsElement {
        className = prop
        return this
    }

    fun label(prop: AALabel): AAPlotBandsElement {
        label = prop
        return this
    }

    fun index(prop: Int?): AAPlotBandsElement {
        index = prop
        return this
    }

}



