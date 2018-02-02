package com.testjcenter.uparpu.testjcenter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.testjcenter.uparpu.testjcenter.R;

import java.util.List;

/**
 * Created by Z on 2017/7/19.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    private Context mContext;
    private List<HomeBean> mData;

    private ItemClickListener mItemClickListener;

    public HomeAdapter(Context context, List<HomeBean> data) {
        mContext = context;
        mData = data;
    }


    public void setItemClickListener(ItemClickListener itemClickListener) {
        mItemClickListener = itemClickListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                mContext).inflate(R.layout.activity_home_item, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.icon.setImageResource(mData.get(position).mImageId);
        holder.title.setText(mData.get(position).mTitle);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeBean homeBean = mData.get(position);
                if (mItemClickListener != null) {
                    mItemClickListener.onClick(homeBean);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MyViewHolder extends ViewHolder {

        ImageView icon;
        TextView title;

        public MyViewHolder(View view) {
            super(view);
            icon = (ImageView) view.findViewById(R.id.item_icon);
            title = (TextView) view.findViewById(R.id.item_text);
        }
    }


    public interface ItemClickListener {
        public void onClick(HomeBean homeBean);
    }
}
