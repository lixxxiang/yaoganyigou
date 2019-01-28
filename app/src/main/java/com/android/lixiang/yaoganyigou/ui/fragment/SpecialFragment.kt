package com.android.lixiang.yaoganyigou.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.lixiang.base.ui.fragment.BaseMvpFragment
import com.android.lixiang.yaoganyigou.R
import com.android.lixiang.yaoganyigou.presenter.SpecialPresenter
import com.android.lixiang.yaoganyigou.presenter.data.bean.TopicBean
import com.android.lixiang.yaoganyigou.presenter.injection.component.DaggerSpecialFragmentComponent
import com.android.lixiang.yaoganyigou.presenter.injection.component.SpecialFragmentComponent
import com.android.lixiang.yaoganyigou.presenter.injection.module.SpecialModule
import com.android.lixiang.yaoganyigou.presenter.view.SpecialView
import com.android.lixiang.yaoganyigou.ui.adapter.SpecialAdapter
import kotlinx.android.synthetic.main.fragment_special.*

class SpecialFragment : BaseMvpFragment<SpecialPresenter>(), SpecialView {

    private var specialAdapter: SpecialAdapter? = null
    private var mHorizontal: TopicBean.DataBean? = null
    private var mVertical: TopicBean.DataBean? = null
    private var fragment: SpecialFragment? = null
    private var mLayoutManager: LinearLayoutManager? = null

    override fun injectComponent() {
        DaggerSpecialFragmentComponent.builder().fragmentComponent(fragmentComponent).specialModule(SpecialModule())
            .build().inject(this)
        mPresenter.mView = this
    }

    override fun returnTopic(topicBean: TopicBean) {
        if (topicBean.status == 200) {
            mHorizontal = topicBean.data[0]
            mVertical = topicBean.data[1]
            specialAdapter = SpecialAdapter(context, fragment, mHorizontal, mVertical)
            mSpecialRV.layoutManager = mLayoutManager
            mSpecialRV.adapter = specialAdapter
        }
    }

    override fun returnTopicError() {
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_special, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mPresenter.topic()
        fragment = this
        mLayoutManager = LinearLayoutManager(context)
    }
}