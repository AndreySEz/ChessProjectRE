package com.example.chessproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import android.view.View
import androidx.fragment.app.FragmentActivity
import androidx.annotation.NonNull
import androidx.annotation.Nullable


class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val navView: BottomNavigationView=findViewById(R.id.nav_view)

        val navController=findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)
    }
}