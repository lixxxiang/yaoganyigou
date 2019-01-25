package com.android.lixiang.yaoganyigou.service.impl

import com.android.lixiang.yaoganyigou.presenter.data.bean.GetDailyPicBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageSlideBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean
import com.android.lixiang.yaoganyigou.presenter.data.repository.HomeRepository
import com.android.lixiang.yaoganyigou.service.HomeService
import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.functions.Function
import javax.inject.Inject

class HomeServiceImpl @Inject constructor() : HomeService {
    override fun homePageUnits(): Observable<HomePageUnitsBean> {
        return mHomeRepository.homePageUnits()
            .flatMap(Function<HomePageUnitsBean, ObservableSource<HomePageUnitsBean>> { t ->
                return@Function Observable.just(t)
            })
    }

    override fun getDailyPic(param: String, param2: String): Observable<GetDailyPicBean> {
        return mHomeRepository.getDailyPic(param, param2)
            .flatMap(Function<GetDailyPicBean, ObservableSource<GetDailyPicBean>> { t ->
                return@Function Observable.just(t)
            })
    }

    override fun homePageSlide(): Observable<HomePageSlideBean> {
        return mHomeRepository.homePageSlide()
            .flatMap(Function<HomePageSlideBean, ObservableSource<HomePageSlideBean>> { t ->
                return@Function Observable.just(t)
            })
    }

    @Inject
    lateinit var mHomeRepository: HomeRepository
}