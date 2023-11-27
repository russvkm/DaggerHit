package com.studiokrew.daggerhiltproject

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
object AppModel {
    @Provides
    @Named("String1")
    fun newModule():String = "This is my app string"

    @Provides
    @Named("String2")
    fun newModule2():String = "This is new model String"
}