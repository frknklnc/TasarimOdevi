package com.example.hepsiburadaclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburadaclone.data.Kampanya
import com.example.hepsiburadaclone.data.Kategori
import com.example.hepsiburadaclone.databinding.CardTasarimBinding
import com.example.hepsiburadaclone.databinding.KampanyaTasarimBinding

class KategoriAdapter(var mContext: Context, var kategoriListesi:List<Kategori>)
    : RecyclerView.Adapter<KategoriAdapter.kategoriTasarimTutucu>() {
    inner class kategoriTasarimTutucu(tasarim: CardTasarimBinding) :
        RecyclerView.ViewHolder(tasarim.root) {
        var tasarim: CardTasarimBinding

        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): kategoriTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater, parent, false)
        return kategoriTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: kategoriTasarimTutucu, position: Int) {
        val kategori = kategoriListesi.get(position)
        val ka = holder.tasarim

        ka.imageViewKategori.setImageResource(mContext.resources.getIdentifier(kategori.resimAdi,"drawable",mContext.packageName))
        ka.textViewKategoriAdi.text = kategori.kategoriAdi

    }

    override fun getItemCount(): Int {
        return kategoriListesi.size
    }
}