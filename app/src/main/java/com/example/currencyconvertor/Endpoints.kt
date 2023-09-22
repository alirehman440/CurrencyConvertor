package com.example.currencyconvertor

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Header
import java.util.concurrent.TimeUnit

class EndPoints {

    companion object {

        const val BASE_URL = "https://v6.exchangerate-api.com/v6/aced581952467f72ab8303ef/"
        const val CONVERT_EUR_OTHER = "latest/EUR"
        const val CONVERT_CURRENCY_HISTORICALDATA = "history/EUR"

        private var serviceBase: ApiService? = null

        val baseClient: ApiService?
            get() {
                if (serviceBase == null) {
                    val loggingInterceptor = HttpLoggingInterceptor()
                    loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
                    var client = OkHttpClient.Builder()
                        .connectTimeout(5, TimeUnit.SECONDS)
                        .addInterceptor(loggingInterceptor).build()

                    val retrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .client(client)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    serviceBase = retrofit.create(ApiService::class.java)
                }
                return serviceBase
            }


    }

    interface ApiService{

        @GET(CONVERT_EUR_OTHER)
        suspend fun currentRate(
           // @Header("base") europe:String,
        ) : Response<ApiResponse>




    }
}