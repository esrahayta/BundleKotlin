package com.example.esrah.bundlekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.example.esrah.bundlekotlin.Profile.NotificationFragment
import com.example.esrah.bundlekotlin.Profile.ProfilePagerAdapter
import com.example.esrah.bundlekotlin.Profile.SavedArticlesFragment
import com.example.esrah.bundlekotlin.Utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val ACTIVITY_NO=0
    private val TAG="HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupNavigationView()
        setupViewPager()

    }

    fun setupNavigationView(){

        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigation(this,bottomNavigationView)
        var menu=bottomNavigationView.menu
        var menuItem=menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)

    }
    private fun setupViewPager() {
        var tabAdlari = ArrayList<String>()
        tabAdlari.add("Notification")
        tabAdlari.add("Saved Articles")

        var profilePagerAdapter = ProfilePagerAdapter(supportFragmentManager, tabAdlari)
        profilePagerAdapter.addFragment(NotificationFragment())
        profilePagerAdapter.addFragment(SavedArticlesFragment())

        loginView.adapter=profilePagerAdapter


        loginView.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {

            }

        })

        tabs.setupWithViewPager(loginView)


    }


    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(0,0)
    }
}
