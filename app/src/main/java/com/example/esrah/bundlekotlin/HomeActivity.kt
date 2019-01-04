package com.example.esrah.bundlekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.esrah.bundlekotlin.Utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupNavigationView()
    }

    fun setupNavigationView(){

        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
    }
}
