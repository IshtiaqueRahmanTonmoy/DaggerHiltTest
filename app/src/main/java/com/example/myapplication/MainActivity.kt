package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle = Bundle()
        bundle.putInt("page_id", 1)
        val navController = findNavController(this, R.id.nav_host_fragment_activity_landed)
        navController.navigate(R.id.blankFragment, bundle)

    }
}