package com.android.lixiang.yaoganyigou.presenter.view

import com.android.lixiang.base.presenter.view.BaseView
import com.android.lixiang.yaoganyigou.presenter.data.bean.TopicBean

interface SpecialView: BaseView {

    fun returnTopic(topicBean: TopicBean)
    fun returnTopicError()

}