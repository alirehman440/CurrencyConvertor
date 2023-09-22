package com.example.currencyconvertor

data class ApiResponse(
    val base_code: String,
    val conversion_rates: Map<String, Double>,
    val documentation: String,
    val result: String,
    val terms_of_use: String,
    val time_last_update_unix: Int,
    val time_last_update_utc: String,
    val time_next_update_unix: Int,
    val time_next_update_utc: String
)

data class ConversionRates(
    val symbol:String,
    val rate:Double
)

data class Currency(
    val symbol: String,
    val value: Double
)

data class ApiChartsResponse(
    val base_code: String,
    val conversion_rates: ConversionRates,
    val day: Int,
    val documentation: String,
    val month: Int,
    val result: String,
    val terms_of_use: String,
    val year: Int
)

