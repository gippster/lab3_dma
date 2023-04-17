package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), MainFragment.MainFragmentCallbacks {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun showFragment1() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, Fragment1.newInstance())
            .addToBackStack("FRAGMENT1")
            .commit()
    }
    override fun showFragment2() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, Fragment2.newInstance())
            .addToBackStack("FRAGMENT2")
            .commit()
    }
    override fun showFragment3() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, ImageViewerFragment.newInstance())
            .addToBackStack("FRAGMENT3")
            .commit()
    }
}