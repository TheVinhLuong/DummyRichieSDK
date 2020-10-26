package com.example.dummyrichiesdk

import android.util.Log

open class RichieAndroid private constructor(private val flutterGateway: FlutterGatewayInterface) {
    suspend fun triggerGetAuthToken() {
        val token = flutterGateway.getAuthToken()
        Log.d("WTF", "TOKEN RECEIVED FROM FLUTTER $token")
    }
    
    fun triggerNativeWantToTalk() {
        flutterGateway.nativeWantToTalk()    
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