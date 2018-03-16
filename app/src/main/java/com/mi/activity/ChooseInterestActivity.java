package com.mi.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.mi.R;
import com.mi.adapter.ChooseInterestAdapter;
import com.mi.entity.ChooseInterestEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * 选择感兴趣的
 *
 * @author shidandan
 */
public class ChooseInterestActivity extends BaseActivity implements View.OnClickListener {
    private Context mContext;
    private ChooseInterestAdapter mAdapter;
    private List<ChooseInterestEntity> mList = new ArrayList<>();
    private RecyclerView mRvList;
    private Button mBtnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_interest);
        mContext = this;

        setBottomTitle(getResources().getString(R.string.interest));
        showBack(false);
        initView();
    }

    /**
     * 初始化View
     */
    private void initView() {
        mList.add(new ChooseInterestEntity(R.mipmap.head, "社交"));
        mList.add(new ChooseInterestEntity(R.mipmap.head, "美女"));
        mList.add(new ChooseInterestEntity(R.mipmap.head, "色彩"));
        mList.add(new ChooseInterestEntity(R.mipmap.head, "美食"));
        mList.add(new ChooseInterestEntity(R.mipmap.head, "阅读"));
        mList.add(new ChooseInterestEntity(R.mipmap.head, "旅游"));
        mRvList = findViewById(R.id.rv_choose_interest_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRvList.setLayoutManager(layoutManager);
        mAdapter = new ChooseInterestAdapter(mContext, mList);
        mRvList.setAdapter(mAdapter);
        mBtnEnter = findViewById(R.id.btn_choose_interest_enter);
        mBtnEnter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_choose_interest_enter:
                startActivity(new Intent(this, MainActivity.class));
                break;
            default:
                break;
        }
    }
}
