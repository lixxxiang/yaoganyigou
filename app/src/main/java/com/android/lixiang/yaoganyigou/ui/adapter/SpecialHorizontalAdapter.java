package com.android.lixiang.yaoganyigou.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.lixiang.yaoganyigou.R;
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean;
import com.android.lixiang.yaoganyigou.ui.fragment.HomeFragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class SpecialHorizontalAdapter extends RecyclerView.Adapter<SpecialHorizontalAdapter.ViewHolder> {

    private List<HomePageUnitsBean.DataBean.PiecesBean> mHorizontalData = new ArrayList<>();
    private Context context;
    private HomeFragment fragment;

    @NonNull
    @Override
    public SpecialHorizontalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_home_horizontal_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SpecialHorizontalAdapter.ViewHolder viewHolder, int i) {
        viewHolder.mTitleTV.setText(mHorizontalData.get(i).getPosTitle());
        viewHolder.mDetailTV.setText(mHorizontalData.get(i).getPosDescription());
        viewHolder.mTagTV.setText(mHorizontalData.get(i).getPosMark());
        Glide.with(context)
                .load(mHorizontalData.get(i).getImageUrl())
                .apply(new RequestOptions()
                        .centerCrop()
                        .placeholder(R.drawable.img_placeholder7))
                .into(viewHolder.mImageIV);
    }

    public SpecialHorizontalAdapter(List<HomePageUnitsBean.DataBean.PiecesBean> data, Context context, HomeFragment fragment) {
        this.mHorizontalData = data;
        this.context = context;
        this.fragment = fragment;
    }

    @Override
    public int getItemCount() {
        return mHorizontalData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        AppCompatImageView mImageIV;
        TextView mTitleTV;
        TextView mDetailTV;
        TextView mTagTV;

        ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            mImageIV = itemView.findViewById(R.id.mImageIV);
            mTitleTV = itemView.findViewById(R.id.mTitleTV);
            mDetailTV = itemView.findViewById(R.id.mDetailTV);
            mTagTV = itemView.findViewById(R.id.mTagTV);
        }

        @Override
        public void onClick(View v) {
//            horizontalClick(mApps, getAdapterPosition());
        }
    }
}
