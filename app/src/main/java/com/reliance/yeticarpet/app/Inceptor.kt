package com.reliance.yeticarpet.app
import com.reliance.yeticarpet.apputlis.UserInfo
import okhttp3.Interceptor
import okhttp3.Response
import okio.Buffer
import java.io.IOException


class Inceptor : Interceptor {
    internal var token: String? = null


    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val requestBody = request.body()?.let {
            val buffer = Buffer()
            it.writeTo(buffer)
            buffer.readUtf8()
        } ?: ""

        when {
            UserInfo.loginStatus -> {
                request = request.newBuilder()
                    .header("Authorization", "Bearer " + UserInfo.accessToken)
                    .build()
            }
            else -> {
                request = request.newBuilder()
                    .build()
            }
        }

        val response = chain.proceed(request)
        if (response.code() == 402) {
            response.close()
            return response
        }
        return response
    }
}