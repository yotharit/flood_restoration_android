package com.yotharit.ittp_mobile.manager.connection

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface CVService {
    @POST(CVUrl.IMAGE_ANNOTATE)
    fun runImageDetection(@Query("key") apiKey: String, @Body request: CVRequest): Call<CVResponse>
}
