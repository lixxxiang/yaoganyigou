package com.android.lixiang.yaoganyigou.presenter

import com.android.lixiang.base.ext.execute
import com.android.lixiang.base.presenter.BasePresenter
import com.android.lixiang.base.rx.BaseObserver
import com.android.lixiang.yaoganyigou.presenter.view.HomeView
import com.android.lixiang.yaoganyigou.service.HomeService
import javax.inject.Inject

class HomePresenter @Inject constructor(): BasePresenter<HomeView>(){
    @Inject
    lateinit var mHomeService : HomeService

    fun test(){
//        mCannotLoginService.getUserByHrAccount(param).execute(object : BaseObserver<GetUserByHrAccountBean>(){
//            override fun onNext(t: GetUserByHrAccountBean) {
//                super.onNext(t)
//                mView.returnGetUserByHrAccount(t)
//            }
//
//            override fun onError(e: Throwable) {
//                super.onError(e)
//                mView.returnGetUserByHrAccountError()
//            }
//        },lifecycleProvider)
        mHomeService.test()
    }
}