package com.mi.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.mi.R;
import com.mi.entity.ChooseInterestEntity;

import java.util.List;

/**
 * 选择感兴趣的内容
 *
 * @author shidandan
 */

public class ChooseInterestAdapter extends RecyclerView.Adapter<ChooseInterestAdapter.ViewHolder> {
    private Context mContext;
    private List<ChooseInterestEntity> mList;

    /**
     * 构造方法
     *
     * @param context 当前上下文
     * @param list    List
     */
    public ChooseInterestAdapter(Context context, List<ChooseInterestEntity> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycle_item_choose_interest, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        ChooseInterestEntity chooseInterestEntity = mList.get(position);
        holder.mTvInterest.setText(chooseInterestEntity.getInterest());
        Glide.with(mContext).load(chooseInterestEntity.getDrawableRes()).asBitmap().centerCrop().into(new BitmapImageViewTarget(holder.mIvHead) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable circularBitmapDrawable = RoundedBitmapDrawableFactory.create(mContext
                        .getResources(), resource);
                circularBitmapDrawable.setCircular(true);
                holder.mIvHead.setImageDrawable(circularBitmapDrawable);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mIvHead;
        TextView mTvInterest;

        private ViewHolder(View view) {
            super(view);
            mIvHead = view.findViewById(R.id.iv_choose_interest_head);
            mTvInterest = view.findViewById(R.id.tv_choose_interest);
        }
    }
}
