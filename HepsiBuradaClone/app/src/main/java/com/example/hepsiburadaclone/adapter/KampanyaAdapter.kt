package com.example.hepsiburadaclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburadaclone.data.Kampanya
import com.example.hepsiburadaclone.databinding.KampanyaTasarimBinding

class KampanyaAdapter(var mContext: Context, var kampanyaListesi:List<Kampanya>)
    :RecyclerView.Adapter<KampanyaAdapter.kampanyaTasarimTutucu>(){
    inner class kampanyaTasarimTutucu(tasarim:KampanyaTasarimBinding) : RecyclerView.ViewHolder(tasarim.root) {
        var tasarim: KampanyaTasarimBinding

        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): kampanyaTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = KampanyaTasarimBinding.inflate(layoutInflater, parent, false)
        return kampanyaTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: kampanyaTasarimTutucu, position: Int) {
        val kampanya = kampanyaListesi.get(position)
        val k = holder.tasarim

        k.imageViewKampanya.setImageResource(mContext.resources.getIdentifier(kampanya.resimAdi,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return kampanyaListesi.size
    }
}