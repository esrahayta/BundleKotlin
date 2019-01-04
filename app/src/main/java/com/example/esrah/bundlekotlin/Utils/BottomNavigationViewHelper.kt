package com.example.esrah.bundlekotlin.Utils

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx


class BottomNavigationViewHelper {

    companion object {

        fun setupBottomNavigationView(bottomnavigationViewEx: BottomNavigationViewEx){
            bottomnavigationViewEx.enableAnimation(false)
            bottomnavigationViewEx.setTextVisibility(false)
            bottomnavigationViewEx.enableShiftingMode(false)

        }
    }

}