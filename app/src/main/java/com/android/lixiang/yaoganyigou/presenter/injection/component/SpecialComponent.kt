package com.android.lixiang.yaoganyigou.presenter.injection.component

import com.android.lixiang.base.injection.ComponentScope
import com.android.lixiang.base.injection.component.FragmentComponent
import com.android.lixiang.yaoganyigou.presenter.injection.module.HomeModule
import com.android.lixiang.yaoganyigou.presenter.injection.module.SpecialModule
import com.android.lixiang.yaoganyigou.ui.fragment.HomeFragment
import com.android.lixiang.yaoganyigou.ui.fragment.SpecialFragment
import dagger.Component

@ComponentScope
@Component(dependencies = arrayOf(FragmentComponent::class), modules = arrayOf(SpecialModule::class))
interface SpecialFragmentComponent {
    fun inject(fragment: SpecialFragment)
}