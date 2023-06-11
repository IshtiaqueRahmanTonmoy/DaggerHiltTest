package com.example.myapplication.apiutils

import android.content.Context
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.security.SecureRandom
import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

class ApiClient(private val context: Context) {
    val client: Retrofit?
        get() {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(unsafeOkHttpClient.build())
                .build()
            return retrofit
        }

    companion object {
        private var retrofit: Retrofit? = null

        //private static final String BASE_URL = "https://shop.alifmartbd.com/api/v1/";
        //private static final String BASE_URL = "http://alifmart.com.bd/api/v1/";
        //private static final String BASE_URL = "https://dev.alifmart.com.bd/api/v1/";
        private const val BASE_URL = "http://202.51.182.26/oracleconn/"
        private val gson = GsonBuilder()
            .setLenient()
            .create()

        // Create a trust manager that does not validate certificate chains
        val unsafeOkHttpClient: OkHttpClient

        // Install the all-trusting trust manager

        // Create an ssl socket factory with our all-trusting manager
        .Builder
            get() = try {
                // Create a trust manager that does not validate certificate chains
                val trustAllCerts = arrayOf<TrustManager>(
                    object : X509TrustManager {
                        @Throws(CertificateException::class)
                        override fun checkClientTrusted(
                            chain: Array<X509Certificate>,
                            authType: String
                        ) {
                        }

                        @Throws(CertificateException::class)
                        override fun checkServerTrusted(
                            chain: Array<X509Certificate>,
                            authType: String
                        ) {
                        }

                        override fun getAcceptedIssuers(): Array<X509Certificate> {
                            return arrayOf()
                        }
                    }
                )

                // Install the all-trusting trust manager
                val sslContext = SSLContext.getInstance("SSL")
                sslContext.init(null, trustAllCerts, SecureRandom())

                // Create an ssl socket factory with our all-trusting manager
                val sslSocketFactory = sslContext.socketFactory
                val builder = OkHttpClient.Builder()
                builder.sslSocketFactory(sslSocketFactory, trustAllCerts[0] as X509TrustManager)
                builder.hostnameVerifier { hostname, session -> true }
                builder
            } catch (e: Exception) {
                throw RuntimeException(e)
            }
    }
}