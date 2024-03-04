package com.example.mvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.model.QuoteModel
import com.example.mvvm.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote:QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}