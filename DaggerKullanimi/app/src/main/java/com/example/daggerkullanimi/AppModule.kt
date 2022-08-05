package com.example.daggerkullanimi

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideAdres() : Adres{
        return Adres("Osmangazi/BURSA")
    }
    //Singleton : Nesnenin bir kere oluşturup heryerden erişilmesi.
}