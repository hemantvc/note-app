package com.hariom.noteapp.utils

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor(){
    private val TAG = "Logs"
    fun log(message: String) {
        Log.d(TAG, message)
    }
}