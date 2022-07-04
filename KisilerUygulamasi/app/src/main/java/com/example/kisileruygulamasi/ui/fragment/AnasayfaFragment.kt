package com.example.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.view.animation.Animation
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.data.entity.Kisiler
import com.example.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.example.kisileruygulamasi.ui.adapter.KisilerAdapter
import com.google.android.material.snackbar.Snackbar


class AnasayfaFragment : Fragment(),SearchView.OnQueryTextListener {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.toolbarAnasayfa.title = "Kişiler"
        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarAnasayfa)//activitydeki özelliklere erişmemizi sağlar

        tasarim.rv.layoutManager = LinearLayoutManager(requireContext())
        //tasarim.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        //instagram hikayeler bu şekilde yapılmıstır.

        val kisilerListesi = ArrayList<Kisiler>()
        val k1 = Kisiler(1,"Ahmet","1111")
        val k2 = Kisiler(2,"Zeynep","2222")
        val k3 = Kisiler(3,"Beyza","3333")
        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)

        val adapter = KisilerAdapter(requireContext(),kisilerListesi)
        tasarim.rv.adapter = adapter


        tasarim.fab.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
        }

        return tasarim.root



    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)//activityde gerekli değil fragmentta kullanıılır.
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu,menu)

        val item = menu.findItem(R.id.action_ara)
        super.onCreateOptionsMenu(menu, inflater)
        val searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(this)
    }

    /*override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_ara ->{
                Log.e("Kişi Menu","Ara seçildi")
                return true
            }
            R.id.action_cikis ->{
                Log.e("Kişi Menu","Çıkış seçildi")
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }*/

    override fun onQueryTextSubmit(query: String): Boolean { //arama iconu seçilirse çalışır.
        ara(query)
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean { //harf girdikçe ve sildikçe çalışır.
        ara(newText)
        return true
    }
    fun ara(aramaKelimesi:String){
        Log.e("Kişi ara",aramaKelimesi)
    }


}