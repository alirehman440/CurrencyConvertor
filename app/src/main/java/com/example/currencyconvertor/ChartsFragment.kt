package com.example.currencyconvertor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.currencyconvertor.aachartcreator.AAChartModel
import com.example.currencyconvertor.aachartcreator.AAChartType
import com.example.currencyconvertor.aachartcreator.AAChartView
import com.example.currencyconvertor.aachartcreator.AASeriesElement

class ChartsFragment : Fragment() {
    lateinit var aaChartView: AAChartView
    lateinit var spinner: Spinner
    val usdData:Array<Any> = arrayOf(1.07,1.06,1.07)
    val pkrData:Array<Any> = arrayOf(311.74,307.88,308.02)
    val chfData:Array<Any> = arrayOf(0.96,0.97,0.96)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.chart_fragment, container, false)
        aaChartView = root.findViewById<AAChartView>(R.id.aa_chart_view)
        spinner = root.findViewById(R.id.converted_currency_spinner)
        adapterCharts()
        return root
    }

    private fun adapterCharts() {
        val convertedCurrencyList = resources.getStringArray(R.array.ConvertedCurrency)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                requireActivity(),
                android.R.layout.simple_spinner_item, convertedCurrencyList
            )
            spinner.adapter = adapter
            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {

                    showChart(convertedCurrencyList[position],position)
                   // Toast.makeText(requireContext(),)
                }

                override fun onNothingSelected(parent: AdapterView<*>) {

                }
            }

        }

    }

    fun showChart(currency:String,data:Int){
        var selectedData:Array<Any> ?= null
        selectedData = when (data) {
            0 -> {
                usdData
            }
            1 -> {
                pkrData
            }
            else -> {
                chfData
            }
        }
        val aaChartModel: AAChartModel = AAChartModel()
            .chartType(AAChartType.Area)
           // .title("Currency")
            //.subtitle("subtitle")
           // .backgroundColor("#4b2b7f")
            .dataLabelsEnabled(false)
            .xAxisVisible(false)
            .yAxisVisible(false)
            .series(
                arrayOf(
                    AASeriesElement()
                        .name(currency)
                        .data(selectedData),

                    )
            )
        aaChartView.aa_drawChartWithChartModel(aaChartModel)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }
}