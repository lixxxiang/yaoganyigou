package com.android.lixiang.yaoganyigou.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.lixiang.base.ui.fragment.BaseMvpFragment
import com.android.lixiang.yaoganyigou.R
import com.android.lixiang.yaoganyigou.presenter.HomePresenter
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomeItem
import com.android.lixiang.yaoganyigou.presenter.injection.component.DaggerHomeFragmentComponent
import com.android.lixiang.yaoganyigou.presenter.injection.module.HomeModule
import com.android.lixiang.yaoganyigou.presenter.view.HomeView
import com.android.lixiang.yaoganyigou.ui.adapter.HomeAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseMvpFragment<HomePresenter>(), HomeView {

    private var homeAdapter: HomeAdapter? = null
    private var mLayoutManager: LinearLayoutManager? = null
    private var homeItem: HomeItem? = null
    private var mList: MutableList<HomeItem>? = mutableListOf()
    override fun injectComponent() {
        DaggerHomeFragmentComponent.builder().fragmentComponent(fragmentComponent).homeModule(HomeModule()).build()
            .inject(this)
        mPresenter.mView = this
    }

    override fun testView() {
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mPresenter.test()
        test()
        mLayoutManager = LinearLayoutManager(context)
        homeAdapter = HomeAdapter(R.layout.item_test, mList)
        mHomeRV.layoutManager = mLayoutManager
        mHomeRV.adapter = homeAdapter

    }

    private fun test() {
        homeItem = HomeItem()
        homeItem?.s = "hello"
        for (i in 0 until 10)
            mList?.add(homeItem!!)
    }
}