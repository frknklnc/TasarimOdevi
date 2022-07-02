package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var newOp = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonAC.setOnClickListener {
            input.text = ""
            output.text = ""
        }
        button0.setOnClickListener {
            input.text = inputaEkle("0")
        }
        button00.setOnClickListener {
            input.text = inputaEkle("00")
        }
        button1.setOnClickListener {
            input.text = inputaEkle("1")
        }
        button2.setOnClickListener {
            input.text = inputaEkle("2")
        }
        button3.setOnClickListener {
            input.text = inputaEkle("3")
        }
        button4.setOnClickListener {
            input.text = inputaEkle("4")
        }
        button5.setOnClickListener {
            input.text = inputaEkle("5")
        }
        button6.setOnClickListener {
            input.text = inputaEkle("6")
        }
        button7.setOnClickListener {
            input.text = inputaEkle("7")
        }
        button8.setOnClickListener {
            input.text = inputaEkle("8")
        }
        button9.setOnClickListener {
            input.text = inputaEkle("9")
        }
        buttonPlus.setOnClickListener {
            input.text = inputaEkle("+")
        }
        buttonDelete.setOnClickListener {
            val string = input.text.toString()
            if(input.text.toString().isNotEmpty()) {
                input.text = string.substring(0, string.length - 1)
            }

        }

        buttonEqual.setOnClickListener {
            val str = input.text
            val delimeter = "+"
            val list = str.split(delimeter)
            var sonuc = 0.0
            for (i in list){
                println(i)
                sonuc += i.toLong()
                println(sonuc)
            }
            output.text = sonuc.toString()

        }
    }
    private fun inputaEkle(buttonValue: String) : String{
        if(newOp)
            input.setText("")
        newOp = false
        return "${input.text}$buttonValue"
    }
    







}