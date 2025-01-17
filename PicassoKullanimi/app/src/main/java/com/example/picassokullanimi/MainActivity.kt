package com.example.picassokullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.picassokullanimi.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        resimGoster("kofte.png")

        tasarim.buttonResim1.setOnClickListener {
            resimGoster("ayran.png")
        }

        tasarim.buttonResim2.setOnClickListener {
            resimGoster("su.png")
        }
    }

    fun resimGoster(resimAdi:String){
        val url = "http://kasimadalan.pe.hu/yemekler/resimler/$resimAdi"
        Picasso.get().load(url).into(tasarim.imageView)
    }


}