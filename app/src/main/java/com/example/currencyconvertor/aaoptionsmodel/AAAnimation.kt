/**
 * Copyright (C), 2015-2019
 * FileName: AAAnimation
 * Author: AnAn
 * Date: 2019-08-30 11:14
 * Description:
 * History:
 */
package com.example.currencyconvertor.aaoptionsmodel

import com.example.currencyconvertor.aachartcreator.AAChartAnimationType


class AAAnimation {
    var duration: Int? = null
    var easing: String? = null

    fun duration(prop: Int?): AAAnimation {
        duration = prop
        return this
    }

    fun easing(prop: AAChartAnimationType?): AAAnimation {
        easing = prop?.value
        return this
    }
}