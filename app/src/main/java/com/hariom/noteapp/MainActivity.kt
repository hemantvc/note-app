package com.hariom.noteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

/***
 * Video tutorial link
 * https://www.youtube.com/watch?v=zrGvOf2RlRE&ab_channel=CheezyCode
 */
class MainActivity : AppCompatActivity() {
    val TAG = "Lifecycle MainActivity"
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        baseContext
        Log.d(TAG, "onCreate() ")
    }

    override fun onStart() {
        super.onStart()
        count++
        Log.d(TAG, "onStart() ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() ")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() ")

    }

    override fun onStop() {
        super.onStop()
        count--
//        if(count == 0){
//            Log.d(TAG, "Home key pressed! ")
//        }
        Log.d(TAG, "onStop() ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() ")
    }

    override fun onTrimMemory(level: Int) {
        if (level == TRIM_MEMORY_UI_HIDDEN) {
            // Application going to background, do something
            Log.d(TAG, "TRIM_MEMORY_UI_HIDDEN")
        }
        super.onTrimMemory(level)

    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(TAG, "onSaveInstanceState")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState")

    }

}