package com.example.daggerkullanimi

import android.util.Log
import javax.inject.Inject

class Kargo @Inject constructor (var adres: Adres) {

    fun gonder(){
        Log.e("Sonuç","Kargo ${adres.adresBilgisi} adresine gönderildi.")
    }
}