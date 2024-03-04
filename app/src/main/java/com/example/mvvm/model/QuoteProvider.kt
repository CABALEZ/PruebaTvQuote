package com.example.mvvm.model

import java.security.AuthProvider

class QuoteProvider {
    companion object{
    fun random():QuoteModel
    {
       val position = (0..10).random()
        return quote[position]
    }



    private val quote = listOf<QuoteModel>(
        QuoteModel("libro","Rauletus"),
        QuoteModel(Quote = "Hola",Author = "Bien heecho")
    )

    }
}