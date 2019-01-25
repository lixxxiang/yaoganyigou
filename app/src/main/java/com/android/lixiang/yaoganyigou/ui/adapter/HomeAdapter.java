package com.android.lixiang.yaoganyigou.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.lixiang.base.utils.view.TextSwitcherView2;
import com.android.lixiang.yaoganyigou.R;
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageSlideBean;
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean;
import com.android.lixiang.yaoganyigou.ui.fragment.HomeFragment;
import com.android.lixiang.yaoganyigou.util.GlideImageLoader;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;
import com.orhanobut.logger.Logger;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter {
    private static final int TYPE_BANNER = 0;
    private static final int TYPE_DAILY_PIC = 1;
    private static final int TYPE_THREE = 2;
    private static final int TYPE_HORIZONTAL = 3;
    private static final int TYPE_LIST = 4;
    private Context context;
    private List<String> mImages = new ArrayList<>();
    private List<String> mDailyPic = new ArrayList<>();
    private List<HomePageUnitsBean.DataBean.PiecesBean> mThreeData = new ArrayList<>();
    private List<HomePageUnitsBean.DataBean.PiecesBean> mHorizontalData = new ArrayList<>();
    private List<HomePageUnitsBean.DataBean.PiecesBean> mListData = new ArrayList<>();

    private HomeFragment homeFragment;

    public HomeAdapter(Context context,
                       HomeFragment homeFragment,
                       List<HomePageSlideBean.DataBean> mBanner,
                       List<String> mDailyPic,
                       HomePageUnitsBean.DataBean mThree,
                       HomePageUnitsBean.DataBean mHorizontal,
                       HomePageUnitsBean.DataBean mList) {
        this.context = context;
        this.homeFragment = homeFragment;
        for (int i = 0; i < mBanner.size(); i++) {
            mImages.add(mBanner.get(i).getImageUrl());
        }
        mThreeData.addAll(mThree.getPieces());
        mHorizontalData.addAll(mHorizontal.getPieces());
        mListData.addAll(mList.getPieces());
        this.mDailyPic = mDailyPic;
        Logger.d(mImages);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        if (i == TYPE_BANNER) {
            view = View.inflate(context, R.layout.item_home_banner, null);
            return new BannerHolder(view);
        } else if (i == TYPE_DAILY_PIC) {
            view = View.inflate(context, R.layout.item_home_daily_pic, null);
            return new DailyPicHolder(view);
        } else if (i == TYPE_THREE) {
            view = View.inflate(context, R.layout.item_home_three, null);
            return new ThreeHolder(view);
        } else if (i == TYPE_HORIZONTAL) {
            view = View.inflate(context, R.layout.item_home_horizontal, null);
            return new HorizontalHolder(view);
        } else {
            view = View.inflate(context, R.layout.item_home_list, null);
            RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            view.setLayoutParams(lp);
            return new NormalHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof BannerHolder) {//轮播图
            BannerHolder bannerHolder = (BannerHolder) viewHolder;
            bannerHolder.banner.setImages(mImages).setImageLoader(new GlideImageLoader()).start();
        } else if (viewHolder instanceof DailyPicHolder) {//轮播图
            DailyPicHolder dailyPicHolder = (DailyPicHolder) viewHolder;
            dailyPicHolder.mDailyPicTS.getResource((ArrayList<String>) mDailyPic);
        } else if (viewHolder instanceof ThreeHolder) {//轮播图
            ThreeHolder threeHolder = (ThreeHolder) viewHolder;
            Glide.with(context)
                    .load(mThreeData.get(0).getImageUrl())
                    .apply(new RequestOptions()
                            .centerCrop()
                            .placeholder(R.drawable.img_placeholder7))
                    .into(threeHolder.mThreeIV1);
            Glide.with(context)
                    .load(mThreeData.get(1).getImageUrl())
                    .apply(new RequestOptions()
                            .centerCrop()
                            .placeholder(R.drawable.img_placeholder7))
                    .into(threeHolder.mThreeIV2);
            Glide.with(context)
                    .load(mThreeData.get(2).getImageUrl())
                    .apply(new RequestOptions()
                            .centerCrop()
                            .placeholder(R.drawable.img_placeholder7))
                    .into(threeHolder.mThreeIV3);
        } else if (viewHolder instanceof HorizontalHolder) {//轮播图
            HorizontalHolder horizontalHolder = (HorizontalHolder) viewHolder;
            horizontalHolder.mHorizontalRV.setLayoutManager(new LinearLayoutManager(horizontalHolder.mHorizontalRV.getContext(), LinearLayout.HORIZONTAL, false));
            SnapHelper snapHelperStart = new GravitySnapHelper(Gravity.START);
            snapHelperStart.attachToRecyclerView(horizontalHolder.mHorizontalRV);
            horizontalHolder.mHorizontalRV.setAdapter(new HomeHorizontalAdapter(mHorizontalData, context, homeFragment));
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_BANNER;
        } else if (position == 1) {
            return TYPE_DAILY_PIC;
        } else if (position == 2) {
            return TYPE_THREE;
        } else if (position == 3) {
            return TYPE_HORIZONTAL;
        } else {
            return TYPE_LIST;
        }
    }

    public static class BannerHolder extends RecyclerView.ViewHolder {
        Banner banner;

        BannerHolder(View itemView) {
            super(itemView);
            banner = itemView.findViewById(R.id.mBanner);
        }
    }

    public static class DailyPicHolder extends RecyclerView.ViewHolder {
        TextSwitcherView2 mDailyPicTS;

        DailyPicHolder(View itemView) {
            super(itemView);
            mDailyPicTS = itemView.findViewById(R.id.mDailyPicTS);
        }
    }

    public static class ThreeHolder extends RecyclerView.ViewHolder {
        AppCompatImageView mThreeIV1;
        AppCompatImageView mThreeIV2;
        AppCompatImageView mThreeIV3;

        ThreeHolder(View itemView) {
            super(itemView);
            mThreeIV1 = itemView.findViewById(R.id.mThreeIV1);
            mThreeIV2 = itemView.findViewById(R.id.mThreeIV2);
            mThreeIV3 = itemView.findViewById(R.id.mThreeIV3);

        }
    }

    public static class HorizontalHolder extends RecyclerView.ViewHolder {
        RecyclerView mHorizontalRV;

        HorizontalHolder(View itemView) {
            super(itemView);
            mHorizontalRV = itemView.findViewById(R.id.mHorizontalRV);
        }
    }


}
