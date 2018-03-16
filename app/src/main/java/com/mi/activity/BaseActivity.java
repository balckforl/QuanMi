package com.mi.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mi.R;

/**
 * BaseActivity
 *
 * @author shidandan
 * @time 2018-03-14
 */

public class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 设置底部标题
     *
     * @param title 标题
     */
    public void setBottomTitle(String title) {
        LinearLayout ll = findViewById(R.id.ll_title_root);
        TextView tvMainTitle = ll.findViewById(R.id.tv_main_title);
        tvMainTitle.setVisibility(View.GONE);
        LinearLayout llLayout = ll.findViewById(R.id.ll_bottom);
        llLayout.setVisibility(View.VISIBLE);
        TextView tvTitle = ll.findViewById(R.id.tv_bottom_title);
        tvTitle.setText(title);
    }

    /**
     * 是否显示返回按钮
     *
     * @param isShowBack 显示
     */
    public void showBack(boolean isShowBack) {
        if (isShowBack) {
            LinearLayout ll = findViewById(R.id.ll_title_root);
            ImageView ivBack = ll.findViewById(R.id.iv_back);
            ivBack.setVisibility(View.VISIBLE);
            ivBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }
}
