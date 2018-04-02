package com.talent.robert.workshopandroidempty.domain.modules

import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.talent.robert.workshopandroidempty.domain.services.XDKService
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by CUL1MX on 3/28/2018.
 */

@Module
class NetworkModule (private val httpUrl: HttpUrl) {

    @Singleton
    @Provides
    fun provideGson() = Gson()

    @Singleton
    @Provides
    fun provideHttpClient() = OkHttpClient()

    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson, client: OkHttpClient): Retrofit{
        return Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .baseUrl(httpUrl)
                .build()
    }
    @Singleton
    @Provides
    fun provideXDKService(retrofit: Retrofit):XDKService{
        return retrofit.create(XDKService::class.java)
    }
}