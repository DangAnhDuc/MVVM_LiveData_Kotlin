package com.example.mvvmlivedatakoltin.data

class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao) {

    fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    fun getQuote() = quoteDao.getQuote()

    companion object {
        @Volatile
        private var instannce: QuoteRepository? = null

        fun getInstance(quoteDao: FakeQuoteDao) =
            instannce ?: synchronized(this) {
                instannce ?: QuoteRepository(quoteDao).also { instannce = it }
            }
    }
}