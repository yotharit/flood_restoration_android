package com.yotharit.ittp_mobile.manager.connection


import android.graphics.Bitmap
import android.util.Base64

import java.io.ByteArrayOutputStream

import okhttp3.Headers
import retrofit2.Call
import retrofit2.Response


object CloudVision {
    fun runImageDetection(apiKey: String, request: CVRequest, callback: Callback?) {
        CVConnection.getConnection().runImageDetection(apiKey, request)
            .enqueue(object : retrofit2.Callback<CVResponse> {
                override fun onResponse(call: Call<CVResponse>, response: Response<CVResponse>) {
                    callback?.onImageDetectionSuccess(
                        response.isSuccessful,
                        response.code(),
                        response.headers(),
                        response.body()
                    )
                }

                override fun onFailure(call: Call<CVResponse>, t: Throwable) {
                    callback?.onImageDetectionFailure(t)
                }
            })
    }

    interface Callback {
        fun onImageDetectionSuccess(isSuccess: Boolean, statusCode: Int, headers: Headers, cvResponse: CVResponse?)

        fun onImageDetectionFailure(t: Throwable)
    }

    fun convertBitmapToBase64String(bitmap: Bitmap): String {
        return convertByteArrayToBase64String(convertBitmapToByteArray(bitmap))
    }

    private fun convertBitmapToByteArray(bitmap: Bitmap): ByteArray {
        val byteArrayOutputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream) //bm is the bitmap object
        return byteArrayOutputStream.toByteArray()
    }

    private fun convertByteArrayToBase64String(data: ByteArray): String {
        return Base64.encodeToString(data, Base64.DEFAULT)
    }
}
