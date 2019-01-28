package com.android.lixiang.yaoganyigou.presenter

import com.android.lixiang.base.ext.execute
import com.android.lixiang.base.presenter.BasePresenter
import com.android.lixiang.base.rx.BaseObserver
import com.android.lixiang.yaoganyigou.presenter.data.bean.GetDailyPicBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageSlideBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.TopicBean
import com.android.lixiang.yaoganyigou.presenter.view.HomeView
import com.android.lixiang.yaoganyigou.presenter.view.SpecialView
import com.android.lixiang.yaoganyigou.service.HomeService
import com.android.lixiang.yaoganyigou.service.SpecialService
import javax.inject.Inject

class SpecialPresenter @Inject constructor() : BasePresenter<SpecialView>() {
    @Inject
    lateinit var mSpecialService: SpecialService

    fun topic() {
        mSpecialService.topic().execute(object : BaseObserver<TopicBean>() {
            override fun onNext(t: TopicBean) {
                super.onNext(t)
                mView.returnTopic(t)
            }

            override fun onError(e: Throwable) {
                super.onError(e)
                mView.returnTopicError()
            }
        }, lifecycleProvider)
    }
}