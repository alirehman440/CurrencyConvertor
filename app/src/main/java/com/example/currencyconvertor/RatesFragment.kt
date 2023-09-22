package com.example.currencyconvertor

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class RatesFragment : Fragment() {
    private var currencyList = ArrayList<Currency>()
    private var currencyAdapter: CurrencyAdapter? = null
    private lateinit var currencyrv: RecyclerView
    private lateinit var inputAmount: EditText
    private lateinit var done: TextView
    private lateinit var progressBar: ProgressBar
    var amount =0.0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.rates_fragment, container, false)
        currencyrv = root.findViewById(R.id.currency_rv)
        inputAmount = root.findViewById(R.id.euro_value)
        done = root.findViewById(R.id.done)
        progressBar = root.findViewById(R.id.progressBar)

        done.setOnClickListener {
            if (inputAmount.text.isNotEmpty()){
                if((inputAmount.text.toString().toDouble())>0){
                    getRates(inputAmount.text.toString().toDouble())
                }else{
                    Toast.makeText(requireContext(),"Enter valid value",Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(requireContext(),"Enter valid value",Toast.LENGTH_SHORT).show()
            }
        }

        return root
    }




    private fun getRates(amount:Double) {
        progressBar.visibility = View.VISIBLE
        currencyList.clear()
        CoroutineScope(Dispatchers.Main).launch {
           //
            val response = EndPoints.baseClient!!.currentRate()
            if (response.isSuccessful) {
                progressBar.visibility = View.GONE

                if (response.body() != null) {
                    if (response.body()!!.conversion_rates.isNotEmpty()) {

                        for (items in response.body()!!.conversion_rates) {
                            if(items.key!="EUR")
                            currencyList.add(Currency(items.key, items.value))
                        }

                        adapterCurrency(amount)

                        currencyList.forEachIndexed { index, element ->
                            Log.d("responeApi", currencyList[index].value.toString())
                        }

                    }
                }

            } else {
                progressBar.visibility = View.GONE
                Toast.makeText(
                    requireContext(),
                    "Error: ${response.errorBody().toString()}",
                    Toast.LENGTH_LONG
                ).show()
              //  Log.d("responeApi", response.raw().body.toString())

            }

        }
    }

    private fun adapterCurrency(amount: Double) {
      //  currencyList.clear()

        currencyrv.layoutManager = LinearLayoutManager(requireContext())

        currencyAdapter = CurrencyAdapter(
            this.requireContext(),
            currencyList,
            amount

        )

        currencyrv.adapter = currencyAdapter


    }


}