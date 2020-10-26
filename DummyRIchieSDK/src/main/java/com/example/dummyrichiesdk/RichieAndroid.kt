package com.example.dummyrichiesdk

import android.util.Log

open class RichieAndroid private constructor(private val flutterGateway: FlutterToNativeInterface) {
    fun onLogout() {
        Log.d("WTF", "Logout event from FLUTTER")
    }

    companion object {
        var instance: RichieAndroid? = null
            private set

        fun init(flutterGateway: FlutterToNativeInterface) {
            instance =
                RichieAndroid(flutterGateway)
        }
    }

}