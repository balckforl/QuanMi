package com.mi.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mi.R;

/**
 * 登录页面
 *
 * @author shidandan
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {
    private Context mContext;
    private LinearLayout mLlPasswordLogin;
    private View mViewPasswordLogin;
    private LinearLayout mLlQuickLogin;
    private View mViewQuickLogin;
    private LinearLayout mLlPasswordLayout;
    private EditText mEtTel;
    private EditText mEtPassword;
    private TextView mTvForgetPass;
    private LinearLayout mLlQuickLayout;
    private EditText mEtQuickTel;
    private EditText mEtIdentifyCode;
    private TextView mTvIdentifyCode;
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mContext = this;

        initView();
    }

    /**
     * 初始化View
     */
    private void initView() {
        mLlPasswordLogin = findViewById(R.id.ll_login_password_login);
        mLlPasswordLogin.setOnClickListener(this);
        mViewPasswordLogin = findViewById(R.id.view_password_login);
        mLlQuickLogin = findViewById(R.id.ll_login_quick_login);
        mLlQuickLogin.setOnClickListener(this);
        mViewQuickLogin = findViewById(R.id.view_quick_login);
        // 密码登录
        mLlPasswordLayout = findViewById(R.id.ll_login_password_layout);
        mEtTel = findViewById(R.id.et_login_tel);
        mEtPassword = findViewById(R.id.et_login_password);
        mTvForgetPass = findViewById(R.id.tv_login_forget_password);
        mTvForgetPass.setOnClickListener(this);
        // 快捷登录
        mLlQuickLayout = findViewById(R.id.ll_login_quick_layout);
        mEtQuickTel = findViewById(R.id.et_login_quick_tel);
        mEtIdentifyCode = findViewById(R.id.et_login_identify_code);
        mTvIdentifyCode = findViewById(R.id.tv_login_send_identify_code);
        mTvIdentifyCode.setOnClickListener(this);
        mBtnLogin = findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_login_password_login:
                break;
            case R.id.ll_login_quick_login:
                break;
            case R.id.tv_login_forget_password:
                // 忘记密码
                break;
            case R.id.tv_login_send_identify_code:
                // 发送验证码
                break;
            case R.id.btn_login:
                // 登录
                break;
            default:
                break;
        }
    }
}
