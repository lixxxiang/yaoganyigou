package com.android.lixiang.yaoganyigou.presenter.data.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class HomeMultiItem implements MultiItemEntity {
    public static final int TEXT = 1;
    public static final int IMG = 2;
    private int itemType;
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public HomeMultiItem(int itemType) {
        this.itemType = itemType;
    }

    public HomeMultiItem() {
    }

    @Override
    public int getItemType() {
        return itemType;
    }
}
