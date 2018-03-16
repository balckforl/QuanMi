package com.mi.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharePreferences工具类
 *
 * @author shidandan
 */

public class SpUtils {
    /**
     * SpUtils
     */
    private static SpUtils mInstance;
    /**
     * SharedPreferences
     */
    private SharedPreferences mSharedPreferences;
    /**
     * Editor
     */
    private SharedPreferences.Editor mEditor;

    /**
     * 构造方法
     *
     * @param context  当前上下文
     * @param fileName 文件名
     */
    public SpUtils(Context context, String fileName) {
        mSharedPreferences = context.getSharedPreferences(fileName, Activity.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();
    }

    /**
     * 单例模式
     *
     * @param context  当前上下文
     * @param fileName 文件名
     * @return SpUtils
     */
    public static SpUtils getInstance(Context context, String fileName) {
        if (mInstance == null) {
            synchronized (SpUtils.class) {
                if (mInstance == null) {
                    mInstance = new SpUtils(context, fileName);
                }
            }
        }
        return mInstance;
    }

    /**
     * 存值
     *
     * @param key   键
     * @param value 值
     */
    public void put(String key, Object value) {
        if (value instanceof Integer) {
            mEditor.putInt(key, (Integer) value);
        } else if (value instanceof String) {
            mEditor.putString(key, (String) value);
        } else if (value instanceof Boolean) {
            mEditor.putBoolean(key, (Boolean) value);
        } else if (value instanceof Long) {
            mEditor.putLong(key, (Long) value);
        } else if (value instanceof Float) {
            mEditor.putFloat(key, (Float) value);
        } else {
            if (null == value) {
                mEditor.putString(key, "");
            } else {
                mEditor.putString(key, value.toString());
            }
        }
        mEditor.apply();
    }

    /**
     * 取值
     *
     * @param key      键
     * @param defValue 默认值
     * @return 值
     */
    public Object get(String key, Object defValue) {
        Object value = null;
        if (defValue instanceof Integer) {
            value = mSharedPreferences.getInt(key, (Integer) defValue);
        } else if (defValue instanceof String) {
            value = mSharedPreferences.getString(key, (String) defValue);
        } else if (defValue instanceof Boolean) {
            value = mSharedPreferences.getBoolean(key, (Boolean) defValue);
        } else if (defValue instanceof Long) {
            value = mSharedPreferences.getLong(key, (Long) defValue);
        } else if (defValue instanceof Float) {
            value = mSharedPreferences.getFloat(key, (Float) defValue);
        }
        return value;
    }

    /**
     * 移除键值对
     *
     * @param key 键
     */
    public void remove(String key) {
        mEditor.remove(key);
        mEditor.apply();
    }

    /**
     * 清除所有键值对
     */
    public void clear() {
        mEditor.clear();
        mEditor.apply();
    }
}
