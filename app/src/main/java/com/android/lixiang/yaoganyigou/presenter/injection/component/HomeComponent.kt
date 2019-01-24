package com.android.lixiang.yaoganyigou.presenter.injection.component

import com.android.lixiang.base.injection.ComponentScope
import com.android.lixiang.base.injection.component.FragmentComponent
import com.android.lixiang.yaoganyigou.presenter.injection.module.HomeModule
import com.android.lixiang.yaoganyigou.ui.fragment.HomeFragment
import dagger.Component

@ComponentScope
@Component(dependencies = arrayOf(FragmentComponent::class), modules = arrayOf(HomeModule::class))
interface HomeFragmentComponent {
    fun inject(fragment: HomeFragment)
}