package com.mi.utils;

import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.TextView;

import com.mi.R;

/**
 * 倒计时工具类
 *
 * @author shidandan
 */
public class CountDownTimerUtils extends CountDownTimer {
    private TextView mTextView;
    private Handler mHandler;
    private int mNormalDraw;
    private int mPressedDraw;

    /**
     * 构造方法
     *
     * @param millisInFuture    总时间
     * @param countDownInterval 时间间隔，每个间隔回调一次onTick方法
     * @param tv                TextView
     * @param handler           Handler
     * @param pressedDrawable   按压时背景状态
     * @param normalDrawable    正常时北京状态
     */
    public CountDownTimerUtils(long millisInFuture, long countDownInterval, TextView tv, Handler handler, int
            pressedDrawable, int normalDrawable) {
        super(millisInFuture, countDownInterval);
        this.mTextView = tv;
        this.mHandler = handler;
    }

    /**
     * 构造方法
     *
     * @param millisInFuture    总时间
     * @param countDownInterval 时间间隔，每个间隔回调一次onTick方法
     * @param tv                TextView
     * @param pressedDrawable   按压时背景状态
     * @param normalDrawable    正常时北京状态
     */
    public CountDownTimerUtils(long millisInFuture, long countDownInterval, TextView tv, int pressedDrawable,
                               int normalDrawable) {
        super(millisInFuture, countDownInterval);
        this.mTextView = tv;
        this.mNormalDraw = normalDrawable;
        this.mPressedDraw = pressedDrawable;
    }

    /**
     * 计时过程中
     *
     * @param millisUntilFinished 剩余时间
     */
    @Override
    public void onTick(long millisUntilFinished) {
        // 设置不可点击
        mTextView.setClickable(false);
        // 设置倒计时时间
        mTextView.setText(millisUntilFinished / 1000 + "秒后可重新发送");
        // 设置按钮为灰色，这时是不能点击的
        mTextView.setBackgroundResource(mPressedDraw);
        mTextView.setTextColor(R.color.colorAccent);
    }

    /**
     * 计时完毕
     */
    @Override
    public void onFinish() {
        mTextView.setText("重新获取验证码");
        // 重新获得点击
        mTextView.setClickable(true);
        // 还原背景色
        mTextView.setBackgroundResource(mNormalDraw);
    }
}
