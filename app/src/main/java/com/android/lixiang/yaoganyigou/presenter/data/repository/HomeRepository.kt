package com.android.lixiang.yaoganyigou.presenter.data.repository

import com.android.lixiang.base.data.net.RetrofitFactory
import com.android.lixiang.yaoganyigou.presenter.data.api.ApiService
import com.android.lixiang.yaoganyigou.presenter.data.bean.GetDailyPicBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageSlideBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean
import com.android.lixiang.yaoganyigou.util.NetUtil
import io.reactivex.Observable
import javax.inject.Inject

class HomeRepository @Inject constructor() {
    fun homePageSlide(): Observable<HomePageSlideBean> {
        return RetrofitFactory(NetUtil().urlPrefix).create(ApiService::class.java).homePageSlide()
    }

    fun getDailyPic(param: String, param2: String): Observable<GetDailyPicBean> {
        return RetrofitFactory(NetUtil().dailyPicUrlPrefix).create(ApiService::class.java).getDailyPic(param, param2)
    }

    fun homePageUnits(): Observable<HomePageUnitsBean> {
        return RetrofitFactory(NetUtil().urlPrefix).create(ApiService::class.java).homePageUnits()
    }
}