package com.yotharit.ittp_mobile.util

import com.yotharit.ittp_mobile.modal.UserId

interface IdRepository {

    fun getUser(id:String,key:String) : UserId

    fun checkAvailability(id:String,key:String,apiKey:String) : String

}