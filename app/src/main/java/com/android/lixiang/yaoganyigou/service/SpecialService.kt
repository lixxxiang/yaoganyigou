package com.android.lixiang.yaoganyigou.service

import com.android.lixiang.yaoganyigou.presenter.data.bean.GetDailyPicBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageSlideBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.TopicBean
import io.reactivex.Observable
import okhttp3.MultipartBody
import java.io.File

interface SpecialService {
    fun topic(): Observable<TopicBean>
}