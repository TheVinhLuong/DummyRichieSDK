package com.example.dummyrichiesdk

import io.reactivex.rxjava3.core.Single

interface FlutterGatewayInterface {
    fun getAuthToken(): Single<String>
}