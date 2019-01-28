package com.android.lixiang.yaoganyigou.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.lixiang.base.utils.view.SquareImageView;
import com.android.lixiang.yaoganyigou.R;
import com.android.lixiang.yaoganyigou.presenter.data.bean.HomePageUnitsBean;
import com.android.lixiang.yaoganyigou.ui.fragment.HomeFragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.ViewHolder> {

    private List<HomePageUnitsBean.DataBean.PiecesBean> mListData = new ArrayList<>();
    private Context context;
    private HomeFragment fragment;

    public HomeListAdapter(List<HomePageUnitsBean.DataBean.PiecesBean> data, Context context, HomeFragment fragment) {
        this.mListData = data;
        this.context = context;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_home_list_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.mTitleTV.setText(mListData.get(i).getPosDescription());
        viewHolder.mPriceTV.setText(String.format("¥%s", mListData.get(i).getPrice()));
        viewHolder.mTypeTV.setText(mListData.get(i).getPosTitle());
        Glide.with(context)
                .load(mListData.get(i).getImageUrl())
                .apply(new RequestOptions()
                        .centerCrop()
                        .placeholder(R.drawable.img_placeholder7))
                .into(viewHolder.mImageIV);
    }

    @Override
    public int getItemCount() {
        return mListData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public SquareImageView mImageIV;
        public TextView mTypeTV;
        public TextView mTitleTV;
        public TextView mPriceTV;


        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            mImageIV = itemView.findViewById(R.id.mImageIV);
            mTypeTV = itemView.findViewById(R.id.mTypeTV);
            mTitleTV = itemView.findViewById(R.id.mTitleTV);
            mPriceTV = itemView.findViewById(R.id.mPriceTV);
        }

        @Override
        public void onClick(View v) {
//            guessLikeClick(list, getAdapterPosition());
        }
    }
}
