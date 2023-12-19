package com.example.estapochofy.ui.theme

import android.app.Application
import android.content.Context

object ContextProvider {
    private lateinit var context: Context

    fun initialize(context: Application) {
        this.context = context
    }

    fun getContext(): Context {
        return context
    }
}
