package com.example.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmkullanimi.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    private val viewModel:MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main)
        tasarim.mainActivityNesnesi = this


        viewModel.sonuc.observe(this){
            tasarim.hesaplamaSonucu = it
        }



    }

    fun buttonToplamaTikla(alinanSayi1:String,alinanSayi2:String) {
        viewModel.toplamaYap(alinanSayi1,alinanSayi2)
    }

    fun butonCarpmaTikla(alinanSayi1:String,alinanSayi2:String){
        viewModel.carpmaYap(alinanSayi1,alinanSayi2)
    }
}