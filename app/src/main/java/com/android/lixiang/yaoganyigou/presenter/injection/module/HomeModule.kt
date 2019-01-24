package com.android.lixiang.yaoganyigou.presenter.injection.module

import com.android.lixiang.yaoganyigou.service.HomeService
import com.android.lixiang.yaoganyigou.service.impl.HomeServiceImpl
import dagger.Module
import dagger.Provides
@Module
class HomeModule {
    @Provides
    fun provideCannotLoginService(service: HomeServiceImpl): HomeService {
        return service
    }
}