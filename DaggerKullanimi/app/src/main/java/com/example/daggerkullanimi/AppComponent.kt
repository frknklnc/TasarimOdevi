package com.example.daggerkullanimi

import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)

}
