package com.talent.robert.workshopandroidempty.domain

import com.talent.robert.workshopandroidempty.domain.modules.AppModule
import com.talent.robert.workshopandroidempty.domain.modules.NetworkModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by CUL1MX on 3/28/2018.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, NetworkModule::class))
interface AppComponent {

}