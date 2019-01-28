package com.android.lixiang.yaoganyigou.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.*;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.lixiang.base.utils.view.GridSpacingItemDecoration;
import com.android.lixiang.base.utils.view.TextSwitcherView2;
import com.android.lixiang.yaoganyigou.R;
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageSlideBean;
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean;
import com.android.lixiang.yaoganyigou.presenter.data.bean.TopicBean;
import com.android.lixiang.yaoganyigou.ui.fragment.HomeFragment;
import com.android.lixiang.yaoganyigou.ui.fragment.SpecialFragment;
import com.android.lixiang.yaoganyigou.util.GlideImageLoader;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;
import com.orhanobut.logger.Logger;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class SpecialAdapter extends RecyclerView.Adapter {
    private static final int TYPE_HORIZONTAL = 0;
    private static final int TYPE_VERTICAL = 1;

    private Context context;
    private List<TopicBean.DataBean.PiecesBean> mHorizontalData = new ArrayList<>();
    private List<TopicBean.DataBean.PiecesBean> mVerticalData = new ArrayList<>();

    private SpecialFragment specialFragment;

    public SpecialAdapter(Context context,
                          SpecialFragment specialFragment,
                          TopicBean.DataBean mHorizontal,
                          TopicBean.DataBean mVertical) {
        this.context = context;
        this.specialFragment = specialFragment;
        mHorizontalData.addAll(mHorizontal.getPieces());
        mVerticalData.addAll(mVertical.getPieces());
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        if (i == TYPE_HORIZONTAL) {
            view = View.inflate(context, R.layout.item_special_horizontal, null);
            return new HorizontalHolder(view);
        } else {
            view = View.inflate(context, R.layout.item_special_vertical, null);
            return new VerticalHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof HorizontalHolder) {//轮播图
            HorizontalHolder horizontalHolder = (HorizontalHolder) viewHolder;
            horizontalHolder.mHorizontalRV.setLayoutManager(new LinearLayoutManager(horizontalHolder.mHorizontalRV.getContext(), LinearLayout.HORIZONTAL, false));
            SnapHelper snapHelperStart = new GravitySnapHelper(Gravity.START);
            snapHelperStart.attachToRecyclerView(horizontalHolder.mHorizontalRV);
            horizontalHolder.mHorizontalRV.setAdapter(new SpecialHorizontalAdapter(mHorizontalData, context, specialFragment));
        } else if (viewHolder instanceof VerticalHolder) {//轮播图
            VerticalHolder verticalHolder = (VerticalHolder) viewHolder;
            RecyclerView.LayoutManager manager = new GridLayoutManager(context, 2);
            verticalHolder.mVerticalRV.addItemDecoration(new GridSpacingItemDecoration(2, 20, true));
            verticalHolder.mVerticalRV.setLayoutManager(manager);
            verticalHolder.mVerticalRV.setAdapter(new SpecialVerticalAdapter(mVerticalData, context, specialFragment));
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_HORIZONTAL;
        } else {
            return TYPE_VERTICAL;
        }
    }

    public static class HorizontalHolder extends RecyclerView.ViewHolder {
        RecyclerView mHorizontalRV;

        HorizontalHolder(View itemView) {
            super(itemView);
            mHorizontalRV = itemView.findViewById(R.id.mHorizontalRV);
        }
    }

    public static class VerticalHolder extends RecyclerView.ViewHolder {
        RecyclerView mListRV;

        VerticalHolder(View itemView) {
            super(itemView);
            mListRV = itemView.findViewById(R.id.mVerticalRV);
        }
    }
}
