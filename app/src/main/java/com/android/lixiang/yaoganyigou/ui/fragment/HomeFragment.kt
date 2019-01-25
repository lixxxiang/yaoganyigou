package com.android.lixiang.yaoganyigou.ui.fragment

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.lixiang.base.ui.fragment.BaseMvpFragment
import com.android.lixiang.yaoganyigou.R
import com.android.lixiang.yaoganyigou.presenter.HomePresenter
import com.android.lixiang.yaoganyigou.presenter.data.bean.GetDailyPicBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageSlideBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean
import com.android.lixiang.yaoganyigou.presenter.injection.component.DaggerHomeFragmentComponent
import com.android.lixiang.yaoganyigou.presenter.injection.module.HomeModule
import com.android.lixiang.yaoganyigou.presenter.view.HomeView
import com.android.lixiang.yaoganyigou.ui.adapter.HomeAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseMvpFragment<HomePresenter>(), HomeView {
    override fun returnHomePageUnitsError() {
    }

    override fun returnHomePageUnits(homePageUnitsBean: HomePageUnitsBean) {
        if (homePageUnitsBean.status == 200) {
            mThree = homePageUnitsBean.data[1]
            mHorizontal = homePageUnitsBean.data[0]
            homeAdapter = HomeAdapter(context, fragment, mBanner, mDailyPicTitle, mThree, mHorizontal)
            mHomeRV.layoutManager = mLayoutManager
            mHomeRV.adapter = homeAdapter
        }
    }

    override fun returnGetDailyPic(getDailyPicBean: GetDailyPicBean) {
        if (getDailyPicBean.status == 200) {
            for (i in 0 until getDailyPicBean.data.sjDailyPicDtoList.size) {
                mDailyPicTitle?.add(getDailyPicBean.data.sjDailyPicDtoList[i].imageName)
            }
            mPresenter.homePageUnits()

        }

    }

    override fun returnGetDailyPicError() {
    }

    override fun returnHomePageSlide(homePageSlideBean: HomePageSlideBean) {
        if (homePageSlideBean.status == 200) {
            for (i in 0 until homePageSlideBean.data.size) {
                mBanner?.add(homePageSlideBean.data[i])
            }
            mPresenter.getDailyPic("3", "1")
        }
    }

    override fun returnHomePageSlideError() {
    }


    private var homeAdapter: HomeAdapter? = null
    private var mBanner: MutableList<HomePageSlideBean.DataBean>? = mutableListOf()
    private var mDailyPicTitle: MutableList<String>? = mutableListOf()
    private var mLayoutManager: LinearLayoutManager? = null
    private var mThree: HomePageUnitsBean.DataBean? = null
    private var mHorizontal: HomePageUnitsBean.DataBean? = null
    private var fragment: HomeFragment? = null

    override fun injectComponent() {
        DaggerHomeFragmentComponent.builder().fragmentComponent(fragmentComponent).homeModule(HomeModule()).build()
            .inject(this)
        mPresenter.mView = this
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fragment = this
        mPresenter.homePageSlide()
        mLayoutManager = LinearLayoutManager(context)
    }
}