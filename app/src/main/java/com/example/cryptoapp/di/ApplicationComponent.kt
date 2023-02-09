package com.example.cryptoapp.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class])
interface ApplicationComponent {

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context
        ): ApplicationComponent
    }
}
