package com.talent.robert.workshopandroidempty.domain.modules

import com.talent.robert.workshopandroidempty.domain.WorkshopApp
import com.talent.robert.workshopandroidempty.domain.repositories.XdkRepository
import com.talent.robert.workshopandroidempty.domain.services.XDKService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val workshopApp: WorkshopApp) {
    @Provides
    fun providesContext() = workshopApp

    @Provides
    @Singleton
    fun provideXDKRepository(XDKService: XDKService): XdkRepository = XdkRepository(XDKService)
}