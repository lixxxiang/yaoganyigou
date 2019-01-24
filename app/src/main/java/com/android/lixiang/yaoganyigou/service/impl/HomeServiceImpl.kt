package com.android.lixiang.yaoganyigou.service.impl

import com.android.lixiang.yaoganyigou.service.HomeService
import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.functions.Function
import javax.inject.Inject

class HomeServiceImpl @Inject constructor() : HomeService {
    override fun test() {
        println("test")
    }
//    override fun getUserByHrAccount(s1: String): Observable<GetUserByHrAccountBean> {
//        return mCannotLoginRepository.getUserByHrAccount(s1).flatMap(Function<GetUserByHrAccountBean, ObservableSource<GetUserByHrAccountBean>> { t ->
//            return@Function Observable.just(t)
//        })
//    }
//
//    @Inject
//    lateinit var mCannotLoginRepository: CannotLoginRepository


}