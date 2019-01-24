package com.android.lixiang.yaoganyigou.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.android.lixiang.yaoganyigou.R
import com.android.lixiang.yaoganyigou.ui.fragment.ClassifyFragment
import com.android.lixiang.yaoganyigou.ui.fragment.HomeFragment
import com.android.lixiang.yaoganyigou.ui.fragment.MeFragment
import com.android.lixiang.yaoganyigou.ui.fragment.SpecialFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val classifyFragment = ClassifyFragment()
    private val specialFragment = SpecialFragment()
    private val meFragment = MeFragment()
    private val fragments: MutableList<Fragment>? = mutableListOf()
    private var lastfragment = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragments?.add(homeFragment)
        fragments?.add(classifyFragment)
        fragments?.add(specialFragment)
        fragments?.add(meFragment)
        supportFragmentManager.beginTransaction().replace(R.id.mRootRL, homeFragment).show(homeFragment).commit()
        navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {
                    it.isChecked = true
                    if (lastfragment != 0) {
                        switchFragment(lastfragment, 0)
                        lastfragment = 0
                    }
                }
                R.id.navigation_classify -> {
                    it.isChecked = true

                    if (lastfragment != 1) {
                        switchFragment(lastfragment, 1)
                        lastfragment = 1

                    }
                }
                R.id.navigation_special -> {
                    it.isChecked = true

                    if (lastfragment != 2) {
                        switchFragment(lastfragment, 2)
                        lastfragment = 2

                    }
                }
                R.id.navigation_me -> {
                    it.isChecked = true

                    if (lastfragment != 3) {
                        switchFragment(lastfragment, 3)
                        lastfragment = 3
                    }
                }
            }
            false
        }
    }

    private fun switchFragment(lastfragment: Int, index: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.hide(fragments!![lastfragment])//隐藏上个Fragment
        if (!fragments[index].isAdded) {
            transaction.add(R.id.mRootRL, fragments[index])
        }
        transaction.show(fragments[index]).commitAllowingStateLoss()
    }
}
