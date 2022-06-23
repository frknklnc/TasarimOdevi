package com.example.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calismayapisi.databinding.ActivityOyunEkraniMainBinding
import com.example.calismayapisi.databinding.ActivitySonucEkraniBinding
import com.google.android.material.snackbar.Snackbar

class SonucEkraniActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivitySonucEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySonucEkraniBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
    }

    override fun onBackPressed() {

        Snackbar.make(tasarim.textView3,"Geri dönmek istiyor musunuz?",Snackbar.LENGTH_LONG)
            .setAction("EVET"){
                super.onBackPressed()
            }.show()

    }
}