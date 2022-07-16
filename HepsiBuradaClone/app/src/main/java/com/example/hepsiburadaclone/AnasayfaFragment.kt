package com.example.hepsiburadaclone

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.hepsiburadaclone.R
import com.example.hepsiburadaclone.adapter.KampanyaAdapter
import com.example.hepsiburadaclone.adapter.KategoriAdapter
import com.example.hepsiburadaclone.data.Kampanya
import com.example.hepsiburadaclone.data.Kategori
import com.example.hepsiburadaclone.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.rv1.layoutManager = StaggeredGridLayoutManager(1,
            StaggeredGridLayoutManager.HORIZONTAL)

        val kampanyaListesi = ArrayList<Kampanya> ()
        val k1 = Kampanya("kampanya1")
        val k2 = Kampanya("kampanya2")
        val k3 = Kampanya("kampanya3")
        val k4 = Kampanya("kampanya4")
        kampanyaListesi.add(k1)
        kampanyaListesi.add(k2)
        kampanyaListesi.add(k3)
        kampanyaListesi.add(k4)
        println(kampanyaListesi)
        val adapter1 = KampanyaAdapter(requireContext(),kampanyaListesi)
        tasarim.rv1.adapter = adapter1

        tasarim.rv2.layoutManager = StaggeredGridLayoutManager(4,
            StaggeredGridLayoutManager.VERTICAL)

        val kategoriListesi = ArrayList<Kategori> ()
        val ka1 = Kategori("cekilis","Kazandıran Çekiliş")
        val ka2 = Kategori("ucak","Uçak Bileti")
        val ka3 = Kategori("su","Su")
        val ka4 = Kategori("yurtdisindan","Yurt Dışından")
        val ka5 = Kategori("teknolojitutkulari","Teknoloji Tutkunları")
        val ka6 = Kategori("modadunyasi","Moda Dünyası")
        val ka7 = Kategori("anne","Anne Çocuk")
        val ka8 = Kategori("premium","Premium'u Keşfet")
        kategoriListesi.add(ka1)
        kategoriListesi.add(ka2)
        kategoriListesi.add(ka3)
        kategoriListesi.add(ka4)
        kategoriListesi.add(ka5)
        kategoriListesi.add(ka6)
        kategoriListesi.add(ka7)
        kategoriListesi.add(ka8)

        val adapter2 = KategoriAdapter(requireContext(),kategoriListesi)
        tasarim.rv2.adapter = adapter2





        return tasarim.root

    }











    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu,menu)

    }

}