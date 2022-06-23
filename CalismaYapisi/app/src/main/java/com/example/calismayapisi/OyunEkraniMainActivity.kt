package com.example.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.calismayapisi.databinding.ActivityOyunEkraniMainBinding

class OyunEkraniMainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityOyunEkraniMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityOyunEkraniMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val gelenAd = intent.getStringExtra("ad")
        val gelenYas = intent.getIntExtra("yas",0)
        val gelenBoy = intent.getDoubleExtra("boy",0.0)
        val gelenBekar = intent.getBooleanExtra("bekar",false)

        Log.e("Gelen Ad",gelenAd!!)
        Log.e("Gelen Yaş",gelenYas.toString())
        Log.e("Gelen Boy",gelenBoy.toString())
        Log.e("Gelen Bekar",gelenBekar.toString())



        tasarim.buttonBitir.setOnClickListener {
            val intent = Intent(this@OyunEkraniMainActivity,SonucEkraniActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}