package com.android.lixiang.yaoganyigou.service.impl

import com.android.lixiang.yaoganyigou.presenter.data.bean.GetDailyPicBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageSlideBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.TopicBean
import com.android.lixiang.yaoganyigou.presenter.data.repository.HomeRepository
import com.android.lixiang.yaoganyigou.presenter.data.repository.SpecialRepository
import com.android.lixiang.yaoganyigou.service.HomeService
import com.android.lixiang.yaoganyigou.service.SpecialService
import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.functions.Function
import javax.inject.Inject

class SpecialServiceImpl @Inject constructor() : SpecialService {


    override fun topic(): Observable<TopicBean> {
        return mSpecialRepository.topic()
            .flatMap(Function<TopicBean, ObservableSource<TopicBean>> { t ->
                return@Function Observable.just(t)
            })
    }

    @Inject
    lateinit var mSpecialRepository: SpecialRepository
}