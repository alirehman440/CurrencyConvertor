package com.example.currencyconvertor


import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.pow
import kotlin.math.roundToInt


class CurrencyAdapter(val context: Context, val currencyList: ArrayList<Currency>,val inputAmount:Double) :
    RecyclerView.Adapter<CurrencyAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val currencyConvertedTo = itemView.findViewById<TextView>(R.id.currency)
        val currencyValue = itemView.findViewById<TextView>(R.id.conversion)
        val mainCurrency1 = itemView.findViewById<TextView>(R.id.base_currency)
        val convertedCurrency1 = itemView.findViewById<TextView>(R.id.converted_currency)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.rates_listitem, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = currencyList[position]
        holder.currencyConvertedTo.text = item.symbol
        holder.currencyValue.text = "${(inputAmount*item.value).roundTo(4)}"
        holder.mainCurrency1.text= "1 EURO = ${item.value.roundTo(4)} ${item.symbol}"
        holder.convertedCurrency1.text= "1 ${item.symbol} = ${(1/item.value).roundTo(4)} EURO"


    }

    override fun getItemCount(): Int {
        return currencyList.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
    fun Double.roundTo(numFractionDigits: Int): Double {
        val factor = 10.0.pow(numFractionDigits.toDouble())
        return (this * factor).roundToInt() / factor
    }

}


