package com.android.lixiang.yaoganyigou.presenter

import com.android.lixiang.base.ext.execute
import com.android.lixiang.base.presenter.BasePresenter
import com.android.lixiang.base.rx.BaseObserver
import com.android.lixiang.yaoganyigou.presenter.data.bean.GetDailyPicBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageSlideBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean
import com.android.lixiang.yaoganyigou.presenter.view.HomeView
import com.android.lixiang.yaoganyigou.service.HomeService
import javax.inject.Inject

class HomePresenter @Inject constructor() : BasePresenter<HomeView>() {
    @Inject
    lateinit var mHomeService: HomeService

    fun homePageSlide() {
        mHomeService.homePageSlide().execute(object : BaseObserver<HomePageSlideBean>() {
            override fun onNext(t: HomePageSlideBean) {
                super.onNext(t)
                mView.returnHomePageSlide(t)
            }

            override fun onError(e: Throwable) {
                super.onError(e)
                mView.returnHomePageSlideError()
            }
        }, lifecycleProvider)
    }


    fun homePageUnits() {
        mHomeService.homePageUnits().execute(object : BaseObserver<HomePageUnitsBean>() {
            override fun onNext(t: HomePageUnitsBean) {
                super.onNext(t)
                mView.returnHomePageUnits(t)
            }

            override fun onError(e: Throwable) {
                super.onError(e)
                mView.returnHomePageUnitsError()
            }
        }, lifecycleProvider)
    }

    fun getDailyPic(param: String, param2: String) {
        mHomeService.getDailyPic(param, param2).execute(object : BaseObserver<GetDailyPicBean>() {
            override fun onNext(t: GetDailyPicBean) {
                super.onNext(t)
                mView.returnGetDailyPic(t)
            }

            override fun onError(e: Throwable) {
                super.onError(e)
                mView.returnGetDailyPicError()
            }
        }, lifecycleProvider)
    }
}