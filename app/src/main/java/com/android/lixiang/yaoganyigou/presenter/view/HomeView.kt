package com.android.lixiang.yaoganyigou.presenter.view

import com.android.lixiang.base.presenter.view.BaseView
import com.android.lixiang.yaoganyigou.presenter.data.bean.GetDailyPicBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageSlideBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean

interface HomeView: BaseView {
    fun returnHomePageSlide(homePageSlideBean: HomePageSlideBean)
    fun returnHomePageSlideError()

    fun returnGetDailyPic(getDailyPicBean: GetDailyPicBean)
    fun returnGetDailyPicError()

    fun returnHomePageUnits(homePageUnitsBean: HomePageUnitsBean)
    fun returnHomePageUnitsError()

}