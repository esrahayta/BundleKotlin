package com.example.esrah.bundlekotlin.Utils

import android.content.Context
import android.content.Intent
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import com.example.esrah.bundlekotlin.HomeActivity
import com.example.esrah.bundlekotlin.R
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx


class BottomNavigationViewHelper {

    companion object {

        fun setupBottomNavigationView(bottomnavigationViewEx: BottomNavigationViewEx){

            bottomnavigationViewEx.setTextVisibility(false)
            bottomnavigationViewEx.enableShiftingMode(false)

        }

        fun setupNavigation(context: Context, bottomnavigationViewEx: BottomNavigationViewEx){

            bottomnavigationViewEx.onNavigationItemSelectedListener=object :BottomNavigationView.OnNavigationItemSelectedListener{
                override fun onNavigationItemSelected(p0: MenuItem): Boolean {

                    when(p0.itemId){

                        R.id.home ->{

                            val intent=Intent(context,HomeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        R.id.profile ->{

                            val intent=Intent(context,HomeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                    }
                    return false
                }
            }
        }
    }

}