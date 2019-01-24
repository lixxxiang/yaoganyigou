package com.android.lixiang.yaoganyigou.ui.adapter;

import com.android.lixiang.yaoganyigou.R;
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomeItem;
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomeMultiItem;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class HomeMultiAdapter extends BaseMultiItemQuickAdapter<HomeMultiItem, BaseViewHolder> {

    public HomeMultiAdapter(List data) {
        super(data);
        addItemType(HomeMultiItem.TEXT, R.layout.item_test);
        addItemType(HomeMultiItem.IMG, R.layout.item_test2);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeMultiItem item) {
        switch (helper.getItemViewType()) {
            case HomeMultiItem.TEXT:
                helper.setText(R.id.mTV, item.getS());
                break;
            case HomeMultiItem.IMG:
                helper.setText(R.id.mTV2, item.getS());
                break;
        }
    }
}
