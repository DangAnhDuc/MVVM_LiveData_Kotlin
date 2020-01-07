package com.example.mvvmlivedatakoltin.data

class FakeDatabase private  constructor(){

    var quoteDao = FakeQuoteDao()
    private set
    companion object{
        @Volatile private var instannce: FakeDatabase? = null

        fun getInstance()= instannce?: synchronized(this){
            instannce ?: FakeDatabase().also { instannce = it }
        }
    }
}