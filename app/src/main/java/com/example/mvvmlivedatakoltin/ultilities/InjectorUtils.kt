package com.example.mvvmlivedatakoltin.ultilities

import com.example.mvvmlivedatakoltin.data.FakeDatabase
import com.example.mvvmlivedatakoltin.data.QuoteRepository
import com.example.mvvmlivedatakoltin.ui.quotes.QuoteViewModelFactory

object InjectorUtils {
    fun  provideQuotesViewModelFactory(): QuoteViewModelFactory{
        val quoteRepository =QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuoteViewModelFactory(quoteRepository)
    }
}