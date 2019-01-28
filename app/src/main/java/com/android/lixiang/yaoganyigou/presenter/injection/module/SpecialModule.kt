package com.android.lixiang.yaoganyigou.presenter.injection.module

import com.android.lixiang.yaoganyigou.service.HomeService
import com.android.lixiang.yaoganyigou.service.SpecialService
import com.android.lixiang.yaoganyigou.service.impl.HomeServiceImpl
import com.android.lixiang.yaoganyigou.service.impl.SpecialServiceImpl
import dagger.Module
import dagger.Provides
@Module
class SpecialModule {
    @Provides
    fun provideSpecialService(service: SpecialServiceImpl): SpecialService {
        return service
    }
}