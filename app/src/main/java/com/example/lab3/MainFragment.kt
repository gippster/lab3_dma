package com.example.lab3

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.OnClick

class MainFragment : BaseFragment() {
    private var callbacks: MainFragmentCallbacks? = null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is MainFragmentCallbacks) {
            callbacks = context
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
    interface MainFragmentCallbacks {
        fun showFragment1()
        fun showFragment2()
        fun showFragment3()
    }
    @OnClick(com.example.lab3.R.id.showFragment1)
    fun showFragment1() {
        callbacks?.showFragment1()
    }
    @OnClick(com.example.lab3.R.id.showFragment2)
    fun showFragment2(){
        callbacks?.showFragment2()
    }
    @OnClick(com.example.lab3.R.id.showFragment3)
    fun showFragment3(){
        callbacks?.showFragment3()
    }

}