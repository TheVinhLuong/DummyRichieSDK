package com.example.dummyrichiesdk

interface FlutterGatewayInterface {
    suspend fun getAuthToken(): String
    
    fun nativeWantToTalk()
}