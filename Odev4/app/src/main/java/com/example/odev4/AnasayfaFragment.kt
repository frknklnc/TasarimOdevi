package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.buttonGitA.setOnClickListener {

            Navigation.findNavController(tasarim.buttonGitA).navigate(R.id.anasayfaToA)
        }

        tasarim.buttonGitX.setOnClickListener {

            Navigation.findNavController(tasarim.buttonGitX).navigate(R.id.anasayfaToX)
        }

        return tasarim.root
    }

}