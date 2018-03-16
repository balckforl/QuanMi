package com.mi.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;

import com.mi.R;
import com.mi.fragment.ChatFragment;
import com.mi.fragment.CircleFragment;
import com.mi.fragment.HomeFragment;
import com.mi.fragment.MyFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * MainActivity
 *
 * @author shidandan
 * @time 2018/3/15
 */
public class MainActivity extends BaseActivity implements View.OnClickListener {
    private Context mContext;
    private RadioButton mRbtnHome;
    private RadioButton mRbtnCircle;
    private RadioButton mRbtnChat;
    private RadioButton mRbtnMy;
    private HomeFragment mHomeFragment;
    private ChatFragment mChatFragment;
    private CircleFragment mCircleFragment;
    private MyFragment mMyFragment;
    private List<Fragment> mFragmentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        initData();
        // 初始化View
        initView();
    }

    /**
     * 初始化Data
     */
    private void initData() {
        mHomeFragment = new HomeFragment();
        mCircleFragment = new CircleFragment();
        mChatFragment = new ChatFragment();
        mMyFragment = new MyFragment();
        mFragmentList.add(mHomeFragment);
        mFragmentList.add(mCircleFragment);
        mFragmentList.add(mChatFragment);
        mFragmentList.add(mMyFragment);
        // 初始化Fragment
        FragmentTransaction fragTrans = getSupportFragmentManager().beginTransaction();
        fragTrans.add(R.id.fl_main, mFragmentList.get(0));
        fragTrans.add(R.id.fl_main, mFragmentList.get(1));
        fragTrans.add(R.id.fl_main, mFragmentList.get(2));
        fragTrans.add(R.id.fl_main, mFragmentList.get(3));
        fragTrans.commit();
        showFragment(0);
    }

    /**
     * 初始化View
     */
    private void initView() {
        mRbtnHome = findViewById(R.id.rbtn_main_home);
        mRbtnHome.setChecked(true);
        mRbtnHome.setOnClickListener(this);
        mRbtnCircle = findViewById(R.id.rbtn_main_circle);
        mRbtnCircle.setOnClickListener(this);
        mRbtnChat = findViewById(R.id.rbtn_main_chat);
        mRbtnChat.setOnClickListener(this);
        mRbtnMy = findViewById(R.id.rbtn_main_my);
        mRbtnMy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rbtn_main_home:
                showFragment(0);
                break;
            case R.id.rbtn_main_circle:
                showFragment(1);
                break;
            case R.id.rbtn_main_chat:
                showFragment(2);
                break;
            case R.id.rbtn_main_my:
                showFragment(3);
                break;
            default:
                break;
        }

    }

    /**
     * 显示Fragment
     *
     * @param index 下标
     */
    private void showFragment(int index) {
        int size = mFragmentList.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = mFragmentList.get(i);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            if (index == i) {
                ft.show(fragment);
            } else {
                ft.hide(fragment);
            }
            ft.commit();
        }
    }
}
