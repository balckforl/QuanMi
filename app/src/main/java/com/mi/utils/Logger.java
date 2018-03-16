package com.mi.utils;

import android.util.Log;

/**
 * 日志统一管理工具类
 *
 * @author shidandan
 */

public class Logger {
    /**
     * 是否debug
     */
    public static boolean mIsDebug = true;
    private static final String TAG = "QuanMi";

    /**
     * 输出DEBUG级别，默认标签的日志
     *
     * @param msg 输出信息
     */
    public static void logD(String msg) {
        logD(TAG, msg);
    }

    /**
     * 输出DEBUG级别，Tag标签的日志
     *
     * @param tag 标签
     * @param msg 输出信息
     */
    public static void logD(String tag, String msg) {
        if (mIsDebug) {
            Log.d(tag, msg);
        }
    }

    /**
     * 输出DEBUG级别，Tag标签的日志
     *
     * @param tag   标签
     * @param msg   输出信息
     * @param cause 异常
     */
    public static void logD(String tag, String msg, Throwable cause) {
        if (mIsDebug) {
            Log.d(tag, msg, cause);
        }
    }

    /**
     * 输出INFO级别，默认标签的日志
     *
     * @param msg 输出信息
     */
    public static void logI(String msg) {
        logI(TAG, msg);
    }

    /**
     * 输出INFO级别，Tag标签的日志
     *
     * @param tag 标签
     * @param msg 输出信息
     */
    public static void logI(String tag, String msg) {
        if (mIsDebug) {
            Log.i(tag, msg);
        }
    }

    /**
     * 输出INFO级别，Tag标签的日志
     *
     * @param tag   标签
     * @param msg   输出信息
     * @param cause 异常
     */
    public static void logI(String tag, String msg, Throwable cause) {
        if (mIsDebug) {
            Log.i(tag, msg, cause);
        }
    }

    /**
     * 输出ERROR级别，默认标签的日志
     *
     * @param msg 输出信息
     */
    public static void logE(String msg) {
        logI(TAG, msg);
    }

    /**
     * 输出ERROR级别，Tag标签的日志
     *
     * @param tag 标签
     * @param msg 输出信息
     */
    public static void logE(String tag, String msg) {
        if (mIsDebug) {
            Log.e(tag, msg);
        }
    }

    /**
     * 输出ERROR级别，Tag标签的日志
     *
     * @param tag   标签
     * @param msg   输出信息
     * @param cause 异常
     */
    public static void logE(String tag, String msg, Throwable cause) {
        if (mIsDebug) {
            Log.e(tag, msg, cause);
        }
    }

    /**
     * 输出VERBOSE级别，默认标签的日志
     *
     * @param msg 输出信息
     */
    public static void logV(String msg) {
        logI(TAG, msg);
    }

    /**
     * 输出VERBOSE级别，Tag标签的日志
     *
     * @param tag 标签
     * @param msg 输出信息
     */
    public static void logV(String tag, String msg) {
        if (mIsDebug) {
            Log.v(tag, msg);
        }
    }

    /**
     * 输出VERBOSE级别，Tag标签的日志
     *
     * @param tag   标签
     * @param msg   输出信息
     * @param cause 异常
     */
    public static void logV(String tag, String msg, Throwable cause) {
        if (mIsDebug) {
            Log.v(tag, msg, cause);
        }
    }
}

