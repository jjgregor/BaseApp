package com.jason.baseapp.dagger

import com.jason.baseapp.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Jason on 3/4/18.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, NetworkModule::class /*ServiceMod::class*/))
interface AppComponent {

    fun inject(activity: MainActivity)

}