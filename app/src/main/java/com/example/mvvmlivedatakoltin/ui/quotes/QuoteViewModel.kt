package com.example.mvvmlivedatakoltin.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.mvvmlivedatakoltin.data.Quote
import com.example.mvvmlivedatakoltin.data.QuoteRepository

class QuoteViewModel (private val quoteRepository: QuoteRepository) : ViewModel(){
    fun getQuotes()= quoteRepository.getQuote()
    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}