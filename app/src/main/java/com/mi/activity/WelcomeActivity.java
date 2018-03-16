package com.mi.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mi.R;

/**
 * 欢迎页面
 *
 * @author shidandan
 */

public class WelcomeActivity extends BaseActivity {
    /**
     * 当前上下文
     */
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mContext = this;
    }

    /**
     * 登录
     *
     * @param view view
     */
    public void onClickLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

    /**
     * 注册
     *
     * @param view view
     */
    public void onClickRegister(View view) {
        startActivity(new Intent(this, RegisterActivity.class));
    }
}
