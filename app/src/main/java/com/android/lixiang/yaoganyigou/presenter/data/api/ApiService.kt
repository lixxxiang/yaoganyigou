package com.android.lixiang.yaoganyigou.presenter.data.api

import com.android.lixiang.yaoganyigou.presenter.data.bean.GetDailyPicBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageSlideBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean
import com.android.lixiang.yaoganyigou.presenter.data.bean.TopicBean
import io.reactivex.Observable
import retrofit2.http.*


interface ApiService {

    @Headers("Content-Type:text/html;charset=utf-8", "Accept:application/json;")
    @GET("/global/homePageSlide")
    fun homePageSlide(): Observable<HomePageSlideBean>

    @POST("/mobile/getDailyPic")
    @FormUrlEncoded
    fun getDailyPic(@Field("pageSize") targetSentence: String,
              @Field("pageNum") targetSentence2: String): Observable<GetDailyPicBean>

    @Headers("Content-Type:text/html;charset=utf-8", "Accept:application/json;")
    @GET("/global/mobile/homePageUnits")
    fun homePageUnits(): Observable<HomePageUnitsBean>

    @Headers("Content-Type:text/html;charset=utf-8", "Accept:application/json;")
    @GET("/global/mobile/topic")
    fun topic(): Observable<TopicBean>

}
