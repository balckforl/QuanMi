package com.mi.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mi.R;

/**
 * 完善个人信息
 *
 * @author shidandan
 */
public class PersonalInfoActivity extends BaseActivity implements View.OnClickListener {
    private Context mContext;
    private ImageView mIvHead;
    private EditText mEtNickName;
    private LinearLayout mLlBirthday;
    private TextView mTvBirthday;
    private LinearLayout mLlSex;
    private TextView mTvSex;
    private Button mBtnNextStep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        mContext = this;

        setBottomTitle(getResources().getString(R.string.personal_information));
        showBack(false);
        initView();
    }

    /**
     * 初始化View
     */
    private void initView() {
        mIvHead = findViewById(R.id.iv_personal_info_head);
        mEtNickName = findViewById(R.id.et_personal_info_nickname);
        mLlBirthday = findViewById(R.id.ll_personal_info_birthday);
        mLlBirthday.setOnClickListener(this);
        mTvBirthday = findViewById(R.id.tv_personal_info_birthday);
        mLlSex = findViewById(R.id.ll_personal_info_sex);
        mLlSex.setOnClickListener(this);
        mTvSex = findViewById(R.id.tv_personal_info_sex);
        mBtnNextStep = findViewById(R.id.btn_personal_info_next);
        mBtnNextStep.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_personal_info_birthday:
                break;
            case R.id.ll_personal_info_sex:
                break;
            case R.id.btn_personal_info_next:
                startActivity(new Intent(this, ChooseInterestActivity.class));
                break;
            default:
                break;
        }
    }
}
