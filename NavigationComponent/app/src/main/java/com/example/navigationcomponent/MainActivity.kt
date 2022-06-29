package com.example.navigationcomponent

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.navigationcomponent.databinding.BottomSayfaBinding
import com.example.navigationcomponent.databinding.DrawerSayfaBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:DrawerSayfaBinding // burası değişiyor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = DrawerSayfaBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(tasarim.navigationView,navHostFragment.navController)

        tasarim.toolbar.title = "Başlık"

        val toggle = ActionBarDrawerToggle(this,tasarim.drawer,tasarim.toolbar,0,0)
        tasarim.drawer.addDrawerListener(toggle)
        toggle.syncState()

        val baslik = tasarim.navigationView.inflateHeaderView(R.layout.navigation_baslik)
        val textViewBaslik = baslik.findViewById(R.id.textViewBaslik) as TextView
        textViewBaslik.text = "Merhaba"

        //tasarim = BottomSayfaBinding.inflate(layoutInflater)
        //setContentView(tasarim.root)

        //val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        //NavigationUI.setupWithNavController(tasarim.bottomNav,navHostFragment.navController)
    }

    override fun onBackPressed() {

        if(tasarim.drawer.isDrawerOpen(GravityCompat.START)){
            tasarim.drawer.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }
}