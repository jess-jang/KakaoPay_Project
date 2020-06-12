package com.jess.kakaopay.di.module

import com.jess.kakaopay.di.DispatcherProvider
import com.jess.kakaopay.di.DispatcherProviderImpl
import dagger.Binds
import dagger.Module

@Module
internal interface AppModule {

    @Binds
    fun bindDispatchers(dispatcher: DispatcherProviderImpl): DispatcherProvider

}