package com.example.kullanicietkilesimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.example.kullanicietkilesimi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


        tasarim.buttonToast.setOnClickListener {
            Toast.makeText(this,"Merhaba",Toast.LENGTH_SHORT).show()
        }

        tasarim.buttonSnackbar.setOnClickListener {
            Snackbar.make(it,"Silmek istiyor musunuz",Snackbar.LENGTH_SHORT)
                .setAction("EVET"){
                    Snackbar.make(it,"Silindi",Snackbar.LENGTH_SHORT)
                        .setBackgroundTint(Color.WHITE)
                        .setTextColor(Color.BLUE)
                        .show()
                }
                .setBackgroundTint(Color.WHITE)
                .setTextColor(Color.BLUE)
                .setActionTextColor(Color.RED)
                .show()
        }

        tasarim.buttonAlert.setOnClickListener {
            /*val ad = AlertDialog.Builder(this)
            ad.setTitle("Başlık")
            ad.setMessage("İçerik")
            ad.setIcon(R.drawable.resim)
            ad.setPositiveButton("Tamam"){s,d ->
                Toast.makeText(this,"Tamam seçildi",Toast.LENGTH_SHORT).show()
            }
            ad.setNegativeButton("İptal"){s,d ->
                Toast.makeText(this,"İptal seçildi",Toast.LENGTH_SHORT).show()
            }
            ad.create().show()*/

            val ad = AlertDialog.Builder(this)
            //inflate
            val alertTasarim = layoutInflater.inflate(R.layout.alert_tasarim,null)
            val textViewAlert = alertTasarim.findViewById(R.id.textViewAlert) as TextView
            val editTextAlert = alertTasarim.findViewById(R.id.editTextAlert) as EditText
            val checkBoxAlert = alertTasarim.findViewById(R.id.checkBoxAlert) as CheckBox
            val buttonKaydet = alertTasarim.findViewById(R.id.buttonKaydet) as Button

            ad.setView(alertTasarim)
            textViewAlert.text = "Yapılacaklar"

            val d = ad.create()

            buttonKaydet.setOnClickListener {
                val yapilacakIs = editTextAlert.text.toString()
                val acilDurum = checkBoxAlert.isChecked
                Toast.makeText(this,"$yapilacakIs - $acilDurum",Toast.LENGTH_SHORT).show()
                d.dismiss()
            }

            d.show()
        }
    }
}