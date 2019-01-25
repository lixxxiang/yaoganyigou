package com.android.lixiang.yaoganyigou.service

import com.android.lixiang.yaoganyigou.presenter.data.bean.GetDailyPicBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageSlideBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean
import io.reactivex.Observable
import okhttp3.MultipartBody
import java.io.File

interface HomeService {
    //    fun getUserByHrAccount(s1: String):Observable<GetUserByHrAccountBean>
    fun homePageSlide(): Observable<HomePageSlideBean>

    fun getDailyPic(param: String, param2: String): Observable<GetDailyPicBean>

    fun homePageUnits(): Observable<HomePageUnitsBean>
}