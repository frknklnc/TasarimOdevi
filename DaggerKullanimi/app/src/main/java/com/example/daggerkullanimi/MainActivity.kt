package com.example.daggerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var kargo: Kargo //privateları silmek gerekiyor.
    @Inject
    lateinit var internet: Internet  //privateları silmek gerekiyor.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().build().inject(this)


        kargo.gonder()
        internet.basvuruYap()
    }
}