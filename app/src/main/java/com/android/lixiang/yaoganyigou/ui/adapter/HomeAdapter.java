package com.android.lixiang.yaoganyigou.ui.adapter;

import com.android.lixiang.yaoganyigou.R;
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomeItem;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class HomeAdapter extends BaseQuickAdapter<HomeItem, BaseViewHolder> {
    public HomeAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeItem item) {
        helper.setText(R.id.mTV, item.getS());
    }
}
