package com.mi.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mi.R;
import com.mi.utils.CountDownTimerUtils;

/**
 * 注册页面
 *
 * @author shidandan
 */
public class RegisterActivity extends BaseActivity implements View.OnClickListener {
    private Context mContext;
    private EditText mEtPhone;
    private EditText mEtPassword;
    private EditText mEtIdentifyCode;
    private TextView mTvSendIdentifyCode;
    private EditText mEtPromoCode;
    private Button mBtnRegister;
    private TextView mTvProtocol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mContext = this;

        setBottomTitle(getResources().getString(R.string.register));
        showBack(true);
        // 初始化View
        initView();
    }

    /**
     * 初始化View
     */
    private void initView() {
        mEtPhone = findViewById(R.id.et_register_phone);
        mEtPassword = findViewById(R.id.et_register_password);
        mEtIdentifyCode = findViewById(R.id.et_register_identify_code);
        mEtPromoCode = findViewById(R.id.et_register_promo_code);
        mTvSendIdentifyCode = findViewById(R.id.tv_register_send_identify_code);
        mTvSendIdentifyCode.setOnClickListener(this);
        mBtnRegister = findViewById(R.id.btn_register);
        mBtnRegister.setOnClickListener(this);
        mTvProtocol = findViewById(R.id.tv_register_protocol);
        mTvProtocol.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_register_send_identify_code:
                CountDownTimerUtils countDownTimerUtils = new CountDownTimerUtils(60 * 1000, 1000, mTvSendIdentifyCode,
                        R.drawable.register_send_identify_code_selected_shape,
                        R.drawable.register_send_identify_code_common_shape);
                countDownTimerUtils.start();
                break;
            case R.id.btn_register:
                startActivity(new Intent(this, PersonalInfoActivity.class));
                break;
            case R.id.tv_register_protocol:
                break;
            default:
                break;
        }
    }
}
