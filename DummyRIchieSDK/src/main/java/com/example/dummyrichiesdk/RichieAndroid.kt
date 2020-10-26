package com.example.dummyrichiesdk

import android.util.Log

open class RichieAndroid private constructor(private val flutterGateway: FlutterGatewayInterface) {
    fun triggerGetAuthToken() {
        flutterGateway.getAuthToken().subscribe { value -> println("TOKEN RECEIVED FROM FLUTTER $value")}
    }
    
    companion object {
        var instance: RichieAndroid? = null
            private set

        fun init(flutterGateway: FlutterGatewayInterface) {
            instance =
                RichieAndroid(flutterGateway)
        }
    }

}