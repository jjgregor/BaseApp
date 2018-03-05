package com.jason.baseapp

import android.app.Application
import com.jason.baseapp.dagger.AppComponent
import com.jason.baseapp.dagger.AppModule
import com.jason.baseapp.dagger.DaggerAppComponent
import com.jason.baseapp.dagger.NetworkModule

/**
 * Created by Jason on 3/4/18.
 */
class App : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .networkModule(NetworkModule(getString(R.string.base_url), applicationContext))
                .build()
    }

    fun getAppComponent(): AppComponent = component

}